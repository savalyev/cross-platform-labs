package org.example;

public class GameNotFoundException extends Exception {
    public GameNotFoundException(String message) {
        super("Игра не найдена: " + message);
    }
}
