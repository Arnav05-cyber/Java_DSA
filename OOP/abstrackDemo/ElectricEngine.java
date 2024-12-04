package OOP.abstrackDemo;

import OOP.Interfaces.Engine;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("I start as a electric engine");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a electric engine");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate as a electric engine");
    }
}
