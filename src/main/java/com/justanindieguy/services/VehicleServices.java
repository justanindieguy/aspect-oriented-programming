package com.justanindieguy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;
import com.justanindieguy.interfaces.Tyres;
import com.justanindieguy.model.Song;

@Component
public class VehicleServices {

  private final Speakers speakers;
  private final Tyres tyres;

  @Autowired
  public VehicleServices(Speakers speakers, Tyres tyres) {
    this.speakers = speakers;
    this.tyres = tyres;
  }

  public String playMusic(boolean vehicleStarted, Song song) {
    return speakers.makeSound(song);
  }

  public String moveVehicle(boolean vehicleStarted) {
    return tyres.rotate();
  }

  public String applyBrake(boolean vehicleStarted) {
    return tyres.stop();
  }

  public Speakers getSpeakers() {
    return speakers;
  }

  public Tyres getTyres() {
    return tyres;
  }

}
