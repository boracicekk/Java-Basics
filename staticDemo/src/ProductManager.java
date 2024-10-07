public class ProductManager {

    public void add(Product product){
        if(ProductValidator.isValid(product)){
        System.out.println("The adding operation is successful");
       }else {
            System.out.println("The adding operation is not successful.");
        }
    }
    public void delete(Product product){
        if(ProductValidator.isValid(product)){
            System.out.println("The delete operation is working  successfully  .");
        }else{
            System.out.println("The delete operation is not working successfully.");
        }
    }
    public void update(Product product){
        if(ProductValidator.isValid(product))   {
            System.out.println("The update operation is working successfully ");
        }else{
            System.out.println("The update operation is not working successfully .");
        }
    }
}


