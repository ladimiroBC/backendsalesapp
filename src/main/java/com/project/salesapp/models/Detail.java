package com.project.salesapp.models;

import jakarta.persistence.*;

@Entity
@Table(name="detail")
public class Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDetail")
    private Integer idDetail;

    @ManyToOne
    @JoinColumn(name = "idProduct")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "idTransaction")
    private Transaction transaction;

    @Column(name = "purchaseDetail")
    private double purchaseDetail;

    @Column(name = "amountDetail")
    private double amountDetail;

    @Column(name = "totalDetail")
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
