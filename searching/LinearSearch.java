public class LinearSearch {
    public static void main(String[] args) {
        /**
         * Linear Search in an array arr = [7,8,9,6,5,4,1,2,3], key = 2
         */

        int arr[] = { 7, 8, 9, 6, 5, 4, 1, 2, 3 };

        int key = 10;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = true;
                break;
            }
        }

        if (flag == true) {
            System.out.println("Element Found");
        } else {
            System.out.println("Element not found");
        }
    }
}
