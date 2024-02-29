import java.util.function.Consumer;

public class Product {

    private String name;
    private double price;

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    static class Builder {
        private final Product product = new Product();

        public Builder with(Consumer<Product> builderFunction) {
            builderFunction.accept(product);
            return this;
        }

        public Product build() {
            return product;
        }
    }


}
