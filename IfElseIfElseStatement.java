import java.util.Scanner;

public class IfElseIfElseStatement{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();

        if(age>18){
            System.out.println("You're allowed to give vote.");
        }else if(age==17){
            System.out.println("You'll be eligible next year for voting.");
        }else{
            System.out.println("You're not allowed to give vote.");
        }
    }
}