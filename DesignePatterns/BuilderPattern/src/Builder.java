import java.util.function.Consumer;

public class Builder {

    private  static final Product product  = new Product();


    public Builder with(Consumer<Product> builderFunction){
        builderFunction.accept(product);
        return this;
    }

    public Product build(){
        return product;
    }

}
