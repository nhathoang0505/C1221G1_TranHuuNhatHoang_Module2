package ss14_thuat_toan_sap_xep.bai_tap.minh_hoa_thuat_toan_sap_xep_chen;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("Trước khi sort");
        insertionSort(list);
    }

    private static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
                System.out.println("Lần thứ " + i + "-pos tại vị trí " + pos + Arrays.toString(list));
            }
            list[pos] = x;
            System.out.println("Mảng sau lần sort thứ " + i + " : " + Arrays.toString(list));
        }
    }
}