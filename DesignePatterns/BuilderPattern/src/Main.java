import builderWithLombok.Address;
import builderWithLombok.Person;

public class Main {
    public static void main(String[] args) {

        Product product = new Product.Builder()
                .with(p-> p.setName("productName"))
                .with(p-> p.setPrice(20.99))
                .build();

        System.out.println(product.getName());
        System.out.println(product.getPrice());


//        --------------Builder With Lombok---------


        Person person = Person.builder()
                .name("Jon Doe")
                .age(25)
                .address(Address.builder()
                        .street("TheGrate St")
                        .city("Town_1")
                        .zipCode("123-123")
                        .build()
                ).build();

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getAddress());



    }
}