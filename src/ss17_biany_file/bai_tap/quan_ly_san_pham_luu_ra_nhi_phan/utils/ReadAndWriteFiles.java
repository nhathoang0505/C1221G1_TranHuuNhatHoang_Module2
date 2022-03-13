package ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.utils;

import ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.models.Products;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFiles {
    public static final String PRODUCT_DATA_DAT = "src\\ss17_biany_file\\bai_tap\\quan_ly_san_pham_luu_ra_nhi_phan\\data\\Products.dat";

    public static List<Products> readProDuctFile() {
        List<Products> productList = new ArrayList<>();
        File file = new File(PRODUCT_DATA_DAT);
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            if (file.length() != 0) {
                fileInputStream = new FileInputStream(file);
                objectInputStream = new ObjectInputStream(fileInputStream);
                productList = (List<Products>) objectInputStream.readObject();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {

                if (fileInputStream != null) {
                    fileInputStream.close();
                    objectInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productList;
    }

    public static void writeProductFile(List<Products> productList) {
        File file = new File(PRODUCT_DATA_DAT);
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {

                if (fileOutputStream != null) {
                    fileOutputStream.close();
                    objectOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

