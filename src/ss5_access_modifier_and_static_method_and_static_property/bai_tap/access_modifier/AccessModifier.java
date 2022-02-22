package ss5_access_modifier_and_static_method_and_static_property.bai_tap.access_modifier;

public class AccessModifier {
    private final String color = "red";
    private double radius = 1;

    public AccessModifier() {
    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        AccessModifier circle = new AccessModifier(2);
        System.out.println(circle.getArea());

    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return 3.14 * this.radius * this.radius;
    }
}
