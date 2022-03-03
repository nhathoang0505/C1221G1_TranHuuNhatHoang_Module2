package ss11_dsa_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;
import java.util.Stack;

public class ReverseItems {
    public static void main(String[] args) {
        Integer[] array = {3, 2, 4, 5, 1};
        String words = "I am Hoang";
        String[] wordArray = words.split(" ");
        System.out.println(Arrays.toString(wordArray));
        reverseArray(array);
        System.out.println(Arrays.toString(array));
        reverseArray(wordArray);
        System.out.println(Arrays.toString(wordArray));
        //        reverseNumArray(array);
//        System.out.println(Arrays.toString(array));
    }

    private static <T> void reverseArray(T[] words) {
        Stack<T> stack = new Stack<>();
        for (int i = 0; i < words.length; i++) {
            stack.add(words[i]);
        }
        int i = 0;
        while (!stack.isEmpty()) {
            words[i] = stack.pop();
            i++;
        }
    }
//    private static void reverseNumArray(int[] array) {
//        Stack<Integer> stack = new Stack();
//        for (int i = 0; i < array.length; i++) {
//            stack.add(array[i]);
//        }
//        int i = 0;
//        while (!stack.isEmpty()) {
//            array[i] = stack.pop();
//            i++;
//        }
//    }


}
