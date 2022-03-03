package bai_tap_lam_them_anh_chanh;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoManagement {
    static ArrayList<Oto> arrayList = new ArrayList<>();
    static {
        arrayList.add(new Oto("43C1.555.55", "Lamborghini", 2021, "Hoang", "siêu xe", 2));
        arrayList.add(new Oto("43C1.999.99", "McLaren", 2021, "Hoang", "siêu xe", 2));
        arrayList.add(new Oto("43C1.143.97", "Merc", 2019, "Hoang", "xe gia đình", 5));
    }
    public static void addCar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập biển kiểm soát: ");
        String addBienKiemSoatOto = scanner.nextLine();
        System.out.println("Nhập tên hãng sản xuất: ");
        String addTenHangOto = scanner.nextLine();
        System.out.println("Nhập năm sản xuất: ");
        int addNamSanXuatOto = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ sở hữu:");
        String addChuSoHuuOto = scanner.nextLine();
        System.out.println("Nhập kiểu xe:");
        String addKieuXeOto = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi: ");
        int addSoChoNgoiOto = Integer.parseInt(scanner.nextLine());
        Oto oto = new Oto(addBienKiemSoatOto, addTenHangOto, addNamSanXuatOto, addChuSoHuuOto, addKieuXeOto, addSoChoNgoiOto);
        arrayList.add(oto);
    }

    public static void displayCar() {
        for (Oto oto : arrayList) {
            System.out.println(oto);
        }
    }
    public static void deleteCar(){
    }
}
