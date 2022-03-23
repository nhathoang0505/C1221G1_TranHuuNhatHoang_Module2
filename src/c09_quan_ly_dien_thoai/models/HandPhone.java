package c09_quan_ly_dien_thoai.models;

public class HandPhone extends Phone {
    private String handsFrom;
    private String state;

    public HandPhone(int ID, String phoneName, double price, int quantity, String brand, String handsFrom, String state) {
        super(ID, phoneName, price, quantity, brand);
        this.handsFrom = handsFrom;
        this.state = state;
    }

    public HandPhone(int ID, String phoneName, double price, int quantity, String brand) {
        super(ID, phoneName, price, quantity, brand);
    }

    public String getHandsFrom() {
        return handsFrom;
    }

    public void setHandsFrom(String handsFrom) {
        this.handsFrom = handsFrom;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.handsFrom + "," + this.state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "HandPhone{" + super.toString() +
                "handsFrom='" + handsFrom + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
