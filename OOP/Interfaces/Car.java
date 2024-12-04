package OOP.Interfaces;

public class Car implements Engine,Brake,MediaPlayer{

    @Override
    public void start() {
        System.out.println("I start engine as a normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop as a normal car");
    }

    @Override
    public void acc() {
        System.out.println("I accelarate as a normal car");
    }

    @Override
    public void brake() {
        System.out.println("I brake as a normal car");
    }


}
