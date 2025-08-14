package SelfTraining;
class Bank1{
    private double balance;
    public double getBalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited:" +amount);
        }
        else{
            System.out.println("Amount must be in positive");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdraw amount:" +amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
}
public class Encapsulationrealex {
    public static void main(String[] args) {
        Bank1 b = new Bank1();
        b.deposit(10000);
        System.out.println("Current Balance: "+b.getBalance());
        b.withdraw(5000);
        System.out.println("Current Balance: "+b.getBalance());
        b.withdraw(60000);
    }
}
