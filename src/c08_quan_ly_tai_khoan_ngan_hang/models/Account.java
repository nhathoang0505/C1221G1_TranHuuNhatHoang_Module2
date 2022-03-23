package c08_quan_ly_tai_khoan_ngan_hang.models;

public abstract class Account {
    private int id;
    private String accountCode;
    private String accountName;
    private String dayCreated;

    public Account(int id, String accountCode, String accountName, String dayCreated) {
        this.id = id;
        this.accountCode = accountCode;
        this.accountName = accountName;
        this.dayCreated = dayCreated;
    }

    public String getInfoToCSV() {
        return this.id + "," + this.accountCode + "," + this.accountName + "," + this.dayCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getDayCreated() {
        return dayCreated;
    }

    public void setDayCreated(String dayCreated) {
        this.dayCreated = dayCreated;
    }

    @Override
    public String toString() {
        return "BankingAccount{" +
                "id=" + id +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", dayCreated='" + dayCreated + '\'' +
                '}';
    }
}
