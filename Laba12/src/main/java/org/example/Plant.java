package org.example;

public class Plant {
    private String name;
    private int id;
    private int height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Plant(String name, int id, int height) {
        this.name = name;
        this.id = id;
        this.height = height;
    }

    public String toString() {
        return "Название: " + this.name + ". ID: " + this.id + ". Рост: " + this.height;
    }

}
