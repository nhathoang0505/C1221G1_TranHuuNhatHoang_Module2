package case_study.utils;

import java.util.Scanner;

public class RegexData {
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_NAME = "[A-Z]\\w+";
    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_PRICE = "\\d+(.\\d+)*";
    public static final String REGEX_PEOPLEAMOUNT = "^[1-9]|([1][0-9])$";
    public static final String REGEX_FLOOR = "^[1-9]|([1][0-9])$";
    public static final String REGEX_AREA = "^3[1-9]|[4-9]\\d|[1-9]\\d{2,}$";
    static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String error) {
        boolean check = true;
        do {
            if (temp.matches(regex)) {
                check = false;
            } else {
                System.out.println(error);
                temp = scanner.nextLine();
            }
        } while (check);
        return temp;
    }

    public static String regexIDVilla(String temp) {
        return regexStr(temp, REGEX_ID_VILLA, "The right format must be: SVVL-XXXX, X means number from 0-9");
    }

    public static String regexVillaServiceName(String temp) {
        return regexStr(temp, REGEX_NAME, "The first letter must be in Uppercase");
    }

    public static String regexVillaArea(String temp) {
        return regexStr(temp, REGEX_AREA, "Area must be Integer type and over 30");
    }

    public static String regexVillaPrice(String temp) {
        return regexStr(temp, REGEX_PRICE, "Rental cost must be a positive number ");
    }

    public static String regexPeopleamount(String temp) {
        return regexStr(temp, REGEX_PEOPLEAMOUNT, "The maximum number of people must be >0 and less than <20S");
    }

    public static String regexVillaFloor(String temp) {
        return regexStr(temp, REGEX_FLOOR, "The number of floors must be a positive number ");
    }

    public static String regexHouseID(String temp) {
        return regexStr(temp, REGEX_ID_HOUSE, "The right format must be: SVHO-XXXX, X means number from 0-9");
    }

    public static String regexRoomID(String temp) {
        return regexStr(temp, REGEX_ID_ROOM, "The right format must be: SVRO-XXXX, X means number from 0-9");
    }

}
