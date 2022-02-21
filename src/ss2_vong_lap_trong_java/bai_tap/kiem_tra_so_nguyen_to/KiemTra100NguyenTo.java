package ss2_vong_lap_trong_java.bai_tap.kiem_tra_so_nguyen_to;

import java.util.Scanner;

//[Bài tập] Hiển thị các số nguyên tố nhỏ hơn 100
public class KiemTra100NguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Kiểm tra số nguyên tố từ 2 đến ?: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
        int count = 1;
        int n = 2;
        System.out.println(n + " là số nguyên tố");
        while (count < soLuong) {
            for (int i = 2; i < soLuong; i++) {
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
