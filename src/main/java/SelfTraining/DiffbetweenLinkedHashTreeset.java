package SelfTraining;
import java.util.*;
import java.util.LinkedHashSet;

public class DiffbetweenLinkedHashTreeset {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        Set<String> LinkedSet = new LinkedHashSet<>();
        Set<String> TreeSet = new TreeSet<>();
        System.out.println(" HashSet Stores unorder");
        set.add("Cat");
        set.add("Dog");
        set.add("Monkey");//stores normally
        set.add("Giraffe");
        System.out.println("Hash Set:"+set);
        //LinkedHashSet
        /* diff
        HashSet is used for uniqueness and has no order
        LinkedHashSet is used for uniqueness + order of insertion and stores as user specifies
        TreeSet stores in sorted ordered
         */
        System.out.println("LinkedSet stores in insertion order");
        LinkedSet.add("Cat");//stores in inserted order
        LinkedSet.add("Dog");
        LinkedSet.add("Monkey");
        LinkedSet.add("Giraffe");
        System.out.println("LinkedHashSet: "+LinkedSet);
        //TreeSet
        System.out.println("TreeSet stores data in sorted data");
        TreeSet.add("Cat");//stores in sorting order
        TreeSet.add("Dog");
        TreeSet.add("Monkey");
        TreeSet.add("Giraffe");
        System.out.println("TreeSet: "+TreeSet);
    }
}
