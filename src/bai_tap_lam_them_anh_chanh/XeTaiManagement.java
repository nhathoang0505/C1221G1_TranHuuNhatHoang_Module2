package bai_tap_lam_them_anh_chanh;

import java.util.ArrayList;
import java.util.Scanner;

public class XeTaiManagement {
    static ArrayList<XeTai> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        arrayList.add(new XeTai("43s2-261.97", "Hyundai", 2010, "Nghĩa", 3));
        arrayList.add(new XeTai("43s2-181.97", "Toyota", 2015, "Nghĩa", 1));
        arrayList.add(new XeTai("43s2-263.97", "Wave", 2021, "Nghĩa", 1));
    }

    public static void addTruck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String addBienKiemSoatXeTai = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String addTenHangXeTai = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int addNamSanXuatXeTai = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu:");
        String addChuSoHuuXeTai = scanner.nextLine();
        System.out.println("Nhập tải trọng:");
        int addTaiTrongXeTai = Integer.parseInt(scanner.nextLine());
        XeTai xeTai = new XeTai(addBienKiemSoatXeTai, addTenHangXeTai, addNamSanXuatXeTai, addChuSoHuuXeTai, addTaiTrongXeTai);
        arrayList.add(xeTai);
    }

    public static void displayTruck() {
        for (XeTai xeTai : arrayList) {
            System.out.println(xeTai);
        }
    }
}
