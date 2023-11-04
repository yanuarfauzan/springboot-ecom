package com.kuyantox.ecommerce.models.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Cart implements Serializable {

    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Product produk;

    @JoinColumn
    @ManyToOne
    private User user;

    private Double kuantitas;

    private BigDecimal harga;

    private BigDecimal jumlah;

    @Temporal(TemporalType.TIMESTAMP)
    private Date waktuDibuat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product getProduk() {
        return produk;
    }

    public void setProduk(Product produk) {
        this.produk = produk;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getKuantitas() {
        return kuantitas;
    }

    public void setKuantitas(Double kuantitas) {
        this.kuantitas = kuantitas;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public BigDecimal getJumlah() {
        return jumlah;
    }

    public void setJumlah(BigDecimal jumlah) {
        this.jumlah = jumlah;
    }

    public Cart(String id, Product produk, User user, Double kuantitas, BigDecimal harga, BigDecimal jumlah) {
        this.id = id;
        this.produk = produk;
        this.user = user;
        this.kuantitas = kuantitas;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public Cart() {
    }

}
