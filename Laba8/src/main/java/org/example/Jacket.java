package org.example;

public class Jacket extends Clothing{
    private String material;

    public void setMaterial(String material){
        this.material = material;
    }

    public String getMaterial(){
        return material;
    }

    public Jacket(String brand, int size, String color, String material){
        super(brand, size, color);
        this.material = material;
    }

    public String getSeason(){
        if(material.equals("Мех")){
            return "Зима";
        }
        return "Осень";
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nМатериал: " + this.material);
    }
}
