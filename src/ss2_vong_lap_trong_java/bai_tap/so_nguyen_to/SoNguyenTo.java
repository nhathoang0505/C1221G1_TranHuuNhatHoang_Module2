package ss2_vong_lap_trong_java.bai_tap.so_nguyen_to;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng số nguyên tố cần in: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        int count = 1;
        int n = 2;
        System.out.println(n + " là số nguyên tố");
        while (count < soLuong) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                } else if (i == n - 1) {
                    System.out.println(n + " là số nguyên tố");
                    count++;
                }
            }
            n++;
        }
    }
}
