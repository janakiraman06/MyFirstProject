package com.example.demo1.entity;

/**
 * Created by Janak on 11-04-2020.
 */

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Vegetables {
    @Id
    int code;
    String veg_name;
    float price;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getVeg_name() {
        return veg_name;
    }

    public void setVeg_name(String veg_name) {
        this.veg_name = veg_name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
