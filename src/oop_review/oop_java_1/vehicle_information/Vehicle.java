package oop_review.oop_java_1.vehicle_information;

public class Vehicle {
    private int cylinderCapacity;
    private long carPrice;

    public Vehicle(int cylinderCapacity, long carPrice) {
        this.cylinderCapacity = cylinderCapacity;
        this.carPrice = carPrice;
    }

    Vehicle() {
    }

    double taxCalculate() {
        double tax = 0;
        if (this.cylinderCapacity > 200) {
            tax = carPrice * 0.05;
        } else if (this.cylinderCapacity > 100) {
            tax = carPrice * 0.03;
        } else {
            tax = carPrice * 0.01;
        }
        return tax;
    }

    public int getCylinderCapacity() {
        return this.cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(long carPrice) {
        this.carPrice = carPrice;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "cylinderCapacity=" + cylinderCapacity +
                ", carPrice=" + String.format("%,d", carPrice) +
                '}';
    }
}

