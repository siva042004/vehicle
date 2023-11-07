
public class Main {
    public static void main(String[] args) {
        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        car.start();
        motorcycle.start();
        car.stop();
        motorcycle.stop();

    }
}

interface Vehicle{
    void start();
    void stop();

}

class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Motorcycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Motorcycle started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }
}
