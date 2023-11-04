package com.kuyantox.ecommerce.models.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category implements Serializable {
    @Id
    private String id;
    private String nama;

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

    public Category(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public Category() {
    }

}
