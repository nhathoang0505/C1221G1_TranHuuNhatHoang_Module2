package oop_review.oop_java_1.vehicle_information;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[]{
                new Vehicle(250, 50000000),
                new Vehicle(150, 90000000),
                new Vehicle(50, 40000000),
        };
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
            System.out.printf("thuế: %,.0f\n", vehicle.taxCalculate());
        }
    }
}
