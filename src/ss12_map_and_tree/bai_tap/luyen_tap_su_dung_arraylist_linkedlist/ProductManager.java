package ss12_map_and_tree.bai_tap.luyen_tap_su_dung_arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
    static ArrayList<Product> arrayList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        arrayList.add(new Product("Hoang", 5597, 999));
        arrayList.add(new Product("Nghia", 2601, 888));
        arrayList.add(new Product("An", 1608, 777));
    }

    public static void add() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập id sản phẩm: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá sản phẩm: ");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(name, id, price);
        arrayList.add(product);
    }

    public static void edit() {
        System.out.println("Nhập id sản phẩm muốn sửa: ");
        int idEdit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (idEdit == arrayList.get(i).getId()) {
                System.out.println("Nhập tên muốn sửa: ");
                String nameEdit = scanner.nextLine();
                arrayList.get(i).setName(nameEdit);
                System.out.println("Nhập giá muốn sửa: ");
                double priceEdit = Double.parseDouble(scanner.nextLine());
                arrayList.get(i).setPrice(priceEdit);
            }
        }
    }

    public static void delete() {
        System.out.println("Nhập id sản phẩm muốn xoá: ");
        int idDelete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrayList.size(); i++) {
            if (idDelete == arrayList.get(i).getId()) {
                arrayList.remove(arrayList.get(i));
            }
        }
    }

    public static void display() {
        for (Product product : arrayList) {
            System.out.println(product);
        }
    }

    public static void findProductByName() {
        System.out.println("Nhập tên sản phẩm muốn tìm: ");
        String findName = scanner.nextLine();
        for (int i = 0; i < arrayList.size(); i++) {
            if (findName.toLowerCase().equals(arrayList.get(i).getName().toLowerCase())) {
                System.out.println(arrayList.get(i));
            }
        }
    }

    public static void sortByPrice() {
        System.out.println("Chọn 1 để sắp xếp tăng dần, chọn 2 để sắp xếp giảm dần: ");
        int choice = Integer.parseInt(scanner.nextLine());
        if (choice == 1) {
            arrayList.sort(new SortIncreaseByPrice());
        } else {
            arrayList.sort(new SortDecreaseByPrice());
        }
        display();
    }

}
