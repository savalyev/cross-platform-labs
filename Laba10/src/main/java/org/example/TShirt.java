package org.example;

public class TShirt implements Wearable, Washable {
    private String brand;
    private int size;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
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

    @Override
    public String getMaterial() {
        return "Информации о материале нет...";
    }

    public TShirt(String brand, int size, String color){
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    @Override
    public void wash(){
        System.out.println("Стирка TShirt...");
    }

    @Override
    public void wear() {
        System.out.println("Носка TShirt...");
    }
}
