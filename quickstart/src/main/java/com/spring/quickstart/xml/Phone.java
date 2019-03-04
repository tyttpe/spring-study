package com.spring.quickstart.xml;

/**
 * Created by DELL on 2019/2/25.
 */
public class Phone {
    private String Brand;
    private String color;
    private String price;

    public Phone(String brand, String color, String price) {
        Brand = brand;
        this.color = color;
        this.price = price;
    }

    public Phone(){

    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "Brand='" + Brand + '\'' +
                ", color='" + color + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
