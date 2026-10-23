package org.example;

public class App {
    public static void main(String[] args) {
        Build build = new Build("Колесникова 3", 5, 555.55);
        System.out.println(build.averageAreaPerFloor());
    }
}
