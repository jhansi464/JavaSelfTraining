package SelfTraining;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class WriteToFileExample {
    public static void main(String[] args) {
        try{
            FileWriter fileWriter=new FileWriter("Example.tx",false);
            fileWriter.write("Hello this is Java!.\n");
            fileWriter.write("This is Raji");
            fileWriter.close();
            System.out.println("File Written Successfully");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
