package ss11_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.Comparator;

public class SortIncreaseByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return (int) ( o1.getPrice() - o2.getPrice());
    }
}
