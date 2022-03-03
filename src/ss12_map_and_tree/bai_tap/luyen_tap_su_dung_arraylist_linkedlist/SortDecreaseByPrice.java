package ss12_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.Comparator;

public class SortDecreaseByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) ( o2.getPrice() - o1.getPrice());
    }
}