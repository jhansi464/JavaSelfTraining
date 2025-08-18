package SelfTraining;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list =new LinkedList<>();
        list.push("Apple");
        list.push("Banana");
        list.push("Orange");
        list.push("Grape");
        System.out.println("List" +list);
        System.out.println("First element: "+list.getFirst());
        System.out.println("Last element: "+list.getLast());
        String top = list.pop();
        System.out.println("Stack after pop: "+top);
    }
}
