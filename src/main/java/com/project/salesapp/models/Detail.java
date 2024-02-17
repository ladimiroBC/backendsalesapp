package com.project.salesapp.models;

import jakarta.persistence.*;

@Entity
@Table(name="detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetail;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "idTransaction")
    private Transaction transaction;

    private double purchaseDetail;

    private double amountDetail;

    private double totalDetail;

    public Integer getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(Integer idDetail) {
        this.idDetail = idDetail;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public double getPurchaseDetail() {
        return purchaseDetail;
    }

    public void setPurchaseDetail(double purchaseDetail) {
        this.purchaseDetail = purchaseDetail;
    }

    public double getAmountDetail() {
        return amountDetail;
    }

    public void setAmountDetail(double amountDetail) {
        this.amountDetail = amountDetail;
    }

    public double getTotalDetail() {
        return totalDetail;
    }

    public void setTotalDetail(double totalDetail) {
        this.totalDetail = totalDetail;
    }
}
