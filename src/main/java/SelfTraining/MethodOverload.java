package SelfTraining;
class Payment{
    void pay(int amount){
        System.out.println("Paying " +amount+ " in cash");
    }
    void pay(String number, int amount){
        System.out.println("Paying " +amount+ " using card" +number);
    }
}
public class MethodOverload {
    public static void main(String[] args) {
        Payment p = new Payment();
        p.pay(250);
        p.pay("12345678",2000);
    }
}

