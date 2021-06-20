import java.util.Scanner;

public class FindNArmstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter start value: ");
        int start = in.nextInt();

        System.out.println("Enter end value: ");
        int end = in.nextInt();

        for (int num = start; num <= end; num++) {
            //check armstrong

            int original_num = num;
            int num_copy = num;

            int count = 0;

            while (num_copy != 0) {
                int rem = num_copy % 10;
                count++;
                num_copy = num_copy / 10;
            }

            num_copy = original_num;
            
            int sum = 0;
            while (num_copy != 0) {
                int rem = num_copy % 10;
                sum = sum + (int) Math.pow(rem, count);
                num_copy = num_copy / 10;
            }
            
            if (original_num == sum) {
                System.out.println(original_num);
            }
        }

    }
}
