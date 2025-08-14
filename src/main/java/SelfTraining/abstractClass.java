package SelfTraining;

abstract class Bank{
    abstract void openAccount();
    void bankServices(){
        System.out.println("Providing bank services");
    }
}
class SBI extends Bank{
    void openAccount(){
        System.out.println("Opening SBI Account");
    }
}
public class abstractClass {
    public static void main(String[] args) {
        Bank b= new SBI();
        b.bankServices();
        b.openAccount();
    }
}
