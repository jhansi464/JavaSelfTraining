package SelfTraining;
import java.util.*;
public class OperationsOnHashLinkedTreemap {
    public static void main(String[] args) {
        Map<Integer,String> hashmap =new HashMap<>();
        hashmap.put(1,"Apple");
        hashmap.put(2,"Mango");
        hashmap.put(3,"Banana");
        hashmap.put(4,"Apple");
        System.out.println("After adding hashMap: "+hashmap);
        System.out.println("Elements contains or not: "+hashmap.containsKey(4));
        System.out.println("Value of: "+hashmap.get(1));
        System.out.println("Using For-Each");
        for(Integer key:hashmap.keySet()){
            System.out.println("Key: "+key +" Value: "+hashmap.get(key));
        }
        System.out.println("Using Iterator");
        Iterator<Integer> keyit = hashmap.keySet().iterator();
        while(keyit.hasNext()){
            Integer key = keyit.next();
            System.out.println("Key: " +key+" value: "+hashmap.get(key));
        }
        hashmap.clear();
        System.out.println("Empty hashMap:" +hashmap);

        System.out.println("!!!   LinkedHashMap   !!!");
        Map<Integer,String> linked = new LinkedHashMap<>();
        linked.put(1,"Apple");
        linked.put(2,"Mango");
        linked.put(3,"Banana");
        linked.put(4,"Apple");
        System.out.println("After adding linkedHashMap: "+linked);
        System.out.println("Contains or not: "+linked.containsKey(1));
        System.out.println("After removing: "+linked.remove(2));
        System.out.println("value of 1:" +linked.get(1));
        System.out.println("Using For-Each");
        for(Integer key1: linked.keySet()){
            System.out.println("Key: "+key1+" Value:" +linked.get(key1));
        }
        System.out.println("Using Iterator");
        Iterator<Integer> key1it = linked.keySet().iterator();
        while(key1it.hasNext()){
            Integer k = key1it.next();
            System.out.println("Key: "+k+ " Value:" +linked.get(k));
        }
        linked.clear();
        System.out.println("Empty LinkedHashMap: "+linked);
        System.out.println("!!!   TreeMap   !!!");
        Map<Integer,String> tree =new TreeMap<>();
        tree.put(1,"Apple");
        tree.put(2,"Mango");
        tree.put(3,"Banana");
        tree.put(4,"Apple");
        System.out.println("After Adding hashmap: "+tree);
        System.out.println("After removing: "+tree.remove(2));
        System.out.println("Contains or not:" +tree.containsKey(1));
        System.out.println("Value of 1: "+tree.get(1));
        System.out.println("Using For-Each");
        for(Integer k2 : tree.keySet()){
            System.out.println("Key:" +k2 +" Value:"+tree.get(k2));
        }
        System.out.println("Using Iterator");
        Iterator<Integer> kit = tree.keySet().iterator();
        while(kit.hasNext()){
            Integer k3= kit.next();
            System.out.println("Key: "+k3 +" Value: "+tree.get(k3));
        }
        tree.clear();
        System.out.println("Empty TreeMap:" +tree);
    }
}
