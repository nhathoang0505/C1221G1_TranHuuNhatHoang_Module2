package case_study.models;

public class Villa extends Facility {
    private String roomVillaStandard;
    private double poolArea;
    private int numberOfVillaFloors;

    public Villa(String serviceCode, String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String roomVillaStandard, double poolArea, int numberOfVillaFloors) {
        super(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType);
        this.roomVillaStandard = roomVillaStandard;
        this.poolArea = poolArea;
        this.numberOfVillaFloors = numberOfVillaFloors;
    }

    public String getRoomVillaStandard() {
        return roomVillaStandard;
    }

    public void setRoomVillaStandard(String roomVillaStandard) {
        this.roomVillaStandard = roomVillaStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfVillaFloors() {
        return numberOfVillaFloors;
    }

    public void setNumberOfVillaFloors(int numberOfVillaFloors) {
        this.numberOfVillaFloors = numberOfVillaFloors;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.roomVillaStandard + "," + this.poolArea + "," + this.numberOfVillaFloors;
    }

    @Override
    public String toString() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomVillaStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfVillaFloors +
                '}';
    }
}
