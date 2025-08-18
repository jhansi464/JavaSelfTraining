package SelfTraining;
import java.util.*;
public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("cat");
        set.add("Dog");
        set.add("Giraffe");
        set.add("Monkey");
        set.add("Dog");
        System.out.println("Set:" +set);
        set.remove("Dog");
        System.out.println("Set" +set);
        System.out.println("Contains: "+ set.contains("cat"));
        System.out.println("Is set Empty: "+set.isEmpty());
        int size =set.size();
        System.out.println("Set size:" +size);
        set.clear();
        System.out.println("Set clear:" +set);
    }
}
