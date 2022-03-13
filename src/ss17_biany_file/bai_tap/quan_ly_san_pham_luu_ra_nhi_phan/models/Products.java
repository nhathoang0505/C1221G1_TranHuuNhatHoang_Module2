package ss17_biany_file.bai_tap.quan_ly_san_pham_luu_ra_nhi_phan.models;

import java.io.Serializable;

public class Products implements Serializable {
    private int productsCode;
    private String productsName;
    private String productsCompany;
    private long price;

    public Products(int productsCode, String productsName, String productsCompany, long price) {
        this.productsCode = productsCode;
        this.productsName = productsName;
        this.productsCompany = productsCompany;
        this.price = price;
    }

    public int getProductsCode() {
        return productsCode;
    }

    public void setProductsCode(int productsCode) {
        this.productsCode = productsCode;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public String getProductsCompany() {
        return productsCompany;
    }

    public void setProductsCompany(String productsCompany) {
        this.productsCompany = productsCompany;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "productsCode=" + productsCode +
                ", productsName='" + productsName + '\'' +
                ", productsCompany='" + productsCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
