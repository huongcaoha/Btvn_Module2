package bai3.entity;

import bai3.myInterface.Playable;

public class AudioPlayer implements Playable {
    public AudioPlayer() {
    }

    @Override
    public void play() {
        System.out.println("Đang phát Audio …");
    }
}
