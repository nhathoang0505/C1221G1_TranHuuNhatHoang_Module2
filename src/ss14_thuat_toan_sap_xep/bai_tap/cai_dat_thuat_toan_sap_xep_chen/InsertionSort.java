package ss14_thuat_toan_sap_xep.bai_tap.cai_dat_thuat_toan_sap_xep_chen;

public class InsertionSort {
    static int[] list = {2, 9, 5, 4, 8, 1, 6};

    public static void insertionSort(int[] list) {
        int pos, x;
        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếp
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
