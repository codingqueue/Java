package switch_statement;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = in.nextInt();

        System.out.print("Enter y: ");
        int y = in.nextInt();

        // Outer switch
        switch (x) {
            // If x == 1
            case 1:
                // Nested Switch
                switch (y) {
                    // If y == 2
                    case 2:
                        System.out.println("Choice is 2");
                    // If y == 3
                    case 3:
                        System.out.println("Choice is 3");
                }
                break;

            // If x == 4
            case 4:
                System.out.println("Choice is 4");
                break;

            // If x == 5
            case 5:
                System.out.println("Choice is 5");
                break;

            default:
                System.out.println("Choice is other than 1, 2 3, 4, or 5");
                break;
        }
    }
}
