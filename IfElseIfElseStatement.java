import java.util.Scanner;

public class IfElseIfElseStatement{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        double percent = in.nextDouble();

        //print Grade A - >= 90
        //print Grade B - >=70 && <90
        //print Grade C - >=40 && <70
        //print Fail - <40

        if(percent >=90){
            System.out.println("Grade A");
        }
        else if(percent>=70 && percent<90)
        {
            System.out.println("Grade B");
        }
        else if(percent>=40 && percent<70)
        {
            System.out.println("Grade C");
        }
        else{
            System.out.println("FAIL");
        }

        System.out.println("Program ended.");
    }
}