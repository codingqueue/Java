public class BreakStatement {
    public static void main(String[] args) {
        // example 1
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }

            System.out.println("Hello");
        }

        // System.out.println("end");

        // infinite loop handle

        // for (int i = 1;; i++) {
        // System.out.println(i);
        // if (i == 3) {
        // break;
        // }
        // }

        // System.out.println("end");

        // labelled loop

        // outer:
        // for (int i = 1; i <= 5; i++) {
        // inner:
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(i);
        // if (j == 2) {
        // break outer;
        // }
        // System.out.println(j);
        // }
        // }
    }
}
