package jumping_statement;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }

        System.err.println("Program Ended.");
    }
}
