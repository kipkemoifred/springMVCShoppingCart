package org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.model;

import org.o7planning.SpringMVCAnnotationShoppingCart.Maven.project.entity.Product;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class ProductInfo {
    private String code;
    private String name;
    private double price;
    private int quantity_available;

    private boolean newProduct=false;

    // Upload file.
    private CommonsMultipartFile fileData;

    public ProductInfo() {
    }

    public ProductInfo(Product product) {
        this.code = product.getCode();
        this.name = product.getName();
        this.price = product.getPrice();
        this.quantity_available=product.getQuantity_available();
    }

    // Không thay đổi Constructor này,
    // nó được sử dụng trong Hibernate query.
    public ProductInfo(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.quantity_available=getQuantity_available();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public CommonsMultipartFile getFileData() {
        return fileData;
    }

    public void setFileData(CommonsMultipartFile fileData) {
        this.fileData = fileData;
    }

    public boolean isNewProduct() {
        return newProduct;
    }

    public void setNewProduct(boolean newProduct) {
        this.newProduct = newProduct;
    }

    public int getQuantity_available() {
        return quantity_available;
    }

    public void setQuantity_available(int quantity_available) {
        this.quantity_available = quantity_available;
    }
}
