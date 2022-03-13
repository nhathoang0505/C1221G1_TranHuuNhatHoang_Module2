package ss19_string_and_regex.bai_tap.validate_ten_cua_lop_hoc;

import java.util.regex.Pattern;

public class RegularExpression {
    public static final String CLASS_NAME_FORMAT = "[CAP]\\d{4}[GHIKLM]";
    public static void main(String[] args) {
        String name1= "C0318G";
        String name2= "M0318G";
        boolean check1 = Pattern.matches(CLASS_NAME_FORMAT,name1);
        System.out.println("check name1: "+check1);
        boolean check2 = Pattern.matches(CLASS_NAME_FORMAT,name2);
        System.out.println("check name2: "+check2);
    }
}
