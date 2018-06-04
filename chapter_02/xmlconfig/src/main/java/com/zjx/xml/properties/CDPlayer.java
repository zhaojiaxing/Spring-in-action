package com.zjx.xml.properties;
import com.zjx.xml.CompactDisc;
import com.zjx.xml.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer implements MediaPlayer {
  private CompactDisc cd;

  @Autowired
  public void setCd(CompactDisc cd) {
    this.cd = cd;
  }

  public void play() {
    cd.play();
  }

}
