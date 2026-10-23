package org.example;

public class OfficePC extends Computer {

    private String monitor;

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public OfficePC(String proccesor, int ram, int storage, String monitor) {
        super(proccesor, ram, storage);
        this.monitor = monitor;
    }

    @Override
    public String getPerformance() {
        return "Средняя";
    }

    @Override
    public String getPurpose() {
        return "Для офисной работы";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Монитор: " + this.monitor);
    }
}
