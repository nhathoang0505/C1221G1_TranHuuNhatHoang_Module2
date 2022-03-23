package c08_quan_ly_tai_khoan_ngan_hang.utils;

import c08_quan_ly_tai_khoan_ngan_hang.models.Account;
import c08_quan_ly_tai_khoan_ngan_hang.models.PaymentAccount;
import c08_quan_ly_tai_khoan_ngan_hang.models.SavingAccount;
import case_study.models.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFiles {
    private static List<String> readListStringFromCSV(String pathFile) {
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<Account> readSavingAccountListFromCSV(String filePath) {
        List<Account> accountList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            if (arr.length == 8) {
                int id = Integer.parseInt(arr[0]);
                String accountCode = arr[1];
                String accountName = arr[2];
                String dayCreated = arr[3];
                double savingsDepositAmount = Double.parseDouble(arr[4]);
                String dayDeposited = arr[5];
                String interestedDay = arr[6];
                double term = Double.parseDouble(arr[7]);
                SavingAccount savingAccount = new SavingAccount(id, accountCode, accountName, dayCreated, savingsDepositAmount, dayDeposited, interestedDay, term);
                accountList.add(savingAccount);
            } else if (arr.length == 6) {
                int id = Integer.parseInt(arr[0]);
                String accountCode = arr[1];
                String accountName = arr[2];
                String dayCreated = arr[3];
                String cardNumber = arr[4];
                double amountInAccount = Double.parseDouble(arr[5]);
                PaymentAccount paymentAccount = new PaymentAccount(id, accountCode, accountName, dayCreated, cardNumber, amountInAccount);
                accountList.add(paymentAccount);
            }
        }

        return accountList;
    }

    private static void writeListStringToCSV(String filePath, List<String> stringList) {
        File file = new File(filePath);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (String string : stringList) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeListAccountToCSV(String filePath, List<Account> accountList) {
        List<String> stringList = new ArrayList<>();
        for (Account account : accountList) {
            stringList.add(account.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }
}
