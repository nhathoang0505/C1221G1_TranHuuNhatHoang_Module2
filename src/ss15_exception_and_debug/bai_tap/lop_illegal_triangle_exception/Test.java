package ss15_exception_and_debug.bai_tap.lop_illegal_triangle_exception;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 3 cạnh tam giác:");
        double firstSide = Double.parseDouble(scanner.nextLine());
        double secondSide = Double.parseDouble(scanner.nextLine());
        double thirdSide = Double.parseDouble(scanner.nextLine());
        try {
            checkSides(firstSide, secondSide, thirdSide);
        } catch (IllegalTriangleException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Kết thúc chương trình");
        }
    }

    public static void checkSides(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("Cạnh tam giác phải lớn hơn không");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng hai cạnh phải lớn hơn cạnh còn lại");
        }
    }
}
