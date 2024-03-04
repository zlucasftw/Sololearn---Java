package polymorphism;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle electric = new ElectricVehicle();
        Vehicle hybrid = new HybridVehicle();

        //calls
        vehicle.start();
        vehicle.resource();

        electric.start();
        electric.resource();

        hybrid.start();
        hybrid.resource();

    }
}
