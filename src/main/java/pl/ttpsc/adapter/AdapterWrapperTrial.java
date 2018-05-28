package pl.ttpsc.adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterWrapperTrial
{
    public static void main(String args[]) {
        List<MediaPlayer> mediaPlayerList = new ArrayList<>();
        mediaPlayerList.add(new Mp3Player());
        mediaPlayerList.add(new FormatAdapter(new Mp4Player()));
        mediaPlayerList.add(new FormatAdapter(new VlcPlayer()));
        mediaPlayerList.forEach(mp -> mp.play("test"));
    }
}

interface MediaPlayer{
    void play(String filename);
}

class Mp3Player implements MediaPlayer {
    public void play(String filename) {
        System.out.println("i am playing mp3 " + filename);
    }
}

interface MediaPackage{
    void playFile(String filename);
}

class Mp4Player implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i a playing mp4 " + filename);
    }
}

class VlcPlayer implements MediaPackage {
    public void playFile(String filename) {
        System.out.println("i am playing vlc " + filename);
    }
}

class FormatAdapter implements MediaPlayer {
    public FormatAdapter(MediaPackage mediaPackage) {
        this.mediaPackage = mediaPackage;
    }

    private MediaPackage mediaPackage;


    @Override
    public void play(String filename) {
        mediaPackage.playFile(filename);
    }
}