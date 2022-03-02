package bai_tap_lam_them_anh_chanh;

import java.util.Scanner;

public class TestVehicle {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Thoát");
            System.out.println("Chọn chức năng: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addVehicle(scanner);
                    break;
                case 2:
                    displayVehicle(scanner);
                    break;
                case 3:
                    deleteVehicle(scanner);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("Không có chức năng nào được chọn!");
            }
        } while (true);
    }

    private static void deleteVehicle(Scanner scanner) {
    }

    private static void displayVehicle(Scanner scanner) {
        System.out.println("-----DISPLAY VEHICLE----- ");
        System.out.println("1. Hiển thị xe Tải");
        System.out.println("2. Hiển thị xe Oto");
        System.out.println("3. Hiển thị xe máy");
        int displayChoice = Integer.parseInt(scanner.nextLine());
        switch (displayChoice) {
            case 1:
                System.out.println("Hiển thị xe tải");
                XeTaiManagement.displayTruck();
                break;
            case 2:
                System.out.println("Hiển thị xe oto");
                OtoManagement.displayCar();
                break;
            case 3:
                System.out.println("Hiển thị xe máy");
                XeMayManagement.displayBike();
                break;
        }
    }

    private static void addVehicle(Scanner scanner) {
        System.out.println("Thêm phương tiện:");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm xe oto");
        System.out.println("3. Thêm xe máy");
        int addChoice = Integer.parseInt(scanner.nextLine());
        switch (addChoice) {
            case 1:
                XeTaiManagement.addTruck();
                break;
            case 2:
                System.out.println("---ADD CAR---");
                OtoManagement.addCar();
                break;
            case 3:
                System.out.println("---ADD MOTORBIKE---");
                XeMayManagement.addBike();
                break;
        }
    }
}

