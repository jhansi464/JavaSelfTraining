package SelfTraining;

class cars{
    String brand;
    String color;
    int speed;
    void displayInfo(){
        System.out.println("Brand: "+brand+ ", color: "+color+", speed: "+speed );
    }
}
public class ClassesAndObjects {
    public static void main(String[] args) {
        cars c1 = new cars();
        c1.brand="BMW";
        c1.color="RED";
        c1.speed=120;
        c1.displayInfo();
        cars c2= new cars();
        c2.brand="Tesla";
        c2.color="Blue";
        c2.speed=150;
        c2.displayInfo();
    }
}
