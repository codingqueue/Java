public class BinarySearch {
    public static void main(String[] args) {
        /**
         * Binary Search - search in a sorted array
         * 
         * arr = [1,2,5,8,9,15,18,21,85,90,100], key = 85
         */

        int arr[] = { 1, 2, 5, 8, 9, 15, 18, 21, 85, 90, 100 };
        int key = 120;

        int low = 0;
        int high = arr.length - 1;

        boolean flag = false;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (key == arr[mid]) {
                flag = true;
                break;
            } else if (key > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (flag == true) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }
}
