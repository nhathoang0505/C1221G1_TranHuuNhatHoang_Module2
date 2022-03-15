package case_study.models;

public class House extends Facility {
    private String roomHouseStandard;
    private int numberOfHouseFloors;

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

    public House(String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomHouseStandard, int numberOfHouseFloors) {
        super(nameService, roomSize, servicePrice, peopleQuantity, rentType);
        this.roomHouseStandard = roomHouseStandard;
        this.numberOfHouseFloors = numberOfHouseFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomHouseStandard='" + roomHouseStandard + '\'' +
                ", numberOfHouseFloors=" + numberOfHouseFloors +
                '}';
    }
}
