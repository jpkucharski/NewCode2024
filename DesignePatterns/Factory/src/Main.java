import vehicles.Vehicle;
import vehicles.VehicleFactory;

public class Main {
    public static void main(String[] args) {

        ProductFactory pf = new ProductFactory();

        Product productA = pf.createProduct("A");
        Product productB = pf.createProduct("B");
//        Product productC = pf.createProduct("C");

        productA.display();
        productB.display();

//        -------------------Vehicles Factory--------------------

        VehicleFactory vf = new VehicleFactory();

        Vehicle car = vf.createVehicle("car", "petrol");
        Vehicle bike = vf.createVehicle("bike", "electric");
        Vehicle truck = vf.createVehicle("truck", "diesel");

        car.drive();
        bike.drive();
        truck.drive();


    }
}