package SelfTraining;
class Vehicle{
    void start(){
        System.out.println("Starting vehicle");
    }
}
class Car extends Vehicle{
    @Override
    void start() {
        System.out.println("Starting car with key");
    }
}
class Bike extends Vehicle{
    @Override
    void start() {
        System.out.println("Starting bike with kick");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2= new Bike();
        v1.start();
        v2.start();
    }
}

