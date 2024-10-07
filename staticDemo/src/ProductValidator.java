public class ProductValidator {
    public ProductValidator() {
        System.out.println("Its working.");
    }
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true ;
        }else{
            return false;
        }
    }
    public void anything(Product product){
        System.out.println("You should write ProductValidator productValidator = new ProductValidator" +
                "productValidator.anything(product);" +
                "Because its not a static function.");
    }
    public static class AnotherClass{
        public static void delete(){
            System.out.println("Inner class is working successfully .");
        }

    }
}
