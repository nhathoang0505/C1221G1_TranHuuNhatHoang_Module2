package ss6_inheritance.bai_tap.circle_and_cylinder;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Diện tích: " + circle.getArea());
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Thể tích: " + cylinder.getVolume());
        Circle circle1 = new Circle(10);
        System.out.println(circle1);
    }
}
