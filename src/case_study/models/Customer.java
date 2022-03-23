package case_study.models;

public class Customer extends Person {
    private String customerID;
    private String customerRank;
    private String address;

    public Customer(String personName, String gender, int personIDNumber, int phoneNumber, String personEmail) {
        super(personName, gender, personIDNumber, phoneNumber, personEmail);
    }

    public Customer(String personName, String sex, int personIDNumber,
                    int phoneNumber, String personEmail, String customerID, String customerRank, String address) {
        super(personName, sex, personIDNumber, phoneNumber, personEmail);
        this.customerID = customerID;
        this.customerRank = customerRank;
        this.address = address;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.customerID + "," + this.customerRank + "," + this.address;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerRank() {
        return customerRank;
    }

    public void setCustomerRank(String customerRank) {
        this.customerRank = customerRank;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString() +
                "customerId='" + customerID + '\'' +
                ", customerRank='" + customerRank + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
