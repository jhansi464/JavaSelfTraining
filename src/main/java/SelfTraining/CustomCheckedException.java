package SelfTraining;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
public class CustomCheckedException {
    public static void validAge(int age) throws InvalidAgeException{
        if(age<18){
            System.out.println("Age must be above 18");
        }
        else{
            System.out.println("Valid age: "+age);
        }
    }

    public static void main(String[] args) {
        try{
            validAge(15);
        }catch (InvalidAgeException e){
            System.out.println("Caught checked Exception: "+e.getMessage());
        }
    }
}
