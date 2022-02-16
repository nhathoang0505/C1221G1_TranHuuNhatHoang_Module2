package ss1_introduction_to_java.thuc_hanh.thuc_hanh_6;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.printf("Enter a year: ");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        }else {
            System.out.printf("%d is NOT la leap year");
        }
    }
}
