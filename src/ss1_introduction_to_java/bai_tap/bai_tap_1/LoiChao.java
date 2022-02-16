package ss1_introduction_to_java.bai_tap.bai_tap_1;

import java.util.Scanner;

public class LoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
