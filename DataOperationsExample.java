// File: DataOperationsExample.java
import java.util.Scanner;

public class DataOperationsExample {
    public static void main(String[] args) {
        // === Your DataOps code integrated ===
        System.out.println("Data Operations:");
        System.err.println("_________________________________");
        System.out.println("Arithmetic operations:");
        System.out.println("Addition operator: 100 + 100 = " + (100 + 100));
        System.out.println("Subtract operator: 100 - 100 = " + (100 - 100));
        System.out.println("Multiply operator: 10 * 10 = " + (10 * 10));
        System.out.println("Division operator: 100/10 = " + (100 / 10));
        System.out.println("Modulo operator: 99 % 10 = " + (99 % 10));

        int inc = 99;
        System.out.println("Increment operator: inc = 99; inc++ = " + (inc++));

        int dec = 101;
        System.out.println("Increment operator: dec = 101; dec-- = " + (dec--));

        System.out.println("_________________________________");
        System.out.println("Relational Operations:");
        System.out.println("Is equal to: 100 == 100: " + (100 == 100));
        System.out.println("Is not equal to: 10 != 100: " + (10 != 100));
        System.out.println("Is greater than: 100>10 : " + (100 > 10));
        System.out.println("Is less than: 10<100 : " + (10 < 100));
        System.out.println("Is Greater than Equal to: 101>=100 : " + (101 >= 100));
        System.out.println("Is less than or equal to: 100 <= 100 : " + (100 <= 100));

        System.out.println("_________________________________");
        System.out.println("Logical operations:");
        System.out.println("AND operation: true && false : " + (true && false));
        System.out.println("OR operation: true || false : " + (true || false));
        System.out.println("NOT operation: true != false : " + (true != false));

        // === Additional examples from the previous snippet ===
        System.out.println("\n--- Extra Arithmetic Examples ---");
        int a = 12, b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n--- Extra Logical Examples ---");
        boolean p = true, q = false;
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        System.out.println("\n--- Extra Relational Examples ---");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));


    }
}
