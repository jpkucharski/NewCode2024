public class ProductFactory {

    public Product createProduct( String type){
        switch (type) {
            case "A" :
                return new CreateProductA();
            case "B" :
                return new CreateProductB();
            default:
                throw new IllegalArgumentException("Invalid parameter: " + type);
        }
    }



}
