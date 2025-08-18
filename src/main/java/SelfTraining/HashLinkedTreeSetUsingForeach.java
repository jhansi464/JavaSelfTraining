package SelfTraining;
import java.util.*;
import java.util.LinkedHashSet;

public class HashLinkedTreeSetUsingForeach {
    public static void main(String[] args) {
        Set<String> HashSet = new HashSet<>();
        Set<String> LinkedHashSet=new LinkedHashSet<>();
        Set<String> TreeSet = new TreeSet<>();
        //HashSet
        HashSet.add("Apple");
        HashSet.add("Banana");
        HashSet.add("Mango");
        //LinkedSet
        LinkedHashSet.add("Apple");
        LinkedHashSet.add("Banana");
        LinkedHashSet.add("Mango");
        //TreeSet
        TreeSet.add("Apple");
        TreeSet.add("Banana");
        TreeSet.add("Mango");
        System.out.println("\nHashSet Elements:");
        for(String item : HashSet){
            System.out.println(item);
        }
        System.out.println("\nLinkedHashSet Elements:");
        for(String item: LinkedHashSet){
            System.out.println(item);
        }
        System.out.println("\nTreeSet Elements: ");
        for(String item: TreeSet){
            System.out.println(item);
        }
    }
}
