package com.justanindieguy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {

  private String name;
  private final VehicleServices vehicleServices;

  @Autowired
  public Vehicle(VehicleServices vehicleServices) {
    this.vehicleServices = vehicleServices;
  }

  @PostConstruct
  public void initialize() {
    name = "Honda";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VehicleServices getVehicleServices() {
    return vehicleServices;
  }

  @Override
  public String toString() {
    return "Vehicle [name=" + name + "]";
  }

}
