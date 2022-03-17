import java.util.Arrays;

public class demogiaithuat {
    public static void main(String[] args) {


        int[] arr = {-1, 150, 190, 170, -1, -1, 160, 180};
        int min = arr[1];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                arr[i] = min;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
