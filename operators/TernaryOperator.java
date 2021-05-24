/**
 * Demonstration of ternary operator.
 * @author CodingQueue
 */

 public class TernaryOperator{
     public static void main(String[] args) {
         // exp1 ? exp2 if true : exp3 if false;

         int a=4, b=5;

         int greatest = (a>b) ? a : b;
         String out = (a>b) ? "a is greater than b" : "b is greater than a";

         System.out.println(greatest);
         System.out.println((a>b) ? "a is greater than b" : "b is greater than a");
     }
 }