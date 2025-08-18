package SelfTraining;
import java.util.*;
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");
        System.out.println("Map: "+map);
        System.out.println("Retrive Map: "+map.get(2));
        map.remove(3);
        System.out.println("After removing: "+map);
        System.out.println("Map contains key or not: " +map.containsKey(1));
        System.out.println("Map contains value or not: "+map.containsValue("Mango"));
        map.replace(2,"Orange");
        System.out.println("After replacing: "+map);
        System.out.println("Map size: "+map.size());
        map.clear();
        System.out.println("After clearing: "+map);
    }
}
