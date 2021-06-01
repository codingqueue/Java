package looping_statements;
public class DigitSum {
    public static void main(String[] args) {
        int num = 456157, digit, sum = 0;

        while(num != 0) {
            digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits is : " + sum);
    }
}
