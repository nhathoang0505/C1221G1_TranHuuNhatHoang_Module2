import java.util.Scanner;

public class DemoEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < (n * 2) + 1; j++) {
                if (i == 0) {
                    break;
                }
                if (j == n - i || j == n + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j <= (2 * n) - 1; j++) {
                if (j == n - i || j == (n) + i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}
