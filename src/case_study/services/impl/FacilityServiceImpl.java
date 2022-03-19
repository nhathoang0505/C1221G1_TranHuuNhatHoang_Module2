package case_study.services.impl;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.IFacilityService;
import case_study.utils.ReadAndWriteFile;
import case_study.utils.RegexData;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> facilityIntegerList = new LinkedHashMap<>();
    static List<Facility> roomList = new ArrayList<>();
    static List<Facility> villaList = new ArrayList<>();
    static List<Facility> houseList = new ArrayList<>();

    static {
        facilityIntegerList.put(new Room("SVRO-0001", "Breakfast", 20, 2, 2, "day", "cleanning"), 0);
        ReadAndWriteFile.readRoomListFromCSV("S:\\Codegym\\module2\\src\\case_study\\data\\room.csv");
        facilityIntegerList.put(new House("SVHO-0001", "Breakfast", 1, 3, 4, "day", "2 bed", 1), 5);
        ReadAndWriteFile.readHouseListFromCSV("src\\case_study\\data\\house.csv");
        facilityIntegerList.put(new Villa("SVVL-0001", "Breakfast", 2, 2, 2, "hour", "4 rooms", 4, 3), 6);
        ReadAndWriteFile.readVillaListFromCSV("src\\case_study\\data\\villa.csv");
    }


    String serviceCode;
    String nameService;
    double roomSize;
    double servicePrice;
    int peopleQuantity;
    String rentType;
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String freeBonusServices

    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerList.entrySet()) {
            System.out.println("Service " + element.getKey() + " Số lần đã thuê " + element.getValue());
        }
    }

    @Override
    public void displayMaintaince() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerList.entrySet()) {
            if (element.getValue() >= 5) {
                System.out.println("Service " + element.getKey() + " Số lần đã thuê " + element.getValue());
            }
        }
    }

    @Override
    public void addNewVilla() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomVillaStandard,
// double poolArea, int numberOfVillaFloors
        System.out.println("Input SERVICE CODE: ");
        serviceCode = RegexData.regexIDVilla(scanner.nextLine());
        addCommonFacilities();
        System.out.println("Input STANDARD: ");
        String roomVillaStandard = RegexData.regexVillaServiceName(scanner.nextLine());
        System.out.println("Input POOL AREA: ");
        double poolArea = Double.parseDouble(RegexData.regexVillaArea(scanner.nextLine()));
        System.out.println("Input NUMBER OF VILLA FLOORS: ");
        int numberOfVillaFloors = Integer.parseInt(RegexData.regexVillaFloor(scanner.nextLine()));
        Villa villa = new Villa(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType, roomVillaStandard, poolArea, numberOfVillaFloors);
        facilityIntegerList.put(villa, 0);
        villaList.add(villa);
        ReadAndWriteFile.writeListFacilitiesToCSV("src\\case_study\\data\\villa.csv", villaList);
    }

    public void addCommonFacilities() {
        System.out.println("Input SERVICE NAME:");
        nameService = RegexData.regexVillaServiceName(scanner.nextLine());
        System.out.println("Input ROOM SIZE:");
        roomSize = Double.parseDouble(RegexData.regexVillaArea(scanner.nextLine()));
        System.out.println("Input PRICE OF SERVICE:");
        servicePrice = Double.parseDouble(RegexData.regexVillaPrice(scanner.nextLine()));
        System.out.println("Input PEOPLE QUANTITY:");
        peopleQuantity = Integer.parseInt(RegexData.regexPeopleamount(scanner.nextLine()));
        System.out.println("Input RENT TYPE:");
        rentType = RegexData.regexVillaServiceName(scanner.nextLine());
    }

    @Override
    public void addNewHouse() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomHouseStandard, int numberOfHouseFloors
        System.out.println("Input SERVICE CODE: ");
        serviceCode = RegexData.regexHouseID(scanner.nextLine());
        addCommonFacilities();
        System.out.println("Input HOUSE STANDARD:");
        String roomHouseStandard = RegexData.regexVillaServiceName(scanner.nextLine());
        System.out.println("Input NUMBER OF FLOORS:");
        int numberOfHouseFloors = Integer.parseInt(RegexData.regexVillaFloor(scanner.nextLine()));
        House house = new House(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType, roomHouseStandard, numberOfHouseFloors);
        facilityIntegerList.put(house, 0);
        houseList.add(house);
        ReadAndWriteFile.writeListFacilitiesToCSV("src\\case_study\\data\\house.csv", houseList);
    }

    @Override
    public void addNewRoom() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String freeBonusServices
        System.out.println("Input SERVICE CODE: ");
        serviceCode = RegexData.regexRoomID(scanner.nextLine());
        addCommonFacilities();
        System.out.println("Input FREE BONUS SERVICE:");
        String freeBonusServices = scanner.nextLine();
        Room room = new Room(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType, freeBonusServices);
        facilityIntegerList.put(room, 0);
        roomList.add(room);
        ReadAndWriteFile.writeListFacilitiesToCSV("S:\\Codegym\\module2\\src\\case_study\\data\\room.csv", roomList);
    }
}
