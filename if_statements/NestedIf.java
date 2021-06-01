package if_statements;
import java.util.Scanner;

public class NestedIf{
    public static void main(String[] args) {
        int x = 4;
        int y = 10;
        int z = 18;

        if(x>y){
            System.out.println("x is greater than y");
        
            if(x>z){
                System.out.println("x is the greatest element.");
            }else{
                System.out.println("z is the greatest element.");
            }

        }
        else{
            System.out.println("y is greater than x");

            if(y>z){
                System.out.println("y is the greatest element.");
            }else{
                System.out.println("z is the greatest element.");
            }
        }
    }
}