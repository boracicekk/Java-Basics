//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("I work everytime!"); //In real life, we use this "finally" part for cut the database or file connection.
        }
        */

        /* This usage is true because type of exception is Array Index type.

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }finally {
            System.out.println("I work everytime!");
        }
        */

        /* But this usage is wrong because the exception is not a string type. Finally part always work but we will take an exception message in output.
        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }finally {
            System.out.println("I work everytime!");
        }
        */
        /* If we have multiple catch part? --> Whatever exception will be returned, that catch block will run.

        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(Exception exception){
            System.out.println(exception);
        }finally {
            System.out.println("I work everytime!");
        }
        */

        // This usage also works because the "Exception exception" structure is hierarchically above the other usages, and the others include exception types.
        //You can also hierarchical structure of Exception structure if you use Intellij press CTRL on the "StringIndexOutOfBoundsException","ArrayIndexOutOfBoundsException" or "Exception".
        try{
            int[] numbers = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch(StringIndexOutOfBoundsException exception){
            System.out.println(exception);
        }catch(Exception exception){
            System.out.println("Logged: " + exception);
        }finally {
            System.out.println("I work everytime!");
        }
    }
}