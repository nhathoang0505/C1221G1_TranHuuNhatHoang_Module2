package c09_quan_ly_dien_thoai.models;

public abstract class Phone {
    private int ID;
    private String phoneName;
    private double price;
    private int quantity;
    private String brand;

    public Phone(int ID, String phoneName, double price, int quantity, String brand) {
        this.ID = ID;
        this.phoneName = phoneName;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    public String getInfoToCSV() {
        return this.ID + "," + this.phoneName + "," + this.price + "," + this.quantity + "," + this.brand;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return
                "ID=" + ID +
                        ", phoneName='" + phoneName + '\'' +
                        ", price=" + price +
                        ", quantity=" + quantity +
                        ", brand='" + brand + '\'';
    }
}
