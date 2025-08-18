package ConditionalStatements;

public class ForLoop {
    public static void main(String[] args) {
        //we have infinite and finite loop
        //finite loop: is a loop that has start and end
        //infinite loop: is a loop that has no end because no condition or break is being declared or set
        int i=1;
        while(i<=4){
            System.out.println("Hi "+i);
            i++;//increment
        }
        for(int j=1; j<=4;j++){//increment
            System.out.println("Hi! you are highly to the for loop exploration. "+j);
        }
        //decrement
        for(int k=4;k>=1;k--){
            System.out.println("Thank you for your time." +k);
        }
    }
}
