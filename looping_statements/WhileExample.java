package looping_statements;
public class WhileExample{
    public static void main(String[] args) {
        //print 1 to 10

        int i=1;//initialize

        while(i<0)//condition
        {
            System.out.println(i);//statement
            i++;//update
        }

        System.out.println("program ended");
    }
}