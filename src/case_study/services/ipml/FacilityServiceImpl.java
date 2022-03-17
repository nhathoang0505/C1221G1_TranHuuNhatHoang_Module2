package case_study.services.ipml;

import case_study.models.Facility;
import case_study.models.House;
import case_study.models.Room;
import case_study.models.Villa;
import case_study.services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    static Map<Facility, Integer> facilityIntegerList = new LinkedHashMap<>();

    static {
        facilityIntegerList.put(new Room("Breakfast", 20, 2, 2, "day", "cleanning"), 0);
        facilityIntegerList.put(new House("Breakfast", 1, 3, 4, "day", "2 bed", 1), 5);
        facilityIntegerList.put(new Villa("Breakfast", 2, 2, 2, "hour", "4 rooms", 4, 3), 6);
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String freeBonusServices

    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> element:facilityIntegerList.entrySet()) {
            System.out.println("Service "+element.getKey()+" Số lần đã thuê "+element.getValue());
        }
    }

    @Override
    public void displayMaintaince() {
        for (Map.Entry<Facility, Integer> element:facilityIntegerList.entrySet()) {
            if(element.getValue()>=5){
                System.out.println("Service "+element.getKey()+" Số lần đã thuê "+element.getValue());
            }
        }
    }

    @Override
    public void addNewVilla() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomVillaStandard,
// double poolArea, int numberOfVillaFloors
        System.out.println("Input SERVICE NAME:");
        String nameService = scanner.nextLine();
        System.out.println("Input ROOM SIZE:");
        double roomSize = Double.parseDouble(scanner.nextLine());
        System.out.println("Input SERVICE PRICE:");
        double servicePrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Input QUANTITY OF PEOPLE:");
        int peopleQuantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Input RENT TYPE:");
        String rentType = scanner.nextLine();
        System.out.println("Input STANDARD:");
        String roomVillaStandard = scanner.nextLine();
        System.out.println("Input POOL AREA");
        double poolArea = Double.parseDouble(scanner.nextLine());
        System.out.println("Input NUMBER OF VILLA FLOORS:");
        int numberOfVillaFloors = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(nameService, roomSize, servicePrice, peopleQuantity, rentType, roomVillaStandard, poolArea, numberOfVillaFloors);
        facilityIntegerList.put(villa, 0);
    }

    @Override
    public void addNewHouse() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomHouseStandard, int numberOfHouseFloors
        System.out.println("Input SERVICE NAME:");
        String nameService = scanner.nextLine();
        System.out.println("Input ROOM SIZE:");
        double roomSize = Double.parseDouble(scanner.nextLine());
        System.out.println("Input PRICE OF SERVICE:");
        double servicePrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Input PEOPLE QUANTITY:");
        int peopleQuantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Input RENT TYPE:");
        String rentType = scanner.nextLine();
        System.out.println("Input HOUSE STANDARD:");
        String roomHouseStandard = scanner.nextLine();
        System.out.println("Input NUMBER OF FLOORS:");
        int numberOfHouseFloors = scanner.nextInt();
        House house = new House(nameService, roomSize, servicePrice, peopleQuantity, rentType, roomHouseStandard, numberOfHouseFloors);
        facilityIntegerList.put(house, 0);
    }

    @Override
    public void addNewRoom() {
//String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String freeBonusServices
        System.out.println("Input SERVICE NAME:");
        String nameService = scanner.nextLine();
        System.out.println("Input ROOM SIZE:");
        double roomSize = Double.parseDouble(scanner.nextLine());
        System.out.println("Input PRICE OF SERVICE:");
        double servicePrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Input PEOPLE QUANTITY:");
        int peopleQuantity = Integer.parseInt(scanner.nextLine());
        System.out.println("Input RENT TYPE:");
        String rentType = scanner.nextLine();
        System.out.println("Input FREE BONUS SERVICE:");
        String freeBonusServices = scanner.nextLine();
        Room room = new Room(nameService, roomSize, servicePrice, peopleQuantity, rentType, freeBonusServices);
        facilityIntegerList.put(room, 0);
    }
}
