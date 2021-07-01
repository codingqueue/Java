import java.util.Scanner;

public class KeithNumber {
    public static void main(String[] args) {
        /** take number as a input from user */
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = in.nextInt();

        /** create copy of orginal number */
        int org = num;

        /** count number of digits (k) */
        int k = 0;

        while (num != 0) {
            int rem = num % 10;
            k++;
            num = num / 10;
        }

        /** create array of size = count(k) and store digits */

        num = org;

        int arr[] = new int[k];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = num % 10;
            num = num / 10;
        }

        // num = 197 => arr=[1,9,7]

        /**
         * calculate sum of last k digit while sum of digits < original number
         */

        int sum = 0;

        while (sum < org) {
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i];
            }

            for (int i = 0; i <= arr.length - 2; i++) {
                arr[i] = arr[i + 1];
            }

            int lastIndex = arr.length - 1;

            arr[lastIndex] = sum;
        }

        /**
         * check sum of last k digits == original number if yes then it is a keith
         * number other it is not a keith number
         */

        if (sum == org) {
             System.out.println("Keith number");
         } else {
             System.out.println("It is not a Keith number");
         }
    }
}
