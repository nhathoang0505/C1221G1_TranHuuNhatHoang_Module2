package bai_tap_lam_them_anh_chanh;

import java.util.ArrayList;
import java.util.Scanner;

public class XeMayManagement {
    static ArrayList<XeMay> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static {
        arrayList.add(new XeMay("43C1-519.00", "Cub", 2017, "An", 50));
        arrayList.add(new XeMay("43C1-812.96", "Yamaha", 2020, "An", 110));
        arrayList.add(new XeMay("43C1-306.97", "Robot", 2015, "An", 50));
    }
    public static void addBike() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String addBienKiemSoatXeMay = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String addTenHangXeMay = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int addNamSanXuatXeMay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu:");
        String addChuSoHuuXeMay = scanner.nextLine();
        System.out.println("Nhập công suất:");
        int addCongSuatXeMay = Integer.parseInt(scanner.nextLine());
        XeMay xeMay = new XeMay(addBienKiemSoatXeMay, addTenHangXeMay, addNamSanXuatXeMay, addChuSoHuuXeMay, addCongSuatXeMay);
        arrayList.add(xeMay);
    }
    public static void displayBike() {
        for (XeMay xeMay : arrayList) {
            System.out.println(xeMay);
        }
    }
}

