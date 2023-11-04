package com.kuyantox.ecommerce.models.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Product implements Serializable {
    @Id
    private String id;
    private String nama;
    private String deskripsi;
    private String gambar;
    @JoinColumn
    @ManyToOne
    private Category kategori;
    private BigDecimal harga;
    private Double stok;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public Category getKategori() {
        return kategori;
    }

    public void setKategori(Category kategori) {
        this.kategori = kategori;
    }

    public BigDecimal getHarga() {
        return harga;
    }

    public void setHarga(BigDecimal harga) {
        this.harga = harga;
    }

    public Double getStok() {
        return stok;
    }

    public void setStok(Double stok) {
        this.stok = stok;
    }

    public Product(String id, String nama, String deskripsi, String gambar, Category kategori, BigDecimal harga,
            Double stok) {
        this.id = id;
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
        this.kategori = kategori;
        this.harga = harga;
        this.stok = stok;
    }

    public Product() {
    }

}
