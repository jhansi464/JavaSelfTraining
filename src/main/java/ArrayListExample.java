import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add("Apple");
        list.add("Grape");
        System.out.println("List" +list);
        Collections.sort(list);
        System.out.println("Sorted List" +list);
        System.out.println("Index 0: "+list.get(0));
        System.out.println("Index 2: " +list.get(0));
    }
}
