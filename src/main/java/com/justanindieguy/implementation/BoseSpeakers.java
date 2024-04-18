package com.justanindieguy.implementation;

import org.springframework.stereotype.Component;

import com.justanindieguy.interfaces.Speakers;
import com.justanindieguy.model.Song;

@Component
public class BoseSpeakers implements Speakers {

  @Override
  public String makeSound(Song song) {
    return "Now playing " + song.getTitle() + " by "
        + song.getArtistName() + " with Bose Speakers";
  }

}
