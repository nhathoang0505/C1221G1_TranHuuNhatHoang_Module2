package ss7_abstraction_and_interface.thuc_hanh.comparator_so_sanh_lop_hinh_hoc;

import ss7_abstraction_and_interface.thuc_hanh.comparator.Circle;

public class CircleComparator extends Circle implements Comparable<CircleComparator> {

    public CircleComparator(){}

    public CircleComparator(double radius) {
        super(radius);
    }

    public CircleComparator(String colors, boolean filled, double radius) {
        super(radius, colors, filled);
    }

    @Override
    public int compareTo(CircleComparator o) {
        return (int) (o.getRadius() - getRadius());
    }
}