package studentmanagementsystemupdated;
import java.util.*;

// 1. Generic Class
class Box<T> {
    private T value;
    public void set(T value) {
        this.value = value;
    }
    public T get() {
        return value;
    }
}

// 2. Bounded Type Example
class Calculator<T extends Number> {
    private T num1, num2;
    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

// 3. Generic Interface
interface Container<T> {
    void add(T item);
    T get();
}

class StringContainer implements Container<String> {
    private String value;
    public void add(String item) {
        value = item;
    }
    public String get() {
        return value;
    }
}

class IntegerContainer implements Container<Integer> {
    private Integer value;
    public void add(Integer item) {
        value = item;
    }
    public Integer get() {
        return value;
    }
}

// Main Class
public class GenericsCode {

    // Generic Method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Wildcard Example
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Generic Class
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println("Generic Class (Integer): " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Raji");
        System.out.println("Generic Class (String): " + strBox.get());

        // Generic Method
        Integer[] intArr = {1, 2, 3, 4};
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("\nGeneric Method (Integer Array):");
        printArray(intArr);
        System.out.println("Generic Method (String Array):");
        printArray(strArray);

        // Bounded Type
        Calculator<Integer> calInt = new Calculator<>(10, 20);
        System.out.println("\nBounded Type (Integer): " + calInt.add());

        Calculator<Double> dCal = new Calculator<>(10.5, 20.5);
        System.out.println("Bounded Type (Double): " + dCal.add());

        // Generic Interface
        Container<String> sc1 = new StringContainer();
        sc1.add("Generic Interface with String");
        System.out.println("\nGeneric Interface (String): " + sc1.get());

        Container<Integer> ic1 = new IntegerContainer();
        ic1.add(999);
        System.out.println("Generic Interface (Integer): " + ic1.get());

        // Wildcards
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("D", "E", "F");
        System.out.println("\nWildcard (Integer List):");
        printList(intList);
        System.out.println("Wildcard (String List):");
        printList(strList);
    }
}
