package OOP.abstrackDemo;


import OOP.Interfaces.MediaPlayer;

public class CDPlayer implements MediaPlayer {
    @Override
    public void start() {
        System.out.println("Music Start");
    }

    @Override
    public void stop() {
        System.out.println("Music Stop");
    }


}
