package org.example;

import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("\n1 - задача №1\n" +
                    "2 - задача №2\n" +
                    "3 - задача №3\n" +
                    "0 - выход\n" +
                    "Выберите действие: ");

            int choise = in.nextInt();
            in.nextLine();

            switch (choise) {

                case 1:
                    Train train = new Train("Минск", "F123", LocalTime.of(15, 30));
                    System.out.println(train.info());
                    train.isDelayed(30);
                    System.out.println();
                    System.out.println(train.info());
                    break;

                case 2:
                    Sportsmen[] sportsmens = new Sportsmen[5];

                    System.out.println("Заполинте данные о спортсменах");
                    for(int i = 0; i < sportsmens.length; i++){
                        System.out.println("Спортсмен №" + (i+1));
                        System.out.print("Введите имя: ");
                        String name = in.next();
                        System.out.print("Введите вид спорта: ");
                        String sport = in.next();
                        System.out.print("Введите кол-во очков: ");
                        double score = in.nextDouble();

                        sportsmens[i] = new Sportsmen(name, sport, score);
                    }
                    double max = sportsmens[0].getScore();
                    int index = 0;
                    double sumScore = 0;
                    for(int i = 0; i < sportsmens.length; i++){
                        if(sportsmens[i].getScore() > max){
                            max = sportsmens[i].getScore();
                            index = i;
                        }
                        sumScore += sportsmens[i].getScore();
                    }

                    System.out.println("Спортсмен с лучшим результатом: " + sportsmens[index].getName() + " | " + max + " очк.");
                    System.out.println("Среднее среди спортсменов: " + (sumScore/ sportsmens.length));
                    break;

                case 3:
                    Product[] products = new Product[6];
                    System.out.println("Заполинте данные о товарах");
                    for(int i = 0; i < products.length; i++){
                        System.out.println("Товар №" + (i+1));
                        System.out.print("Введите имя: ");
                        String name = in.next();

                        for(Category cat : Category.values()){
                            System.out.println(cat.name());
                        }
                        System.out.print("Введите категорию: ");
                        String category = in.next();

                        Category category1 = Category.valueOf(category);

                        products[i] = new Product(name, category1);
                    }

                    System.out.println("Товары категории ELECTRONICS: ");
                    for(Product prod : products){
                        if(prod.getCategory() == Category.ELECTRONICS){
                            System.out.println(prod.info());
                        }
                    }
                    break;

                case 4:
                    break;

                case 0:
                    in.close();
                    return;

                default:
                    System.out.println("Мимо");
                    break;
            }
        }

    }
}
