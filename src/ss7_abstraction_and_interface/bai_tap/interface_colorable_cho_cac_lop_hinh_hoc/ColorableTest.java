package ss7_abstraction_and_interface.bai_tap.interface_colorable_cho_cac_lop_hinh_hoc;

public class ColorableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(4, 3);
        Shape[] shapes = new Shape[]{circle, square, rectangle};
        for (Shape s : shapes) {
            System.out.println(s.getArea());
            if (s instanceof IColorable) {
                ((IColorable) s).howToColor();
            }
        }
    }
}
