package c08_quan_ly_tai_khoan_ngan_hang.models;

public class SavingAccount extends Account {
    private double savingsDepositAmount;
    private String dayDeposited;
    private String interestedDay;
    private double term;

    public SavingAccount(int id, String accountCode, String accountName, String dayCreated,
                         double savingsDepositAmount, String dayDeposited, String interestedDay, double term) {
        super(id, accountCode, accountName, dayCreated);
        this.savingsDepositAmount = savingsDepositAmount;
        this.dayDeposited = dayDeposited;
        this.interestedDay = interestedDay;
        this.term = term;
    }

    public String getInfoToCSV() {
        return super.getInfoToCSV() + "," + this.savingsDepositAmount + "," + this.dayDeposited + "," + this.interestedDay + "," + this.term;
    }

    public double getSavingsDepositAmount() {
        return savingsDepositAmount;
    }

    public void setSavingsDepositAmount(double savingsDepositAmount) {
        this.savingsDepositAmount = savingsDepositAmount;
    }

    public String getDayDeposited() {
        return dayDeposited;
    }

    public void setDayDeposited(String dayDeposited) {
        this.dayDeposited = dayDeposited;
    }

    public String getInterestedDay() {
        return interestedDay;
    }

    public void setInterestedDay(String interestedDay) {
        this.interestedDay = interestedDay;
    }

    public double getTerm() {
        return term;
    }

    public void setTerm(double term) {
        this.term = term;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() +
                "savingsDepositAmount=" + savingsDepositAmount +
                ", dayDeposited='" + dayDeposited + '\'' +
                ", interestedDay='" + interestedDay + '\'' +
                ", term=" + term +
                '}';
    }
}
