package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Game {
    private String title;
    private String genre;
    private int rating;
    private int price;
    private int releaseYear;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Game(String title, String genre, int rating, int price, int releaseYear) throws InvalidGameDataException {
        this.title = title;
        this.genre = genre;
        if (rating < 1 || rating > 10) {
            throw new InvalidGameDataException(rating);
        } else {
            this.rating = rating;
        }
        if (price <= 0) {
            throw new InvalidGameDataException(price);
        } else {
            this.price = price;
        }
        this.releaseYear = releaseYear;
    }

    static public void purchase(ArrayList<Game> arr, String title) throws GameNotFoundException {
        for (Game i : arr) {
            if (i.getTitle().equals(title)) {
                System.out.println("Вы купили игру!");
                return;
            }
        }
        throw new GameNotFoundException(title);
    }

    public void updatePrice(int newPrice) throws InvalidGameDataException{
        if (newPrice <= 0) {
            throw new InvalidGameDataException(price);
        } else {
            this.price = newPrice;
        }
    }


}
