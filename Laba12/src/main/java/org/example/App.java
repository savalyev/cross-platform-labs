package org.example;


import java.util.*;

public class App {

    public static void getValues(Map<String, Plant> plants){

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("1 - задание №1\n" +
                    "2 - задание №2\n" +
                    "0 - выход");
            int choise = in.nextInt();

            switch (choise) {
                case 1: {

                    Map<String, Plant> map = new HashMap<>();
                    map.put("Дуб", new Tree("Дуб", 1, 300, 50));
                    map.put("Сосна", new Tree("Сосна", 2, 200, 30));
                    map.put("Береза", new Tree("Береза", 3, 100, 10));
                    map.put("Роза", new Flower("Роза", 4, 10, "Розовый"));
                    map.put("Лилия", new Flower("Лилия", 5, 20, "Белый"));
                    map.put("Тюльпан", new Flower("Тюльпан", 6, 25, "Красный"));
                    map.put("Калина", new Shrub("Калина", 7, 55, 67));
                    map.put("Боярышник", new Shrub("Боярышник", 8, 65, 11));

                    for (Map.Entry<String, Plant> e : map.entrySet()) {
                        System.out.println(e.getKey() + " -> " + e.getValue().toString());
                    }

                    break;
                }
                case 2: {
                    List<Cafe> cafes = new ArrayList<>(List.of(
                            new Cafe(1, "Шоколадница", "Москва, Тверская 12", 4.5, List.of(5, 4, 5, 4, 5)),
                            new Cafe(2, "Кофе Хауз", "СПб, Невский 45", 4.2, List.of(4, 4, 5, 3, 5)),
                            new Cafe(3, "Starbucks", "Казань, Баумана 8", 4.7, List.of(5, 5, 4, 5, 5)),
                            new Cafe(4, "Додо Пицца", "Новосибирск, Красный 100", 4.8, List.of(5, 5, 5, 4, 5)),
                            new Cafe(5, "Чайхана", "Екатеринбург, Ленина 24", 3.9, List.of(3, 4, 4, 4, 4))
                    ));

                    Cafe.removeLowRated(cafes);
                    Cafe.boostRating(cafes);
                    Cafe.printCafes(cafes, 3);
                    Cafe.sortAndPrint(cafes);
                    break;
                }
            }

        }
    }
}
