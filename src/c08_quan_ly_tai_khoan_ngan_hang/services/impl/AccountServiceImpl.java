package c08_quan_ly_tai_khoan_ngan_hang.services.impl;

import c08_quan_ly_tai_khoan_ngan_hang.models.Account;
import c08_quan_ly_tai_khoan_ngan_hang.models.PaymentAccount;
import c08_quan_ly_tai_khoan_ngan_hang.models.SavingAccount;
import c08_quan_ly_tai_khoan_ngan_hang.services.IService;
import c08_quan_ly_tai_khoan_ngan_hang.utils.NotFoundBankAccountException;
import c08_quan_ly_tai_khoan_ngan_hang.utils.ReadAndWriteFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements IService {
    public static final String ACCOUNT_PATH = "S:\\Codegym\\module2\\src\\c08_quan_ly_tai_khoan_ngan_hang\\data\\bank_accounts.csv";
    static List<Account> accountList = new ArrayList<>();

    static {
        accountList = ReadAndWriteFiles.readSavingAccountListFromCSV(ACCOUNT_PATH);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        System.out.print("Input type of account you want to add\n" +
                "1. Add saving account:\n" +
                "2. Add payment account:\n" +
                "0. Return to main menu\n" +
                "(Please choose a number for accessing to these functions).");
        String confirmContinue;
        do {
            try {
                System.out.println("Add new account");
                System.out.print("Enter your number: ");
                int choice;
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.print("Add new saving account: ");
                        addNewSavingAccount();
                        break;
                    case 2:
                        System.out.print("Add new payment account: ");
                        addNewPaymentAccount();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Please input number from 1-9!: ");
                }
                System.out.println("Do you want to continue? (Y/N): ");
                confirmContinue = scanner.nextLine();
                if (confirmContinue.toUpperCase().equals("N")) {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Only number accepted ");
            }
        } while (true);
        ReadAndWriteFiles.writeListAccountToCSV(ACCOUNT_PATH, accountList);
    }

    private void addNewPaymentAccount() {
        int id = autoID();
        System.out.print("Input Account Code: ");
        String accountCode = scanner.nextLine();
        System.out.print("Input Account Name: ");
        String accountName = scanner.nextLine();
        System.out.print("Input Day created account: ");
        String dayCreated = scanner.nextLine();
        System.out.print("Input Card Number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Input Amount Money in account: ");
        Double amountInAccount = Double.parseDouble(scanner.nextLine());
        PaymentAccount paymentAccount = new PaymentAccount(id, accountCode, accountName, dayCreated, cardNumber, amountInAccount);
        accountList.add(paymentAccount);
    }

    private int autoID() {
        int id;
        if (accountList.isEmpty()) {
            id = 1;
        } else {
            id = accountList.get(accountList.size() - 1).getId() + 1;
        }
        return id;
    }

    private void addNewSavingAccount() {
        //int id, String accountCode, String accountName, String dayCreated,
        //                         double savingsDepositAmount, String dayDeposited, String interestedDay, double term
//        System.out.println("Input Account ID");
//        int id = Integer.parseInt(scanner.nextLine());
        int id = autoID();
        System.out.print("Input Account Code: ");
        String accountCode = scanner.nextLine();
        System.out.print("Input Account Name: ");
        String accountName = scanner.nextLine();
        System.out.print("Input Day created account: ");
        String dayCreated = scanner.nextLine();
        System.out.print("Input Amount of Saving deposit: ");
        Double savingsDepositAmount = Double.parseDouble(scanner.nextLine());
        System.out.print("Input Day Deposit of account: ");
        String dayDeposited = scanner.nextLine();
        System.out.print("Input Interested Day account: ");
        String interestedDay = scanner.nextLine();
        System.out.print("Input Term: ");
        Double term = Double.parseDouble(scanner.nextLine());
        SavingAccount savingAccount = new SavingAccount(id, accountCode, accountName, dayCreated,
                savingsDepositAmount, dayDeposited, interestedDay, term);
        accountList.add(savingAccount);
    }

    @Override
    public void display() {
        for (Account e : accountList) {
            System.out.println(e);
        }
    }

    @Override
    public void delete() throws NotFoundBankAccountException {
        display();
        System.out.println("Please Input Account Code you want to delete: ");
        String accountCode = scanner.nextLine();
        String confirmDelete;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountCode.equals(accountList.get(i).getAccountCode())) {
                System.out.println("Confirm deleting: (Y/N)");
                confirmDelete = scanner.nextLine();
                if (confirmDelete.toUpperCase().equals("Y")) {
                    accountList.remove(i);
                    System.out.println("List account after deleting: ");
                    display();
                    ReadAndWriteFiles.writeListAccountToCSV(ACCOUNT_PATH, accountList);
                }
                return;
            }
        }
        throw new NotFoundBankAccountException("Account Code does not exist!");
    }

    @Override
    public void searching() {
        System.out.println("Input keyword to search Account: ");
        String keywordSearching = scanner.nextLine();
        boolean isFound = false;
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountCode().contains(keywordSearching) ||
                    accountList.get(i).getAccountName().contains(keywordSearching)) {
                System.out.println(accountList.get(i));
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Can not find Account");
        }
    }
}
