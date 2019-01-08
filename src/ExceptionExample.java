/*7. Create a class with a main( ) that throws an object of class Exception inside a try block.
 a. Give the constructor for Exception a String argument.
 b. Catch the exception inside a catch clause and print the String argument.
 c. Add a finally clause and print a message to prove you were there.
*/

public class ExceptionExample {

    ExceptionExample(String string){
        string = "Hello " + string;
        System.out.println(string);


    }

    public static void main(String[] args){
        try{
            int division = 25/0;
        }
        catch(Exception e){
            new ExceptionExample("World");
        }
        finally{
            System.out.println("In exception block.");
        }
    }
}
