package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class Clothing {
    private String brand;
    private int size;
    private String color;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Clothing(String brand, int size, String color) {
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public String getSeason() {
        switch (LocalDate.now().getMonthValue()) {
            case 1:
                return "Сейчас середина зимы...";
            case 2:
                return "Скоро конец зимы...";
            case 3:
                return "Вот и весна!!";
            case 4:
                return "Середина весны :)";
            case 5:
                return "Скоро лето, конец весны...";
            case 6:
                return "Лето началось...";
            case 7:
                return "Середина лета...";
            case 8:
                return "Конец лета, скоро в школу :(";
            case 9:
                return "В школу, школьники";
            case 10:
                return "Вот и середина осени";
            case 11:
                return "Конец осени, зима скоро..";
            case 12:
                return "Началась зима...";
            default:
                return "Ошибочка";
        }
    }

    public void displayInfo(){
        System.out.println("Бренд: " + this.brand +
                "\nРазмер: " + this.size +
                "\nЦвеь: " + this.color);
    }
}
