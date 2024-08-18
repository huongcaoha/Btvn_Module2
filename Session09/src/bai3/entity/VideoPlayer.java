package bai3.entity;

import bai3.myInterface.Playable;

public class VideoPlayer implements Playable {
    public VideoPlayer() {
    }

    @Override
    public void play() {
        System.out.println("Đang phát Video …");
    }
}
