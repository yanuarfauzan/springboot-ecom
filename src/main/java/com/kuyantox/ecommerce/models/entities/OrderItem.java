package com.kuyantox.ecommerce.models.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItem implements Serializable {

    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Order pesanan;

    private Product produk;

    private String deskripsi;

    private Double kuantitas;

    private BigDecimal harga;

    private BigDecimal jumlah;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Order getPesanan() {
        return pesanan;
    }

    public void setPesanan(Order pesanan) {
        this.pesanan = pesanan;
    }

    public Product getProduk() {
        return produk;
    }

    public void setProduk(Product produk) {
        this.produk = produk;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
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

    public OrderItem() {
    }

}
