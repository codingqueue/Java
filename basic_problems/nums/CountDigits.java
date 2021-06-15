package basic_problems.nums;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long num = in.nextLong();

        int remainder;
        int count = 0;
        while (num != 0) {
            remainder = (int) (num % 10);
            count++;
            num = num / 10;
        }

        System.out.println("No. of digits: "+ count);
    }
}