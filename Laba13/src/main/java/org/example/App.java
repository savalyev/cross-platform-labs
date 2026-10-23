package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            ArrayList<Game> list = new ArrayList<>();
            list.add(new Game("GTA 6", "Открытый мир", 10, 10000, 2026));
            list.add(new Game("GTA 5", "Открытый мир", 9, 8000, 2013));
            list.add(new Game("GTA 4", "Открытый мир", 7, 6000, 2007));
            list.add(new Game("GTA 3", "Открытый мир", 6, 4000, 2003));
            list.add(new Game("GTA 2", "Открытый мир", 2, 1000, 1996));

            Game.purchase(list, "GTA 6");
            Game.purchase(list, "Пипи");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
