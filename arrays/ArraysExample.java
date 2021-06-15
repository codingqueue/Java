package arrays;

import java.util.*;

public class ArraysExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of variables required: ");
        int size = in.nextInt();

        //decalre arrays
        int arr[];

        arr = new int[size];

        //initialize arrays
        // int arr[] = { 1, 2, 3, 4, 5, 6,7,8,9 };
        // System.out.println(arr[0]);

        //arrays traversing
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }

        //arrays user-input
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a value for index " + i);
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
