package org.example;

public class App {
    public static void main(String[] args) {
        Clothing[] clothings = {
                new Clothing("Луи Витон", 46, "Фиолетовый"),
                new Clothing("Гуччи", 56, "Синий"),
                new Clothing("Найк", 33, "Белый"),
                new Jacket("Бренд1", 11, "Черный", "Мех"),
                new Jacket("Бренд2", 41, "Красный", "Кожа")
        };

        for(Clothing i : clothings){
            System.out.println("Сезон: " + i.getSeason());
        }

    }
}
