package com.project.salesapp.models;

import jakarta.persistence.*;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct")
    private Integer idProduct;

    @Column(name = "productName")
    private String productName;

    @Column(name = "purchaseValue")
    private double purchaseValue;

    @Column(name = "purchaseSale")
    private double purchaseSale;

    @Column(name = "amount")
    private double amount;

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPurchaseValue() {
        return purchaseValue;
    }

    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }

    public double getPurchaseSale() {
        return purchaseSale;
    }

    public void setPurchaseSale(double purchaseSale) {
        this.purchaseSale = purchaseSale;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
