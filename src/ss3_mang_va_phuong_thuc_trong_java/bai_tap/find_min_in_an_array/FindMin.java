package ss3_mang_va_phuong_thuc_trong_java.bai_tap.find_min_in_an_array;

import java.util.Arrays;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài của mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(array));
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
