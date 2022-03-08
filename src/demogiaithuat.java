public class demogiaithuat {
    public static void main(String[] args) {

        String str = "CodegymDanang";

        System.out.println("Is String uppercase?: " + isStringUpperCase(str));
    }

    private static char isStringUpperCase(String str) {

        //convert String to char array
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {

            //if any character is not in upper case, return false
            if (!Character.isUpperCase(charArray[i]))
                return charArray[i - 1];

        }
        return 0;
    }
}
