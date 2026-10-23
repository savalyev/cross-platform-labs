package org.example;

public class App {
    public static void main(String[] args) {

        Computer[] computers = {
                new GamingPC("Intel Core I5 14444F", 16000, 25000000, "Nvidia RTX 5050"),
                new GamingPC("Intel Core I9 13444F", 32000, 15000000, "Nvidia RTX 5090"),
                new OfficePC("AMD Ryzen 7000 Series", 24000, 13000000, "Nvidia RTX 3050"),
                new OfficePC("Intel Core I3 4444", 8000, 2500000, "LG 60Gz"),
                new OfficePC("Intel Core I3 6543F", 8000, 6500000, "DELL 120Gz")
        };

        for (int i = 0; i < computers.length; i++) {
            System.out.println(computers[i].getPerformance());
        }

        Computer comp = new OfficePC("Intel Core I3 6543F", 8000, 6500000, "DELL 120Gz");

    }
}
