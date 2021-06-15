import java.util.Scanner;
import java.lang.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();
        int tmp = num;
        int sum = 0;

        int remainder;
        int count = 0;
        while (num != 0) {
            remainder = num % 10;
            count++;
            num = num / 10;
        }

        num = tmp;

        while (num != 0) {
            remainder = num % 10;
            sum = sum + (int)Math.pow(remainder, count);
            num = num / 10;
        }

        if (tmp == sum) {
            System.out.println("It is a armstrong number.");
        } else {
            System.out.println("It is not a armstrong number");
        }
    }
}
