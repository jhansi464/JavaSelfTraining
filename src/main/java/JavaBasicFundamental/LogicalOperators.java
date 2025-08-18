package JavaBasicFundamental;

public class LogicalOperators {
    public static void main(String[] args) {
        int x = 3;
        int y = 2;
        int a = 4;
        int b = 5;
        boolean result = x > y && a > b;
        System.out.println(result);
        boolean result1 = x > y || a > b;
        System.out.println(result1);
        boolean result2 = x > y || a < b || a > 1;
        System.out.println(result2);
        boolean result3 = x > y != y > b;
        System.out.println(result3);
    }
}
