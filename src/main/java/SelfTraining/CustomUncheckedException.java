package SelfTraining;
class NegativeNumberException extends RuntimeException{
    public NegativeNumberException(String message){
        super(message);
    }
}
public class CustomUncheckedException {
    public static void checkNumber(int num){
        if(num<0){
            throw new NegativeNumberException("Number cannot be -ve");
        }
        System.out.println("Valid num:"+num);
    }

    public static void main(String[] args) {
        checkNumber(-5);
        System.out.println("Program continues");
    }
}
