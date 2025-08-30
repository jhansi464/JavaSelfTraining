package SelfTraining;
import java.io.*;

// Custom exception for business rule
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

public class Exception1 {

    // Method simulates reading user data from a file (Checked Exception)
    public static String readUserFile(String filename) throws IOException {
        FileReader fr = new FileReader(filename);  // may throw IOException
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        br.close();  // resource cleanup
        return line;
    }

    // Method simulates withdrawal (Custom + Unchecked example)
    public static void withdraw(double balance, double amount) throws LowBalanceException {
        if (amount > balance) {
            throw new LowBalanceException("Insufficient balance!");  // custom exception
        }
        // Unchecked example: division by zero if amount is 0 (just for demonstration)
        if (amount == 0) {
            int x = 10 / 0;  // ArithmeticException
        }
        System.out.println("Withdrawal successful: " + amount);
    }

    public static void main(String[] args) {
        double balance = 5000;

        try {
            // Checked Exception
            String user = readUserFile("user.txt");
            System.out.println("User data: " + user);

            // Custom + Unchecked Exceptions
            withdraw(balance, 6000);  // throws LowBalanceException
            withdraw(balance, 0);     // will throw ArithmeticException

        }
        catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
        catch (LowBalanceException e) {
            System.out.println("Business Exception: " + e.getMessage());
        }
        catch (ArithmeticException e) {
            System.out.println("Runtime Exception: " + e.getMessage());
        }
        finally {
            System.out.println("Thank you for using our banking service!");
        }
    }
}
