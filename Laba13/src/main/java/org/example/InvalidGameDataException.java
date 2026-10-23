package org.example;

public class InvalidGameDataException extends Exception {
    public InvalidGameDataException(String message) {
        super("Неверные данные: " + message);
    }
    public InvalidGameDataException(int value) {
        super("Неверные данные: " + value);
    }
}
