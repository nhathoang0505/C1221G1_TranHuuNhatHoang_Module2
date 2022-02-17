package ss3_mang_va_phuong_thuc_trong_java.bai_tap.xoa_phan_tu_khoi_mang;

// let arr = new Array(10);
//         for (let i = 0; i < 10; i++) {
//        arr[i] = parseInt(prompt('Nhập vào số ở vị trí thứ ' + i));
//        }
//        let V = parseInt(prompt("Nhập vào số muốn kiểm tra:"));
//        for (let i = 0; i < arr.length; i++) {
//        if (V == arr[i]) {
//        for (let j = i; j < arr.length - 1; j++) {
//        arr[j] = arr[j + 1];
//        }
//        arr[arr.length - 1] = 0;
//        i--;
//        }
//        }
//        document.write(arr);

import java.util.Scanner;

public class DeleteElement {
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
        System.out.println("Nhập phần tử X cần xoá:");
        int x = Integer.parseInt(scanner.nextLine());
        int index_del = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index_del = i;
                break;
            }
        }
        for (int i = index_del; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("Mảng sau khi đã xoá phần tử X:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
