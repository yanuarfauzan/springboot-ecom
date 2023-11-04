package com.kuyantox.ecommerce.models.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class OrderLog implements Serializable {
    @Id
    private String id;

    @JoinColumn
    @ManyToOne
    private Order pesanan;

    @JoinColumn
    @ManyToOne
    private User user;

    private Integer logType;

    private String logMessage;

    @Temporal(TemporalType.TIMESTAMP)
    private Date waktu;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public String getLogMessage() {
        return logMessage;
    }

    public void setLogMessage(String logMessage) {
        this.logMessage = logMessage;
    }

    public Date getWaktu() {
        return waktu;
    }

    public void setWaktu(Date waktu) {
        this.waktu = waktu;
    }

    public OrderLog(String id, Order pesanan, User user, Integer logType, String logMessage, Date waktu) {
        this.id = id;
        this.pesanan = pesanan;
        this.user = user;
        this.logType = logType;
        this.logMessage = logMessage;
        this.waktu = waktu;
    }

    public OrderLog() {
    }

}
