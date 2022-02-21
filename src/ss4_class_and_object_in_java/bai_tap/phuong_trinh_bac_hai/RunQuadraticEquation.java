package ss4_class_and_object_in_java.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;

public class RunQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị cho a, b, c:");
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta == 0) {
            System.out.println("Phương trình có một nghiệm: " + quadraticEquation.getRoot1());
        } else if (delta > 0) {
            System.out.println("Phương trình có hai nghiệm: x1=: " + quadraticEquation.getRoot1() + " x2= " + quadraticEquation.getRoot2());
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
