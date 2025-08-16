package SelfTraining;
import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message){
        super(message);
    }
}
public class ATMException {
    private static int balance=5000;
    private static int pin=1234;
    static void withDraw(int amount) throws InsufficientBalanceException{
        if(amount>balance){
            throw new InsufficientBalanceException("withdrawal failed: Insufficient balance");
        }else{
            balance-=amount;
            System.out.println("withdrawal successful! Remaining balance:" +balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter your pin");
            int enteredpin =sc.nextInt();
            if(enteredpin!=pin){
                throw new SecurityException("Invlaid pin! Access Denied ");
            }
            System.out.println("\n 1.check balance\n2.withdraw money\n3.exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Your balance: " +balance);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw");
                    int amount=sc.nextInt();
                    withDraw(amount);
                    break;
                case 3:
                    System.out.println("Thank you for using ATM!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        catch(SecurityException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Something went wrong" +e);
        }
        finally{
            System.out.println("Transaction closed. Please remove your card.");
            sc.close();
        }
    }
}
