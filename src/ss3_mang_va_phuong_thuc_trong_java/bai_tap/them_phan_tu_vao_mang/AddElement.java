package ss3_mang_va_phuong_thuc_trong_java.bai_tap.them_phan_tu_vao_mang;

import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập giá trị của phần tử thứ " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng vừa tạo được:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("Nhập phần tử X cần thêm:");
        int x = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vị trí cần thêm X vào:");
        int index = Integer.parseInt(scanner.nextLine());
        if (index <= -1 || index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            for (int i = arr.length - 1; i >= index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        System.out.println("Mảng sau khi đã thêm phần tử X:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
