package org.example;

public class Jacket extends Clothing {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Jacket(String brand, int size, String color, String material) {
        super(brand, size, color);
        this.material = material;
    }

    @Override
    public String getSeason() {
        return "Зима";
    }

    public void wash() {
        System.out.println("Jacket стирается..");
    }

    public void wash(int temp) {
        System.out.println("Jacket стирается при температуре " + temp + " градусов");
    }
}
