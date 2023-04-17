package GPTLearning;

public class VehiclesMain {
    public static void main(String[] args) {
        Vehicle car = new Vehicle("Car", 1, "Land");
        car.startEngine();
        car.performVehicleAction("Drive");
        car.stopEngine();

        Vehicle boat = new Vehicle("Boat", 2, "Water");
        boat.startEngine();
        boat.performVehicleAction("Sail");
        boat.stopEngine();
    }
}
