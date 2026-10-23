package org.example;

import java.util.Comparator;
import java.util.List;

public class Cafe {

    private int id;
    private String name;
    private String location;
    private double rating;
    private List<Integer> visitorReviews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public List<Integer> getVisitorReviews() {
        return visitorReviews;
    }

    public void setVisitorReviews(List<Integer> visitorReviews) {
        this.visitorReviews = visitorReviews;
    }

    public Cafe(int id, String name, String location, double rating, List<Integer> visitorReviews) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rating = rating;
        this.visitorReviews = visitorReviews;
    }

    public double getAverageReview() {
        double sum = 0;
        for (Integer e : this.visitorReviews) {
            sum += e;
        }
        return sum / this.visitorReviews.size();
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", avg=" + getAverageReview() +
                '}';
    }

    public static void removeLowRated(List<Cafe> cafes) {
        cafes.removeIf(c -> c.getAverageReview() < 3);
    }

    public static void boostRating(List<Cafe> cafes) {
        cafes.stream()
                .filter(c -> c.getAverageReview() >= 4)
                .forEach(c -> c.setRating(c.getRating() + 0.5));
    }

    public static void printCafes(List<Cafe> cafes, int rating) {
        cafes.stream()
                .filter(c -> c.getRating() >= rating)
                .forEach(System.out::println);
    }

    public static void sortAndPrint(List<Cafe> cafes) {
        cafes.stream()
                .sorted(Comparator.comparingDouble(Cafe::getAverageReview).reversed().thenComparing(Cafe::getName))
                .forEach(c -> System.out.printf("ID: %d | %s | Средний рейтинг: %.2f%n",
                        c.getId(), c.getName(), c.getAverageReview()));
    }
}
