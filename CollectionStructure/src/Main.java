import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /* int[] numbers = new int[]{1,2,3};
        numbers[3]=4; // Index 3 out of bounds for length 3 error.
        numbers[3]=new int [4];
        System.out.println(numbers[0]); // It gives 0. Because we used "new" so that; past array changed and we didn't assign any new value.
        System.out.println(numbers[4]);
        */
        // This usage is wrong .

        ArrayList array = new ArrayList();

        //Add--> Adding an element in Array.

        array.add("Hello");
        array.add("World");
        array.add(10);
        array.add(100);
        System.out.println(array);
        System.out.println(array.size());

        //Remove --> Deleting an element.

        array.remove(0);
        System.out.println(array);
        System.out.println(array.size());

        //GET-->Read Operation

        System.out.println(array.get(2));
        //SET-->Re-assign Operation

        array.set(2,3);
        System.out.println(array);
        System.out.println(array.size());

        //Clear

        array.clear();
        System.out.println(array);
        array.add("example");
        array.add("example2");
        array.add("example3");

        //Printing with "for" operation:
        for(Object o : array) {
            System.out.println(o);
        }

        //_Type-Safe "Generic form"

        ArrayList<String> generic = new ArrayList<String>();
        generic.add("Stringform'a'1");

        // generic.add(1); We choseed String form because of that we can't add a int, double, float value.

        generic.add("Stringform'b'2");
        generic.add("Stringform'c'3");
        generic.add("Stringform'd'4");

        //GET-->Read Operation

        System.out.println(generic.get(0));

        //SET-->Re-assign Operation

       generic.set(0,"changed'f'");
       System.out.println(generic.get(0));

        //Clear

        /* generic.clear(); */

        //Remove --> Deleting an element.

        generic.remove(0);
        System.out.println(generic.get(0)); //New 0.index element is Stringform'b'.

        //Printing with "for" operation:

        for(Object o : generic) {
            System.out.println(o);
        }
        //Sorting
        Collections.sort(generic);
        System.out.println(generic);


    }
}