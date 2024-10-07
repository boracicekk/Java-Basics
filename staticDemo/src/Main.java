//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name="Laptop";
        product.price=100;
        product.id=999;
        ProductManager manager = new ProductManager();
        manager.add(product);
        ProductValidator validator = new ProductValidator();
        ProductValidator.AnotherClass.delete();
        }
    }