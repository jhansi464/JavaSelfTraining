package SelfTraining;
interface paymentGateway{
    void pay(double amount);
}
class payPal implements paymentGateway{
    public void pay(double amount){
        System.out.println("Paying "+amount+" via paypal");
    }
}
class stripe implements paymentGateway{
    public void pay(double amount){
        System.out.println("Paying " +amount+ " via stripe");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        paymentGateway p = new payPal();
        p.pay(1500);
        p= new stripe();
        p.pay(2000);

    }
}

