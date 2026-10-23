package org.example;

public class Jacket implements Wearable, Washable{

    private String brand;
    private int size;
    private String material;

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

    @Override
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Jacket(String brand, int size, String material){
        this.brand = brand;
        this.size = size;
        this.material = material;
    }

    @Override
    public void wash(){
        System.out.println("Стирка Jacket...");
    }

    @Override
    public void wear() {
        System.out.println("Носка Jacket...");
    }
}
