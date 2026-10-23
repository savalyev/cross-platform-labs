package org.example;

public class App {
    public static void main(String[] args) {

        Wearable[] chotles = {
                new Jacket("Бренд 1", 43, "Кожа"),
                new Jacket("Бренд 2", 123, "Эко-кожа"),
                new Jacket("Бренд 3", 54, "Мех"),
                new TShirt("Бренд 4", 74, "Фиолетовый"),
                new TShirt("Бренд 5", 10, "Черный"),
        };


        for(int i = 0; i < chotles.length; i++){
            chotles[i].wear();

            if(chotles[i] instanceof Washable washable){
                washable.wash();
            }
        }
    }
}
