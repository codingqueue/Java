package basic_problems.nums;
import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        int remainder;
        
        while (num != 0) {
            remainder = num % 10;
            System.out.println(remainder);
            num = num / 10;
        }
    }
}