import java.util.Scanner;

public class FindNPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter start value: ");
        int start = in.nextInt();

        System.out.println("Enter end value: ");
        int end = in.nextInt();

        for (int num = start; num <= end; num++) {
            //check palindrome

            int original_num = num;

            int num_copy = num;

            int rev_num = 0;

            while (num_copy != 0) {
                int rem = num_copy % 10;
                rev_num = (rev_num * 10) + rem;
                num_copy = num_copy / 10;
            }

            if (original_num == rev_num) {
                System.out.println(original_num);
            }
        }
    }
}
