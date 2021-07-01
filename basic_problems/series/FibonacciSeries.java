public class FibonacciSeries {
    public static void main(String[] args) {
        /**
         * Fibonacci Series : 0 1 1 2 3 5 8 13 ...
         */

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i <= 8; i++) {
            int sum = a + b;
            a = b;
            b = sum;

            System.out.println(sum);
        }
       
    }
}
