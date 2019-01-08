/*8. Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception
by displaying the message stored in the exception object.
 */

public class ThreeExceptions {

    public static void someMethod(String s) {
        System.out.println(s.toLowerCase());
    }

    public static void main(String[] args){
        int[] array;
        try{
            array = new int[-20];
        }
        catch(NegativeArraySizeException ex){
            System.out.println("Error: NegativeArraySizeException!");
        }
        try{
            array = new int[5];
            array[20]= 300;
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Error: IndexOutOfBoundsException!");
        }
        try{
            someMethod(null);
        }
        catch (NullPointerException ex){
            System.out.println("Error: NullPointerException!");
        }
        finally{
            System.out.println();
            System.out.println("In exception block.");
        }
    }
}
