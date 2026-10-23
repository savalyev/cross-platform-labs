package org.example;

public class Flower extends Plant {

    private String bloomColor;

    public String getBloomColor() {
        return bloomColor;
    }

    public void setBloomColor(String bloomColor) {
        this.bloomColor = bloomColor;
    }

    public Flower(String name, int id, int height, String bloomColor) {
        super(name, id, height);
        this.bloomColor = bloomColor;
    }

    @Override
    public String toString() {
        return super.toString().concat(". Цвет цветков: " + this.bloomColor);
    }
}
