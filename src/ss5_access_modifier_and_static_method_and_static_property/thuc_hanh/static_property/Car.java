package ss5_access_modifier_and_static_method_and_static_property.thuc_hanh.static_property;

public class Car {

    public static int numberOfCars;
    private String name;
    private String engine;


    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }


    // getters and setters

}
