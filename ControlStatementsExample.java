public class ControlStatementsExample {
    public static void main(String[] args) {
        int x = 0;

        // if / else if / else
        if (x < 0) {
            System.out.println("x is negative");
        } else if (x == 0) {
            System.out.println("x is zero");
        } else {
            System.out.println("x is positive");
        }

        // switch
        int day = 3;
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Other day");
        }

        // while
        System.out.println("\nwhile loop:");
        int count = 0;
        while (count < 3) {
            count++;
            if (count == 2) continue;   // skip when count==2
            System.out.println("count = " + count);
        }

        // do-while
        System.out.println("\ndo-while loop:");
        int num = 3;
        do {
            System.out.println("num = " + num);
            num--;
        } while (num > 0);

        // for with break
        System.out.println("\nfor loop with break:");
        for (int i = 1; i <= 5; i++) {
            if (i == 4) break;   // exit loop when i==4
            System.out.println("i = " + i);
        }
    }
}
