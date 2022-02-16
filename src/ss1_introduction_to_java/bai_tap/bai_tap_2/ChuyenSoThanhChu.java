package ss1_introduction_to_java.bai_tap.bai_tap_2;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");

        int number = scanner.nextInt();
//        int number = Integer.parseInt(scanner.nextLine());
        // n = 546
        //int tram ->  n / 10o
        //int chuc ->  (n % 100) / 10
        //int donvi -> n % 10
        int tram, chuc, donvi;
        tram = number / 100;
        chuc = (number - (tram * 100)) / 10;
        donvi = number % 10;

        if (tram == 0 && chuc == 0 && donvi == 0) {
            str += "zero";
        } else {
            if (tram >= 1 && tram <= 9) {
                switch (tram) {
                    case 1:
                        str += "one hundred ";
                        break;
                    case 2:
                        str += "two hundred ";
                        break;
                    case 3:
                        str += "three hundred ";
                        break;
                    case 4:
                        str += "four hundred ";
                        break;
                    case 5:
                        str += "five hundred ";
                        break;
                    case 6:
                        str += "six hundred ";
                        break;
                    case 7:
                        str += "seven hundred ";
                        break;
                    case 8:
                        str += "eight hundred ";
                        break;
                    case 9:
                        str += "nine hundred ";
                        break;
                }
                if (chuc > 0 || donvi > 0) {
                    str += "and ";
                }
            }
            if (chuc == 1) {
                switch (donvi) {
                    case 0:
                        str += "ten";
                        break;
                    case 1:
                        str += "eleven";
                        break;
                    case 2:
                        str += "twelve";
                        break;
                    case 3:
                        str += "thirteen";
                        break;
                    case 4:
                        str += "fourteen";
                        break;
                    case 5:
                        str += "fifteen";
                        break;
                    case 6:
                        str += "sixteen";
                        break;
                    case 7:
                        str += "seventeen";
                        break;
                    case 8:
                        str += "eighteen";
                        break;
                    case 9:
                        str += "nineteen";
                        break;
                }
            } else {
                switch (chuc) {
                    case 2:
                        str += "twenty ";
                        break;
                    case 3:
                        str += "thirty ";
                        break;
                    case 4:
                        str += "forty ";
                        break;
                    case 5:
                        str += "fifty ";
                        break;
                    case 6:
                        str += "sixty ";
                        break;
                    case 7:
                        str += "seventy ";
                        break;
                    case 8:
                        str += "eighty ";
                        break;
                    case 9:
                        str += "ninety ";
                        break;
                }
                switch (donvi) {

                    case 1:
                        str += "one";
                        break;
                    case 2:
                        str += "two";
                        break;
                    case 3:
                        str += "three";
                        break;
                    case 4:
                        str += "four";
                        break;
                    case 5:
                        str += "five";
                        break;
                    case 6:
                        str += "six";
                        break;
                    case 7:
                        str += "seven";
                        break;
                    case 8:
                        str += "eight";
                        break;
                    case 9:
                        str += "nine";
                        break;
                }
            }
        }
        System.out.println(str);
        System.out.println(chuc);
        System.out.println(donvi);
//        System.out.printf("%.2f",9.8);
    }
}
