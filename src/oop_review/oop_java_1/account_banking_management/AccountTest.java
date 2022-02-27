package oop_review.oop_java_1.account_banking_management;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(111111, "Hoang", 10000000);
        Account account2 = new Account(555555, "Nghia", 50000000);
        System.out.println(account1);
        account1.napTien();
        System.out.println(account1);
        account1.rutTien();
        System.out.println(account1);
        account1.chuyenTien(account2);
        System.out.println(account1);
        System.out.println(account2);
    }
}
