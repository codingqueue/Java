public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 10, 78, 7, 5, 6, 41, 14, 53, 80 };

        int temp[] = new int[arr.length];

        int lastIndex = arr.length - 1;
        // for (int i = 0; i < temp.length; i++) {
        //     temp[i] = arr[lastIndex - i];
        // }

        int ptr1 = 0;
        int ptr2 = lastIndex;

        while (ptr2 > ptr1) {
            int t = arr[ptr2];
            arr[ptr2] = arr[ptr1];
            arr[ptr1] = t;

            ptr1++;
            ptr2--;
        }


        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }
    }
}