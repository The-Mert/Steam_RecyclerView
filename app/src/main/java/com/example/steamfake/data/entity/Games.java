package com.example.steamfake.data.entity;

import java.io.Serializable;

public class Games implements Serializable {
    private int id;
    private String name;
    private String image;
    private String price;
    private String discount_amount;
    private String price_before;

    public Games() {
    }

    public Games(int id, String name, String image, String price, String discount_amount, String price_before) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.price = price;
        this.discount_amount = discount_amount;
        this.price_before = price_before;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount_amount() {
        return discount_amount;
    }

    public void setDiscount_amount(String discount_amount) {
        this.discount_amount = discount_amount;
    }

    public String getPrice_before() {
        return price_before;
    }

    public void setPrice_before(String price_before) {
        this.price_before = price_before;
    }
}
