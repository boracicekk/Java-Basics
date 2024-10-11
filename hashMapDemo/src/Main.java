import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String,String>(); // It can be "string,int" ,"String,class", "class,String"...

        //Adding operation for hashmap:

        dictionary.put("Book","Kitap");
        dictionary.put("Table","Masa");
        dictionary.put("Computer","Bilgisyar");

        System.out.println(dictionary);
        System.out.println(dictionary.get("Book"));

        //Size
        System.out.println(dictionary.size());

        //keySet(): This command gives all variables defined for the hashmap.
        for(String item:dictionary.keySet()){
            System.out.println(item);
        }
        //
        for (String itemandvalue:dictionary.keySet()) {
            System.out.println("Element: "+itemandvalue + "  " + "Value: "+ dictionary.get(itemandvalue));
        }

        //Remove operation for hashmap:

        dictionary.remove("table");
        //If remove the "table" element the output will null.
        System.out.println(dictionary.get("table"));

        //Clear operation --> This command deletes all variables defined for the hashmap.

        dictionary.clear();
        System.out.println(dictionary);


    }
}