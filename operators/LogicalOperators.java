/**
 * Logical Operators demonstration
 * @author CodingQueue
 */
package operators;
public class LogicalOperators{
    public static void main(String[] args) {
        int a=4, b=5, c=6;

        // (boolean value) logical operator (boolean value)

        //short circuit concept

        //logical AND &&
        boolean andResult = (a>b) && (a>c);//false
        
        //logical OR ||
        boolean orResult = (c>b) || (a>c);//true

        //logical NOT !
        boolean notResult = !(a>b);//true

        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT: " + notResult);
    }
}