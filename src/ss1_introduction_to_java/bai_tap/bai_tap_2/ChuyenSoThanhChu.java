package ss1_introduction_to_java.bai_tap.bai_tap_2;

import java.util.Scanner;

public class ChuyenSoThanhChu {
    public static void main(String[] args) {
        String str = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển: ");
        int number = scanner.nextInt();
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
                        str += "Twelve";
                        break;
                    case 3:
                        str += "Thirteen";
                        break;
                    case 4:
                        str += "Fourteen";
                        break;
                    case 5:
                        str += "Fifteen";
                        break;
                    case 6:
                        str += "Sixteen";
                        break;
                    case 7:
                        str += "Seventeen";
                        break;
                    case 8:
                        str += "Eighteen";
                        break;
                    case 9:
                        str += "Nineteen";
                        break;
                }
            } else {
                switch (chuc) {
                    case 2:
                        str += "Twenty ";
                        break;
                    case 3:
                        str += "Thirty ";
                        break;
                    case 4:
                        str += "Forty ";
                        break;
                    case 5:
                        str += "Fifty ";
                        break;
                    case 6:
                        str += "Sixty ";
                        break;
                    case 7:
                        str += "Seventy ";
                        break;
                    case 8:
                        str += "Eighty ";
                        break;
                    case 9:
                        str += "Ninety ";
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
    }
}
