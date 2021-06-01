package data_types;
/**
In this program we are going to discuss rules to define identifiers.
@author CodingQueue
*/
public class Identifiers{
    public static void main(String args[]){
        //1. The only allowed characters for identifiers are all alphanumeric characters ([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).
        int myVar;
        int MyVar2;
        int $MyVar;
        int my_Var; 
        
        //2. Identifiers should not start with digits([0-9]).
        int 4abc;

        //3. Java identifiers are case-sensitive.
        int myHouse;
        int MyHouse;
        
        //4. Keywords can’t be used as an identifier.
        int Public;

    }
}