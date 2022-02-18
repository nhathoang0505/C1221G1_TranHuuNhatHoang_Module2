package ss3_mang_va_phuong_thuc_trong_java.bai_tap.gop_mang;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[2];
        int[] array2 = new int[3];
        int[] array3 = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ " + i + " của mảng thứ nhất:");
            array1[i] = Integer.parseInt(scanner.nextLine());
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Nhập vào giá trị phần tử thứ " + i + " của mảng thứ hai:");
            array2[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Mảng 1 vừa tạo được: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("Mảng 2 vừa tạo được: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[(array1.length)+i]=array2[i];
        }
        System.out.println("Mảng thứ 3 vừa tạo được: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}
