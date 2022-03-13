package ss19_string_and_regex.bai_tap.validate_so_dien_thoai;

import java.util.regex.Pattern;

public class RegularExpression {
    public static final String PHONE_NUMBER_REGEX = "\\(\\d{2}\\)-\\([0]\\d{9}\\)";

    public static void main(String[] args) {
        String number1 = "(84)-(0978489648)";
        String number2 = "(a8)-(22222222)";
        boolean checkNumber1 = Pattern.matches(PHONE_NUMBER_REGEX,number1);
        System.out.println("check number1: "+checkNumber1);
        boolean checkNumber2 = Pattern.matches(PHONE_NUMBER_REGEX,number2);
        System.out.println("check number: "+checkNumber2);
    }
}
