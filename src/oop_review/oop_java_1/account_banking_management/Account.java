package oop_review.oop_java_1.account_banking_management;

import java.util.Scanner;

public class Account {
    public final double LAISUAT = 0.035;
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double tien;

    public Account(long soTaiKhoan, String tenTaiKhoan, double tien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.tien = tien;
    }

    Account() {
        tien = 50;
    }

    double napTien() {
        double tienMuonNap;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số tiền muốn nạp:");
            tienMuonNap = Double.parseDouble(scanner.nextLine());
            if (tienMuonNap <= 0) {
                System.out.println("Không hợp lê, vui lòng nhập lại: ");
            } else {
                break;
            }
        } while (true);
        tien += tienMuonNap;
        return tien;
    }

    double rutTien() {
        double tienMuonRut = 0;
        final double PHI_RUT_TIEN = 11000;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số tiền muốn rút:");
            tienMuonRut = Double.parseDouble(scanner.nextLine());
            if (tienMuonRut > (tien - PHI_RUT_TIEN) || tienMuonRut <= 0) {
                System.out.println("Không hợp lê, vui lòng nhập lại: ");
            } else {
                break;
            }
        } while (true);
        tien -= (tienMuonRut + PHI_RUT_TIEN);
        return tien;
    }

    double daoHan() {
        tien = tien + tien * LAISUAT;
        return tien;
    }

    void chuyenTien(Account nguoiNhan) {
        double tienMuonChuyen = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số tiền muốn chuyển:");
            tienMuonChuyen = Double.parseDouble(scanner.nextLine());
            if (tienMuonChuyen > tien || tienMuonChuyen <= 0) {
                System.out.println("Không hợp lê, vui lòng nhập lại: ");
            } else {
                break;
            }
        } while (true);
        this.tien = tien - tienMuonChuyen;
        nguoiNhan.setTien(nguoiNhan.getTien()+tienMuonChuyen);
    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getTien() {
        return tien;
    }

    public void setTien(double tien) {
        this.tien = tien;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", tien=" + String.format("%,.0f", tien) +
                '}';
    }
}
