package c08_quan_ly_tai_khoan_ngan_hang.models;

public class PaymentAccount extends Account {
    private String cardNumber;
    private double amountInAccount;

    public PaymentAccount(int id, String accountCode, String accountName, String dayCreated,
                          String cardNumber, double amountInAccount) {
        super(id, accountCode, accountName, dayCreated);
        this.cardNumber = cardNumber;
        this.amountInAccount = amountInAccount;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.cardNumber + "," + this.amountInAccount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getAmountInAccount() {
        return amountInAccount;
    }

    public void setAmountInAccount(double amountInAccount) {
        this.amountInAccount = amountInAccount;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" + super.toString() +
                "cardNumber='" + cardNumber + '\'' +
                ", amountInAccount=" + amountInAccount +
                '}';
    }
}
