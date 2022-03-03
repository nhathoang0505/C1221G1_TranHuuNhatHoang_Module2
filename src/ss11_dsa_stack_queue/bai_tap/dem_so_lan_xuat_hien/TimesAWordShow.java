package ss11_dsa_stack_queue.bai_tap.dem_so_lan_xuat_hien;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class TimesAWordShow {
    public static void main(String[] args) {
        String str = "hello world heLlo Hello this is a test wORLD";
        str = str.toLowerCase();
        String[] wordsArray = str.split(" ");
        System.out.print(Arrays.toString(wordsArray));
        Map<String, Integer> treeMap = new TreeMap<>();
//        <K,V> => 1 entry
        // <hello, 1> => 1
        // <world, 2> => 1
//       .entrySet() => Entry[]
        // 1. chưa xh
        // 2. đã xh
        for (String ele : wordsArray) {
            if (!treeMap.containsKey(ele)) {
                treeMap.put(ele, 1);
            } else {
                treeMap.put(ele, treeMap.get(ele) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " xuất hiện " + entry.getValue() + " lần");
        }

    }
}
