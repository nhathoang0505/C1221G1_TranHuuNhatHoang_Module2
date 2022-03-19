package case_study.utils;

import case_study.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
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

    public static List<Employee> readEmployeeListFromCSV(String filePath) {
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String personName = arr[0];
            String gender = arr[1];
            int personIDNumber = Integer.parseInt(arr[2]);
            int phoneNumber = Integer.parseInt(arr[3]);
            String personEmail = arr[4];
            String employeeID = arr[5];
            String academicLevel = arr[6];
            String position = arr[7];
            double salary = Double.parseDouble(arr[8]);
            Employee employee = new Employee(personName, gender, personIDNumber, phoneNumber, personEmail, employeeID, academicLevel, position, salary);
            employeeList.add(employee);
        }
        return employeeList;
    }

    public static List<Customer> readCustomerListFromCSV(String filePath) {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String personName = arr[0];
            String gender = arr[1];
            int personIDNumber = Integer.parseInt(arr[2]);
            int phoneNumber = Integer.parseInt(arr[3]);
            String personEmail = arr[4];
            String customerID = arr[5];
            String customerRank = arr[6];
            String address = arr[7];
            Customer customer = new Customer(personName, gender, personIDNumber, phoneNumber, personEmail, customerID, customerRank, address);
            customerList.add(customer);
        }
        return customerList;
    }

    public static List<Facility> readRoomListFromCSV(String filePath) {
        List<Facility> roomList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String serviceCode = arr[0];
            String nameService = arr[1];
            double roomSize = Double.parseDouble(arr[2]);
            double servicePrice = Double.parseDouble(arr[3]);
            int peopleQuantity = Integer.parseInt(arr[4]);
            String rentType = arr[5];
            String freeBonusServices = arr[6];
            Room room = new Room(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType, freeBonusServices);
            roomList.add(room);
        }
        return roomList;
    }

    public static List<Facility> readVillaListFromCSV(String filePath) {
        List<Facility> villaList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String serviceCode = arr[0];
            String nameService = arr[1];
            double roomSize = Double.parseDouble(arr[2]);
            double servicePrice = Double.parseDouble(arr[3]);
            int peopleQuantity = Integer.parseInt(arr[4]);
            String rentType = arr[5];
            String roomVillaStandard = arr[6];
            double poolArea = Double.parseDouble(arr[7]);
            int numberOfVillaFloors = Integer.parseInt(arr[8]);
            Villa villa = new Villa(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType, roomVillaStandard, poolArea, numberOfVillaFloors);
            villaList.add(villa);
        }
        return villaList;
    }

    public static List<Facility> readHouseListFromCSV(String filePath) {
        List<Facility> houseList = new ArrayList<>();
        List<String> stringList = readListStringFromCSV(filePath);
        String[] arr = null;
        for (String string : stringList) {
            arr = string.split(",");
            String serviceCode = arr[0];
            String nameService = arr[1];
            double roomSize = Double.parseDouble(arr[2]);
            double servicePrice = Double.parseDouble(arr[3]);
            int peopleQuantity = Integer.parseInt(arr[4]);
            String rentType = arr[5];
            String roomHouseStandard = arr[6];
            int numberOfHouseFloors = Integer.parseInt(arr[7]);
            House house = new House(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType, roomHouseStandard, numberOfHouseFloors);
            houseList.add(house);
        }
        return houseList;
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

    public static void writeListEmployeeToCSV(String filePath, List<Employee> employeeList) {
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employeeList) {
            stringList.add(employee.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListCustomerToCSV(String filePath, List<Customer> customerList) {
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customerList) {
            stringList.add(customer.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }

    public static void writeListFacilitiesToCSV(String filePath, List<Facility> facilityList) {
        List<String> stringList = new ArrayList<>();
        for (Facility facility : facilityList) {
            stringList.add(facility.getInfoToCSV());
        }
        writeListStringToCSV(filePath, stringList);
    }
}
