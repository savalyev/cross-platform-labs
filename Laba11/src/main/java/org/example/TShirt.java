package org.example;

public class TShirt extends Clothing {
    private char sex;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public TShirt(String brand, int size, String color, char sex) {
        super(brand, size, color);
        this.sex = sex;
    }

    @Override
    public String getSeason() {
        return "Лето";
    }

    public void isStored() {
        System.out.println("TShir хранится");
    }

    public void isStored(String storageLocation) {
        System.out.println("TShir хранится в " + storageLocation);
    }


}
