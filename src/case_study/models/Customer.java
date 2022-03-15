package case_study.models;

public class Customer extends Person {
    private String customerId;
    private String customerRank;
    private String address;

    public Customer(String personName, String sex, int personIDNumber, long phoneNumber, String personEmail) {
        super(personName, sex, personIDNumber, phoneNumber, personEmail);
    }

    public Customer(String personName, String sex, int personIDNumber, long phoneNumber, String personEmail, String customerId, String customerRank, String address) {
        super(personName, sex, personIDNumber, phoneNumber, personEmail);
        this.customerId = customerId;
        this.customerRank = customerRank;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
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
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerRank='" + customerRank + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
