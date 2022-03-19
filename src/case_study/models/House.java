package case_study.models;

public class House extends Facility {
    private String roomHouseStandard;
    private int numberOfHouseFloors;

    public House(String serviceCode, String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomHouseStandard, int numberOfHouseFloors) {
        super(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType);
        this.roomHouseStandard = roomHouseStandard;
        this.numberOfHouseFloors = numberOfHouseFloors;
    }

    public String getRoomHouseStandard() {
        return roomHouseStandard;
    }

    public void setRoomHouseStandard(String roomHouseStandard) {
        this.roomHouseStandard = roomHouseStandard;
    }

    public int getNumberOfHouseFloors() {
        return numberOfHouseFloors;
    }

    public void setNumberOfHouseFloors(int numberOfHouseFloors) {
        this.numberOfHouseFloors = numberOfHouseFloors;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.roomHouseStandard + "," + this.numberOfHouseFloors;
    }

    @Override
    public String toString() {
        return "House{" + super.toString()+
                "roomHouseStandard='" + roomHouseStandard + '\'' +
                ", numberOfHouseFloors=" + numberOfHouseFloors +
                '}';
    }
}
