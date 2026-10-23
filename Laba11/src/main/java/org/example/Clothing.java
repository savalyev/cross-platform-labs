package org.example;

public class Clothing {
    private String brand;
    private int size;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothing(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public void wear() {
        System.out.println("Одеваю");
    }

    public void wear(String occasion) {
        System.out.println("Одеваю для " + occasion);
    }

    public void wear(int temp) {
        System.out.println("Одеваю при " + temp + " °C");
    }

    public String getSeason() {
        return "Всесезонная";
    }
}
