package ConditionalStatements;

public class IfElseIf {
    public static void main(String[] args) {
        int x=8;//intializing a variable declaration
        int y=17;
        int z=6;
        //checking greatest value b/w 3 values
        //setting our conditions
        if(x>y && x>z){
            System.out.println("The greatest value x:" +x);
        }
        else if(y > z && y > x){
            System.out.println("The greatest number is y: "+y);
        }
        else{
            System.out.println("The greatest number is z: " +z);
        }
    }
}
