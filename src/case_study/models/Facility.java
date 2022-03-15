package case_study.models;

public abstract class Facility {
    private String nameService;
    private double roomSize;
    private double servicePrice;
    private int peopleQuantity;
    private String rentType;

    public Facility(String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType) {
        this.nameService = nameService;
        this.roomSize = roomSize;
        this.servicePrice = servicePrice;
        this.peopleQuantity = peopleQuantity;
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getRoomSize() {
        return roomSize;
    }

    public void setRoomSize(double roomSize) {
        this.roomSize = roomSize;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(double servicePrice) {
        this.servicePrice = servicePrice;
    }

    public int getPeopleQuantity() {
        return peopleQuantity;
    }

    public void setPeopleQuantity(int peopleQuantity) {
        this.peopleQuantity = peopleQuantity;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", roomSize=" + roomSize +
                ", servicePrice=" + servicePrice +
                ", peopleQuantity=" + peopleQuantity +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
