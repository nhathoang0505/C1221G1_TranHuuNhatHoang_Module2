package ss1_introduction_to_java.bai_tap.bai_tap_3;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rate = 23000;
        System.out.println("Nhập số tiền cần đổi: ");
        double usd = Double.parseDouble(scanner.nextLine());
        double vnd = usd * rate;

        System.out.println("Số tiền sau khi đã đổi: " + vnd + " VNĐ");
    }
}
