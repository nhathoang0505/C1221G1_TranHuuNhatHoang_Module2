package ss1_introduction_to_java.bai_tap.bai_tap_2;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int number = scanner.nextInt();

        // n = 546
        //int tram ->  n / 10o
        //int chuc ->  (n % 100) / 10
        //int donvi -> n % 10
        switch (number) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
                break;
            case 10:
                str = "ten";
                break;
        }
        System.out.println(str);
    }
}
