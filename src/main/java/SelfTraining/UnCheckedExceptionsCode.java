package SelfTraining;

public class UnCheckedExceptionsCode {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println("Result: "+a);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception" +e.getMessage());
        }
        //NullPointerException
        try{
            String str=null;
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.out.println("Caught Exception" +e.getMessage());
        }
        try{
            int[] arr={1,2,3};
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Caught Exception" +e.getMessage());
        }
        try{
            int num=Integer.parseInt("ABC");
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Caught Exception" +e.getMessage());
        }
    }
}
