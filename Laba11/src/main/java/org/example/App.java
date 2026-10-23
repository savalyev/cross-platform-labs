package org.example;

public class App {
    public static void main(String[] args) {
        Clothing clothing = new Clothing("Nike", 46, "Белый");

        clothing.wear();
        clothing.wear(50);
        clothing.wear("кино");
    }
}
