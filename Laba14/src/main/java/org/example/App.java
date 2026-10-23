package org.example;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        for (; ; ) {
            System.out.println("1 - задание №1\n" +
                    "2 - задание №2\n" +
                    "3 - задание №3\n" +
                    "4 - задание №4\n" +
                    "5 - задание №5\n" +
                    "0 - выход\n" +
                    "Выберите вариант работы программы: ");
            int choise = in.nextInt();
            switch (choise) {
                case 1: {
                    Path p = Path.of("sport.txt");
                    Files.writeString(p, "Мой любимый спорт - баскетбол\n", StandardCharsets.UTF_8);
                    System.out.println("Имя файла: " + p.getFileName());
                    System.out.println("Путь файла: " + p.toAbsolutePath());
                    System.out.println("Размер файла: " + Files.size(p) + " байт");
                    System.out.printf("Информация с файла: " + Files.readString(p, StandardCharsets.UTF_8));

                    break;
                }
                case 2: {
                    System.out.println("Введите 10 целых чисел: ");
                    try (PrintWriter pw = new PrintWriter("f.txt", StandardCharsets.UTF_8)) {
                        for (int i = 0; i < 10; i++) {
                            pw.println((in.nextInt()));
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }

                    int count = 0;
                    System.out.println("Числа из файла:");
                    try (Scanner inFile = new Scanner(new File("f.txt"), StandardCharsets.UTF_8)) {
                        while (inFile.hasNextInt()) {
                            int x = inFile.nextInt();
                            System.out.print(x + " ");
                            if (x % 3 == 0) count++;
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }
                    System.out.println("Количество чисел кратных 3: " + count);
                }
                case 3: {
                    Random rand = new Random();
                    try (PrintWriter pw = new PrintWriter("f3.txt", StandardCharsets.UTF_8)) {
                        for (int i = 0; i < 10; i++) {
                            pw.println(rand.nextInt(150));
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }

                    try (Scanner inFile = new Scanner(new File("f.txt"));
                         PrintWriter g = new PrintWriter("g.txt", StandardCharsets.UTF_8);
                         PrintWriter h = new PrintWriter("h.txt", StandardCharsets.UTF_8)) {
                        while (inFile.hasNextInt()) {
                            int x = inFile.nextInt();
                            if (isPrime(x)) g.println(x);
                            else h.println(x);

                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }
                    System.out.println("f3.txt: " + Files.readAllLines(Path.of("f3.txt")));
                    System.out.println("g.txt (простые): " + Files.readAllLines(Path.of("g.txt")));
                    System.out.println("h.txt (тяжелые): " + Files.readAllLines(Path.of("h.txt")));
                    break;
                }
                case 4: {
                    System.out.println("Введите значения киллометров: ");
                    in.useLocale(Locale.US);
                    try (PrintWriter pw = new PrintWriter("km.txt")) {
                        for (int i = 0; i < 10; i++) {
                            pw.println(in.nextDouble());
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }

                    double sum = 0;
                    int count = 0;

                    try (Scanner inFile = new Scanner(new File("km.txt"))) {
                        inFile.useLocale(Locale.US); //это пи***
                        while (inFile.hasNextDouble()) {
                            sum += inFile.nextDouble();
                            count++;
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }

                    System.out.println("Среднее арифм.: " + sum / count);
                    break;
                }
                case 5: {
                    Random rnd = new Random();

                    try (PrintWriter f = new PrintWriter("f5.txt")) {
                        for (int i = 0; i < 10; i++) {
                            f.println(rnd.nextInt(101) - 50);
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }

                    int count = 0;
                    System.out.print("Числа в f5.txt: ");
                    try (Scanner inFile = new Scanner(new File("f5.txt"))) {
                        while (inFile.hasNextInt()) {
                            int x = inFile.nextInt();
                            System.out.print(x + " ");
                            if (x % 4 == 0) count++;
                        }
                    } catch (Exception ex) {
                        System.out.println("Error: " + ex);
                    }
                    System.out.println("\nКоличество чисел, кратных 4: " + count);
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    continue;
                }
            }
        }
    }

    static boolean isPrime(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return false;
    }
}
