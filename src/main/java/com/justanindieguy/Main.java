package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.config.ProjectConfig;
import com.justanindieguy.model.Song;
import com.justanindieguy.services.VehicleServices;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    VehicleServices vehicleServices = context.getBean(VehicleServices.class);
    boolean vehicleStarted = false;

    Song song = new Song();
    song.setArtistName("Arctic Monkeys");
    song.setTitle("Body Paint");
    String music = vehicleServices.playMusic(vehicleStarted, song);
    System.out.println(music);

    String status = null;
    status = vehicleServices.moveVehicle(vehicleStarted);
    System.out.println(status);
    status = vehicleServices.applyBrake(vehicleStarted);
    System.out.println(status);
  }

}
