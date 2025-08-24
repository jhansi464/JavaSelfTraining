package SelfTraining;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class OperationsonLinkedArrayStackList {
    public static void main(String[] args) {
        System.out.println("!!!  ArrayList  !!!");
        List<Integer> list =new ArrayList<>();
        list.add(10);//Adding elements
        list.add(20);
        list.add(30);
        System.out.println(list);//printing list
        list.add(1,40);//adding element at index
        System.out.println(list);
        System.out.println(list.get(0));//getting the element
        list.set(0,20);//updating element
        System.out.println(list);
        list.remove(0);//removing elment at index
        System.out.println(list);
        System.out.println(list.contains(10));//searching the element
        System.out.println(list.indexOf(40));//gives the index number
        System.out.println(list.size());//gives size of the list
        // using for each to retrive the data(in for each we cant remove data)
        System.out.println("using for each");
        for(Integer num:list){
            System.out.println(num);
        }
        //using iterator to retrive the data(by using iterator we can remove data and it has hasNext(), next()
        System.out.println("using Iterator");
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int num=it.next();
            System.out.println(num);
            if(num==40){
                it.remove();
            }
        }
        System.out.println(list);
        //converting to array
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println("ArrayList to Array: " +Arrays.toString(arr));
        //primitive int array
        int[] arr2=list.stream().mapToInt(i->i).toArray();
        System.out.println("Primitive int Array:" +Arrays.toString(arr2));
        //Array to ArrayList
        Integer[] nums = {100, 200, 300};
        List<Integer> listFromArray2 = new ArrayList<>();
        Collections.addAll(listFromArray2, nums);
        System.out.println("Array to ArrayList (Integer): " + listFromArray2);
        list.clear();//clears the list
        System.out.println("Empty ArrayList: "+list);//prints empty list


        //LinkedList
        System.out.println("!!!   LinkedList    !!!!");
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");//Adding elements
        linkedList.addFirst("Banana");//Adding at first
        linkedList.addLast("Mango");//Adding at last
        linkedList.add("Grapes");
        System.out.println(linkedList.getFirst());//getting first
        System.out.println(linkedList.getLast());//getting last
        linkedList.set(0,"jack");//updating
        linkedList.removeFirst();//removing first
        linkedList.removeLast();//removing last
        linkedList.remove("Mango");//removing element
        System.out.println(linkedList);
        System.out.println(linkedList.contains("Apple"));//search
        System.out.println(linkedList.indexOf("Mango"));//retriving index
        System.out.println(linkedList.size());//size
        linkedList.clear();//clearing the list
        System.out.println("Empty LinkedHashSet: "+linkedList);
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");
        //For each
        System.out.println("using for each");
        for(String s: linkedList){
            System.out.println(s);
        }
        //Iterator
        System.out.println("using Iterator:");
        Iterator<String> itr= linkedList.iterator();
        while(itr.hasNext()){
            String str=itr.next();
            System.out.println(str);
            if(str.equals("Mango")){
                itr.remove();
            }
        }
        System.out.println(linkedList);
        //converting LinkedList to Array(object)
        Object[] arr1 = linkedList.toArray();
        System.out.println("LinkedList to Array:" +Arrays.toString(arr1));
        //converting to typed array
        String[] arr3 =linkedList.toArray(new String[0]);
        System.out.println("LinkedList to String[]:" +Arrays.toString(arr3));
        //Array to LinkedList
        String[] fruits = {"Kiwi", "Orange", "Pineapple"};
        LinkedList<String> listFromArray = new LinkedList<>(Arrays.asList(fruits));
        System.out.println("Array to LinkedList: " + listFromArray);

        //StackList

        System.out.println("!!! Stack !!!");
        Stack<String> stack = new Stack<>();
        stack.push("Apple");//Adding elements
        stack.push("Banana");
        stack.push("Mango");
        stack.push("Grapes");
        System.out.println(stack.peek());//peek
        System.out.println(stack.pop());//pop last element
        System.out.println(stack);
        System.out.println(stack.isEmpty());//checks empty or not
        System.out.println(stack.search("Apple"));//search
        System.out.println(stack.size());//size
        //For each
        System.out.println("Using for each");
        for(String s1:stack){
            System.out.println(s1);
        }
        //Iterator
        System.out.println("Using Iterator");
        Iterator<String> it1 = stack.iterator();
        while(it1.hasNext()){
            String s2= it1.next();
            System.out.println(s2);
            if(s2.equals("Apple")){
                it1.remove();//removes using iterator
            }
        }
        System.out.println(stack);
        //Stack to Array

        String[] stackArr =stack.toArray(new String[0]);
        System.out.println("Stack to Array:" +Arrays.toString(stackArr));
        //Array to stack
        String[] colors = {"Red", "Green", "Blue"};
        Stack<String> stackFromArray = new Stack<>();
        Collections.addAll(stackFromArray, colors);
        System.out.println("Array to Stack: " + stackFromArray);
        stack.clear();//clears
        System.out.println("Empty stack: "+stack);
    }
}
