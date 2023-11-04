package com.kuyantox.ecommerce.models.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.kuyantox.ecommerce.models.StatusPesanan;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Order implements Serializable {
    
    @Id
    private String id;
    
    private String nomor;
    
    @Temporal(TemporalType.DATE)
    private Date tanggal;
    
    @JoinColumn
    @ManyToOne
    private User user;
    
    private String alamatPengiriman;
    
    private BigDecimal jumlah;
    
    private BigDecimal ongkir;
    
    private BigDecimal total;
    
    @Enumerated(EnumType.STRING)
    private StatusPesanan status;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomor() {
        return nomor;
    }
    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public Date getTanggal() {
        return tanggal;
    }
    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public String getAlamatPengiriman() {
        return alamatPengiriman;
    }
    public void setAlamatPengiriman(String alamatPengiriman) {
        this.alamatPengiriman = alamatPengiriman;
    }
    public BigDecimal getJumlah() {
        return jumlah;
    }
    public void setJumlah(BigDecimal jumlah) {
        this.jumlah = jumlah;
    }
    public BigDecimal getOngkir() {
        return ongkir;
    }
    public void setOngkir(BigDecimal ongkir) {
        this.ongkir = ongkir;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public void setTotal(BigDecimal total) {
        this.total = total;
    }
    public StatusPesanan getStatus() {
        return status;
    }
    public void setStatus(StatusPesanan status) {
        this.status = status;
    }
    public Order() {
    }

    

}
