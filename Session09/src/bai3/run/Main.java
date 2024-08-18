package bai3.run;

import bai3.entity.AudioPlayer;
import bai3.entity.VideoPlayer;
import bai3.myInterface.Playable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Playable> arr = new ArrayList<>();

        AudioPlayer audioPlayer = new AudioPlayer();
        arr.add(audioPlayer);

        VideoPlayer videoPlayer = new VideoPlayer();
        arr.add(videoPlayer);

        for(Playable p : arr){
            p.play();
        }
    }
}
