package SelfTraining;
import java.util.*;
import java.util.LinkedHashSet;

public class OperationsOnHashLinkedhashTreeset {
    public static void main(String[] args) {
        Set<String> hashset = new HashSet<>();
        hashset.add("Apple");
        hashset.add("Banana");
        hashset.add("Mango");
        hashset.add("Grapes");
        System.out.println("After adding hashSet:" +hashset);
        hashset.remove("Banana");
        System.out.println("After removing:" +hashset);
        System.out.println("Contains or not: "+hashset.contains("Mango"));
        System.out.println("Using For-Each:");
        for(String s:hashset){
            System.out.println(s);
        }
        System.out.println("Using Iterator:");
        Iterator<String> it = hashset.iterator();
        while(it.hasNext()){
            String s1= it.next();
            System.out.println(s1);
            if(s1.equals("Mango")){
                it.remove();
            }
        }
        System.out.println("After removing with iterator:"  +hashset);
        //conversions(obj array)
        Object[] obj = hashset.toArray();
        System.out.println("Set[] to Array:" +Arrays.toString(obj));
        //Typed Array
        String[] strArr =hashset.toArray(new String[0]);
        System.out.println("Set[] to String[]:"+Arrays.toString(strArr));
        //Array -> set
        String[] fruits = {"Apple", "Banana", "Mango", "Apple"}; // duplicates
        Set<String> setFromArray = new HashSet<>(Arrays.asList(fruits));
        System.out.println("Array to Set: " + setFromArray);
        hashset.clear();
        System.out.println("Empty hashset:" +hashset);

        //LinkedHashSet

        System.out.println("!!!  LinkedHashSet  !!!");
        Set<String> linkedHashset=new LinkedHashSet<>();
        linkedHashset.add("Apple");
        linkedHashset.add("Banana");
        linkedHashset.add("Mango");
        linkedHashset.add("Grapes");
        System.out.println("LinkedHashSet after Adding:" +linkedHashset);
        linkedHashset.remove("Mango");
        System.out.println("After removing:" +linkedHashset);
        System.out.println("Element contains or not: "+linkedHashset.contains("Apple"));
        System.out.println("Using for each");
        for(String str:linkedHashset){
            System.out.println(str);
        }
        Iterator<String> it1 = linkedHashset.iterator();
        while(it.hasNext()){
            String s1= it1.next();
            System.out.println(s1);
            if(s1.equals("Apple")){
                it1.remove();
            }
        }
        //conversions(Set->array)
        String[] linkedArr = linkedHashset.toArray(new String[0]);
        System.out.println("LinkedHashSet to Array: "+Arrays.toString(linkedArr));
        //Array->set
        Set<String> linked = new LinkedHashSet<>(Arrays.asList(fruits));
        System.out.println("Array to LinkedList: "+linked);
        linkedHashset.clear();
        System.out.println("Empty Linkedhashset: "+linkedHashset);

        //TreeSet

        System.out.println("!!! TreeSet  !!!");
        Set<String> treeset = new TreeSet<>();
        treeset.add("Apple");
        treeset.add("Banana");
        treeset.add("Mango");
        treeset.add("Grapes");
        System.out.println("After adding treeset: "+treeset);
        treeset.remove("Mango");
        System.out.println("After removing: "+treeset);
        System.out.println("Element contains or not: "+treeset.contains("Apple"));
        System.out.println("Using for each");
        for(String s2:treeset){
            System.out.println(s2);
        }
        System.out.println("Using Iterator");
        Iterator<String> it2 = treeset.iterator();
        while(it2.hasNext()){
            String str = it2.next();
            System.out.println(str);
            if(str.equals("Apple")){
                it2.remove();
            }
        }
        System.out.println(treeset);
        //Conversions set-> array
        String[] treearr= treeset.toArray(new String[0]);
        System.out.println("Set to array: "+Arrays.toString(treearr));
        //Array to treeset
        Set<String> treeSet=new TreeSet<>(Arrays.asList(fruits));
        System.out.println("Array to TreeSet: "+treeSet);
        treeset.clear();
        System.out.println("Empty TreeSet: "+treeset);
    }
}
