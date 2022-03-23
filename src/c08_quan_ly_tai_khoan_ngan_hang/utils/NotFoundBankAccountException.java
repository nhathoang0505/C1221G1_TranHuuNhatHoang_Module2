package c08_quan_ly_tai_khoan_ngan_hang.utils;

public class NotFoundBankAccountException extends Exception{
    public NotFoundBankAccountException(String message) {
        super(message);
    }
}
