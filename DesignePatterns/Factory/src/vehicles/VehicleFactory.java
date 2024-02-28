package vehicles;

public class VehicleFactory {


    public Vehicle createVehicle(String type, String fuel) {
        return switch (type) {
            case "car" -> createCar(fuel);
            case "bike" -> createBike(fuel);
            case "truck" -> createTruck(fuel);
            default -> throw new IllegalArgumentException("Wrong Type --> " + type);
        };
    }

    private Vehicle createCar(String fuel) {
        return switch (fuel) {
            case "petrol" -> new Car();
            case "electric" -> new Car();
            default -> throw new IllegalArgumentException("Wrong Fuel Type ---> " + fuel);
        };

    }

    private Vehicle createBike(String fuel) {
        return switch (fuel) {
            case "petrol" -> new Bike();
            case "electric" -> new Bike();
            default -> throw new IllegalArgumentException("Wrong Fuel Type ---> " + fuel);
        };
    }

    private Vehicle createTruck(String fuel) {
        return switch (fuel) {
            case "diesel" -> new Truck();
            case "electric" -> new Truck();
            default -> throw new IllegalArgumentException("Wrong Fuel Type ---> " + fuel);
        };
    }


}
