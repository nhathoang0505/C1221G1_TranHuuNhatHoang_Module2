package case_study.models;

public class Contract {
    private int contractNumber;
    private String bookingCode;
    private double depositMoney;
    private double totalMoney;
    private String customerID;

    public Contract(int contractNumber, String bookingCode, double depositMoney, double totalMoney, String customerID) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositMoney = depositMoney;
        this.totalMoney = totalMoney;
        this.customerID = customerID;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(double depositMoney) {
        this.depositMoney = depositMoney;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber=" + contractNumber +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositMoney=" + depositMoney +
                ", totalMoney=" + totalMoney +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
