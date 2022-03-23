package c09_quan_ly_dien_thoai.models;

public class AuthPhone extends Phone {
    private String warrantyPeriod;
    private String warrantyCoverage;


    public AuthPhone(int ID, String phoneName, double price, int quantity, String brand) {
        super(ID, phoneName, price, quantity, brand);
    }

    public AuthPhone(int ID, String phoneName, double price, int quantity, String brand, String warrantyPeriod, String warrantyCoverage) {
        super(ID, phoneName, price, quantity, brand);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyCoverage = warrantyCoverage;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.warrantyPeriod + "," + this.warrantyCoverage;
    }

    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getWarrantyCoverage() {
        return warrantyCoverage;
    }

    public void setWarrantyCoverage(String warrantyCoverage) {
        this.warrantyCoverage = warrantyCoverage;
    }

    @Override
    public String toString() {
        return "AuthPhone{" + super.toString() +
                "warrantyPeriod='" + warrantyPeriod + '\'' +
                ", warrantyCoverage='" + warrantyCoverage + '\'' +
                '}';
    }
}
