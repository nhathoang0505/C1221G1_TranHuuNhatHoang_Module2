package ss7_abstraction_and_interface.bai_tap.interface_resizeable_cho_cac_lop_hinh_hoc;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(5, 3);
        Square square = new Square(4);
        Shape[] shapes = new Shape[]{circle, rectangle, square};
        for (Shape s : shapes) {
            ((IResizeable) s).resize(10);
            s.getArea();
            System.out.println(s.getArea());
        }
    }
}
