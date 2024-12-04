package OOP.abstrackDemo;

import OOP.Interfaces.Engine;

public class PowerEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I start as an power Engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a power engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate as a power engine");
    }
}
