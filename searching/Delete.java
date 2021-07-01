public class Delete {
    public static void main(String[] args) {
        int arr[] = { 10, 7, 6, 5, 15, 2, 4, 89 };
        int key = 15;

        //searching
        int elementIndex = 0;
        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                elementIndex = i;
                flag = true;
                break;
            }
        }

        int lastIndex = arr.length -1 ;
        if (flag == true) {
            for (int i = elementIndex; i <= lastIndex - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[lastIndex] = -1;


            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+ " ");
            }
        } else {
            System.out.println("No such elemnt present.");
        }
    }
}
