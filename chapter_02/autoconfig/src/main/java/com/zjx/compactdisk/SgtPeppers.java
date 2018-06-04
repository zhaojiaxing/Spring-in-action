package com.zjx.compactdisk;

import org.springframework.stereotype.Component;

/**
 * CompactDisk的实现类
 * Created by zjx on 2018/6/2.
 */
@Component
public class SgtPeppers implements CompactDisk{

    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
