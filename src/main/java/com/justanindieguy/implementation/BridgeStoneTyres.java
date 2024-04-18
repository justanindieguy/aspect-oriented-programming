package com.justanindieguy.implementation;

import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres {

  @Override
  public String rotate() {
    return "Vehicle moving with the help of Bridge Stone tyres";
  }

  @Override
  public String stop() {
    return "Vehicle stopped with the help of Bridge Stone tyres";
  }

}
