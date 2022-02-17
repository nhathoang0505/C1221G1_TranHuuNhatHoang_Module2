package ss2_vong_lap_trong_java.bai_tap.so_nguyen_to;

import java.util.Scanner;

public class SoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhập vào số lượng số nguyên tố cần in: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        int count = 1;
        int N = 2;
        System.out.println(N + " là số nguyên tố");
        while (count < soLuong) {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    break;
                } else if (i == N - 1) {
                    System.out.println(N + " là số nguyên tố");
                    count++;
                }
            }
            N++;
        }
    }
}
