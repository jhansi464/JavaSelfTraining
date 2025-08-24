package SelfTraining;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class CheckedException {
    static void readFile() throws IOException{
        FileReader fr =new FileReader("test.txt");
        BufferedReader br=new BufferedReader(fr);
        System.out.println("File content: "+br.readLine());
        br.close();
    }

    public static void main(String[] args) {
        try{
            readFile();
        }catch(IOException e){
            System.out.println("Caught Exception: "+e.getMessage());
        }
    }
}
