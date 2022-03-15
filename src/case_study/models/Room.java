package case_study.models;

public class Room extends Facility {
    private String freeBonusServices;

    public Room(String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String freeBonusServices) {
        super(nameService, roomSize, servicePrice, peopleQuantity, rentType);
        this.freeBonusServices = freeBonusServices;
    }

    public Room(String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType) {
        super(nameService, roomSize, servicePrice, peopleQuantity, rentType);
    }

    public String getFreeBonusServices() {
        return freeBonusServices;
    }

    public void setFreeBonusServices(String freeBonusServices) {
        this.freeBonusServices = freeBonusServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeBonusServices='" + freeBonusServices + '\'' +
                '}';
    }
}
