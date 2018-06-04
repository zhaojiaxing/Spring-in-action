package com.zjx.compactdisk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zjx on 2018/6/3.
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisk cd;

    @Autowired
    public CDPlayer(CompactDisk cd){
        this.cd = cd;
    }
    @Override
    public void play() {
        cd.play();
    }
}
