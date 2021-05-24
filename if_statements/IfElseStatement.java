import java.util.Scanner;

public class IfElseStatement{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();

        if(age>=18){
            System.out.println("You're allowed to give vote.");
        }else{
            System.out.println("You're not allowed to give vote.");
        }

        System.out.println("Program ended.");
    }
}