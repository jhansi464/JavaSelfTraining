package ConditionalStatements;

public class ifElse {
    public static void main(String[] args){
        int x=18;//intializing variavle
        if(x>18){//setting condition
            System.out.println("Welcome to today's class");
        }
        else{
            System.out.println("Good bye we are done for today");
        }
        int y=12;
        if(x>19 && y<=20){
            System.out.println("Goodbye");
        }
        else{
            System.out.println("Welcome home");
        }
        //check greatest number b/w x and y
        if(x>y){
            System.out.println("The greatest number is: " +x);
        }
        else{
            System.out.println("The greatest number si: "+y);
        }
    }
}
