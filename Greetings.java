/**
In this program we are going to write our first interactive program.
@author CodingQueue
*/
//import java util package
import java.util.*;

public class Greetings{
    public static void main(String args[]){
        //create Scanner class object
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = in.next();

        System.out.println("Enter your age");
        int age = in.nextInt();

        System.out.println("Hello " + name +" Welcome to CodingQueue!!");
        System.out.println("Your age is : " + age);
    }
}