package org.example;

public abstract class Computer {
    private String processor;
    private int ram;
    private int storage;

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public Computer(String processor, int ram, int storage) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
    }

    public abstract String getPerformance();

    public abstract String getPurpose();

    public void displayInfo() {
        System.out.println("Процессор: " + this.processor +
                "\nОЗУ: " + this.ram + " МБ" +
                "\nХранилище: " + this.storage + " МБ");
    }
}
