package ss3_mang_va_phuong_thuc_trong_java.bai_tap.dem_so_lan_xuat_hien_ky_tu;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String string = "Tran Huu Nhat Hoang";
            char[] charArray = string.toCharArray();
            System.out.println(charArray);
            System.out.print("Nhập kí tự cần kiểm tra: ");
            char kiTu = scanner.next().charAt(0);

            int count = 0;

            for (int i = 0; i < charArray.length; i++) {
                if (kiTu == charArray[i]) {
                    count++;
                }
            }
            System.out.println("Số lần xuất hiện của kí tự vừa nhập: " + count);
        }
    }