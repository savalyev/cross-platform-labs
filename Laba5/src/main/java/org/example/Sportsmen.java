package org.example;

public class Sportsmen {
    private String name;
    private String sport;
    private double score;

    public Sportsmen() {
    }

    public Sportsmen(String name, String sport, double score) {
        this.name = name;
        this.sport = sport;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName(){
        return name;
    }

    public String getSport(){
        return sport;
    }

    public double getScore(){
        return score;
    }



}
