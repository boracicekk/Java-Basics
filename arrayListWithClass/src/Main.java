import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        //Recommend usage:
        Customer bora = new Customer(1,"Bora","Cicek");
        customers.add(bora);
        //Not recommended usage because it is not useful to change assignments without assigning a variable. :
        customers.add(new Customer(2,"Burak","Cicek"));
        customers.add(new Customer(3,"Emir","Purclutepe"));

        //An example of how to easily make changes to an assigned variable:
        customers.remove(bora);

        for(Customer customer : customers){
            System.out.println(customer.firstName);
        }
    }
}