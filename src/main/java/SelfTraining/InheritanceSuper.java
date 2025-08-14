package SelfTraining;
class Account{
    String accountHolder;
    double balance;
    public Account(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }
    void displayInfo(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Balance: "+balance);
    }
}
class SavingsAccount extends Account{
    double interestRate;
    public SavingsAccount(String accountHolder, double balance, double interestRate){
        super(accountHolder,balance);
        this.interestRate=interestRate;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Interest Rate: "+interestRate);
    }
    void calculateInterest(){
        double interest=(balance*interestRate)/100;
        System.out.println("Interest Earned: "+interest);
    }
}
public class InheritanceSuper {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("Raji", 10000,3.5);
        s.displayInfo();
        s.calculateInterest();
    }
}