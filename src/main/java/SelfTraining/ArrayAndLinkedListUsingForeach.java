package SelfTraining;
import java.util.*;
public class ArrayAndLinkedListUsingForeach {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("ArrayList Elements: ");
        for(int num : list){
            System.out.println(num);
        }
        System.out.println("LinkedList Elements: ");
        for(int num : linkedList){
            System.out.println(num);
        }
    }
}
