package c09_quan_ly_dien_thoai.utils;

import c09_quan_ly_dien_thoai.models.AuthPhone;
import c09_quan_ly_dien_thoai.models.HandPhone;
import c09_quan_ly_dien_thoai.models.Phone;

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

    public static List<Phone> readHandPhonesListFromCSV(String filePath) {
        List<Phone> handPhoneList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            //int ID, String phoneName, double price, int quantity, String brand, String handsFrom, String state
            int id = Integer.parseInt(arr[0]);
            String phoneName = arr[1];
            double price = Double.parseDouble(arr[2]);
            int quantity = Integer.parseInt(arr[3]);
            String brand = arr[4];
            String handsFrom = arr[5];
            String state = arr[6];
            HandPhone handPhone = new HandPhone(id, phoneName, price, quantity, brand, handsFrom, state);
            handPhoneList.add(handPhone);
        }
        return handPhoneList;
    }

    public static List<Phone> readAuthPhonesListFromCSV(String filePath) {
        List<Phone> authPhoneList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            //int ID, String phoneName, double price, int quantity, String brand, String warrantyPeriod, String warrantyCoverage
            int id = Integer.parseInt(arr[0]);
            String phoneName = arr[1];
            double price = Double.parseDouble(arr[2]);
            int quantity = Integer.parseInt(arr[3]);
            String brand = arr[4];
            String warrantyPeriod = arr[5];
            String warrantyCoverage = arr[6];
            AuthPhone authPhone = new AuthPhone(id, phoneName, price, quantity, brand, warrantyPeriod, warrantyCoverage);
            authPhoneList.add(authPhone);
        }
        return authPhoneList;
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

    public static void writeListPhonesToCSV(String filePath, List<Phone> accountList) {
        List<String> stringList = new ArrayList<>();
        for (Phone phone : accountList) {
            stringList.add(phone.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }
}
