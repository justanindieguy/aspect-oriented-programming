package com.justanindieguy.services;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;
import com.justanindieguy.interfaces.Tyres;
import com.justanindieguy.model.Song;

@Component
public class VehicleServices {

  private Logger logger = Logger.getLogger(VehicleServices.class.getName());

  private final Speakers speakers;
  private final Tyres tyres;

  @Autowired
  public VehicleServices(Speakers speakers, Tyres tyres) {
    this.speakers = speakers;
    this.tyres = tyres;
  }

  public String playMusic(boolean vehicleStarted, Song song) {
    Instant start = Instant.now();
    logger.info("method execution start");
    String music = null;

    if (vehicleStarted) {
      music = speakers.makeSound(song);
    } else {
      logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
    }

    logger.info("method execution end");
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    logger.info("Time took to execute the method: " + timeElapsed);

    return music;
  }

  public String moveVehicle(boolean vehicleStarted) {
    Instant start = Instant.now();
    logger.info("method execution start");
    String status = null;

    if (vehicleStarted) {
      status = tyres.rotate();
    } else {
      logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
    }

    logger.info("method execution end");
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    logger.info("Time took to execute the method: " + timeElapsed);

    return status;
  }

  public String applyBrake(boolean vehicleStarted) {
    Instant start = Instant.now();
    logger.info("method execution start");
    String status = null;

    if (vehicleStarted) {
      status = tyres.stop();
    } else {
      logger.log(Level.SEVERE, "Vehicle not started to perform the operation");
    }

    logger.info("method execution end");
    Instant finish = Instant.now();
    long timeElapsed = Duration.between(start, finish).toMillis();
    logger.info("Time took to execute the method: " + timeElapsed);

    return status;
  }

  public Speakers getSpeakers() {
    return speakers;
  }

  public Tyres getTyres() {
    return tyres;
  }

}
