package ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.services;


import ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.models.Products;
import ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.utils.ReadAndWriteFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductsServicesImpl implements IServices {
    Scanner scanner = new Scanner(System.in);
    static List<Products> productsList = new ArrayList<>();
    static {
        productsList = ReadAndWriteFiles.readProDuctFile();
    }

    @Override
    public void add() {
        System.out.println("Input products Code: ");
        int productsCode = Integer.parseInt(scanner.nextLine());
        System.out.println("Input products Name:");
        String productsName = scanner.nextLine();
        System.out.println("Input products Company: ");
        String productsCompany = scanner.nextLine();
        System.out.println("Input price: ");
        long price = Long.parseLong(scanner.nextLine());
        Products products = new Products(productsCode, productsName, productsCompany, price);
        productsList.add(products);
        ReadAndWriteFiles.writeProductFile(productsList);
    }

    @Override
    public void display() {
        for (Products e : productsList) {
            System.out.println(e);
        }
    }

    @Override
    public void search(String name) {
        List<Products> searchingList = new ArrayList<>();
        for (Products e : productsList) {
            if (e.getProductsName().toLowerCase().contains(name.toLowerCase())) {
                searchingList.add(e);
            }
        }
        for (Products list : searchingList) {
            System.out.println(list);
        }
    }
}
