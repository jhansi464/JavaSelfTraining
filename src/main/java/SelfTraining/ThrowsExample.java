package SelfTraining;

public class ThrowsExample {
    static void checkFile() throws java.io.IOException{
        java.io.FileReader file = new java.io.FileReader("Test.txt");
        System.out.println("File opend successfully");
    }

    public static void main(String[] args) {
        try{
            checkFile();

        }catch(java.io.IOException e){
            System.out.println("Error: file not found ");
        }
    }
}
