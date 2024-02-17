package com.project.salesapp.models;

import jakarta.persistence.*;

@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTransaction")
    private Integer idTransaction;

    @Column(name = "transactionType")
    private String transactionType;

    @Column(name = "transactionDate")
    private String transactionDate;

    @Column(name = "seller")
    private String seller;

    @Column(name = "buyer")
    private String buyer;

    @Column(name = "total")
    private double total;

    public Integer getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(Integer idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
