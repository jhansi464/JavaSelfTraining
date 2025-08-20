package SelfTraining;
import java.util.*;
public class mapForeachComparison {
    public static void main(String[] args) {
        Map<Integer, String> hashmap = new HashMap<>();
        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        Map<Integer,String> treeMap = new TreeMap<>();
        //HashMap
        hashmap.put(20,"Apple");
        hashmap.put(10,"Mango");
        hashmap.put(40,"Banana");
        hashmap.put(30,"Grapes");
        //LinkedHashMap
        linkedHashMap.put(20,"Apple");
        linkedHashMap.put(10,"Mango");
        linkedHashMap.put(40,"Banana");
        linkedHashMap.put(30,"Grapes");
        //TreeMap
        treeMap.put(20,"Apple");
        treeMap.put(10,"Mango");
        treeMap.put(40,"Banana");
        treeMap.put(30,"Grapes");

        System.out.println("Hash Map forEach");
        hashmap.forEach((k,v) -> System.out.println(k+ "->"+v));

        System.out.println("LinkedHashMap forEach");
        linkedHashMap.forEach((k,v) -> System.out.println(k +"->" +v));

        System.out.println("TreeMap forEach");
        treeMap.forEach((k,v) -> System.out.println(k +"->" +v));
    }
}
