package basic_problems.nums;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int remainder;
        int sum = 0;
        while (num != 0) {
            remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }

        System.out.println("Sum of digits: " + sum);
    }
}
