package org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        City minsk = new City("Минск", "Беларусь", 2500000);
        City moskva = new City("Москва", "России", 12500000);
        City saint_p = new City("Санкт-Перербург", "Россия", 7500000);

        System.out.println("Среднее население: " + City.getAveragePopulation());
    }
}
