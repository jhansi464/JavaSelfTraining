package SelfTraining;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class BufferedWriterExample {
    public static void main(String[] args) {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("Example.txt",true));
            writer.write("This line is added useing buffer reader");
            writer.close();
            System.out.println("Buffered write completed");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
