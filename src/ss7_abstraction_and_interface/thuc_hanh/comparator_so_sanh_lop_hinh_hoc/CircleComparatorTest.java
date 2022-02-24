package ss7_abstraction_and_interface.thuc_hanh.comparator_so_sanh_lop_hinh_hoc;

import ss7_abstraction_and_interface.thuc_hanh.comparator.Circle;
import ss7_abstraction_and_interface.thuc_hanh.comparator.ComparableCircle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        ComparableCircle[] Circles = new ComparableCircle[3];
        Circles[0] = new ComparableCircle(3.6);
        Circles[1] = new ComparableCircle();
        Circles[2] = new ComparableCircle(5, "blue", true);
        System.out.println("Pre-sorted: ");
        for (ComparableCircle circle : Circles){
            System.out.println(circle);
        }
        System.out.println("--------------");
        Arrays.sort(Circles);

        for (ComparableCircle circle : Circles){
            System.out.println(circle);
        }


    }
}

