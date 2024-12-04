package OOP.abstrackDemo;

import OOP.Interfaces.Engine;

public class NiceCar {
    private Engine engine;
    private CDPlayer cd = new CDPlayer();

    public NiceCar(){
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void MUSICStart(){
        cd.start();
    }

    public void MUSICStop(){
        cd.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }
}
