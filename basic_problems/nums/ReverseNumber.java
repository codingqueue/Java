package basic_problems.nums;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int remainder;
        int rev_num = 0;
        while (num != 0) {
            remainder = num % 10;
            rev_num = rev_num * 10 + remainder;
            num = num / 10;
        }

        System.out.println("Reverse is: " + rev_num);
    }
}
