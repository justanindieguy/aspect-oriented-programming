package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.config.ProjectConfig;
import com.justanindieguy.model.Song;
import com.justanindieguy.services.VehicleServices;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    var vehicleServices = context.getBean(VehicleServices.class);
    System.out.println(vehicleServices.getClass());

    Song song = new Song();
    song.setTitle("Body Paint");
    song.setArtistName("Arctic Monkeys");

    boolean vehicleStarted = true;
    String moveVehicleStatus = vehicleServices.moveVehicle(vehicleStarted);
    String playMusicStatus = vehicleServices.playMusic(vehicleStarted, song);
    String applyBrakeStatus = vehicleServices.applyBrake(vehicleStarted);
  }

}
