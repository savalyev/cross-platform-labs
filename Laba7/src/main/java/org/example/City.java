package org.example;

public class City {
    private String name;
    private String country;
    private int population;

    private static int totalCities = 0;
    private static int totalPopulation = 0;

    public City(String name, String country, int population) {
        this.name = name;
        this.country = country;
        this.population = population;

        totalCities++;
        totalPopulation += population;
    }

    public static double getAveragePopulation() {
        if (totalCities == 0) {
            return 0;
        }
        return totalPopulation / totalCities;
    }
}
