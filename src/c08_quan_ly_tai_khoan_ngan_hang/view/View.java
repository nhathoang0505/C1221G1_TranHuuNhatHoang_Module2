package c08_quan_ly_tai_khoan_ngan_hang.view;

import c08_quan_ly_tai_khoan_ngan_hang.controllers.BankingAccountController;

public class View {
    public static void main(String[] args) {
        BankingAccountController bankingAccountController = new BankingAccountController();
        bankingAccountController.displayMainBankingMenu();
    }
}
