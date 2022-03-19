package case_study.models;

public class Room extends Facility {
    private String freeBonusServices;

    public Room(String serviceCode, String nameService, double roomSize, double servicePrice, int peopleQuantity, String rentType, String freeBonusServices) {
        super(serviceCode, nameService, roomSize, servicePrice, peopleQuantity, rentType);
        this.freeBonusServices = freeBonusServices;
    }

    public String getFreeBonusServices() {
        return freeBonusServices;
    }

    public void setFreeBonusServices(String freeBonusServices) {
        this.freeBonusServices = freeBonusServices;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.freeBonusServices;
    }

    @Override
    public String toString() {
        return "Room{" + super.toString() +
                "freeBonusServices='" + freeBonusServices + '\'' +
                '}';
    }
}
