package org.example;

public class GamingPC extends Computer {
    private String videoCard;

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public GamingPC(String proccesor, int ram, int storage, String videoCard) {
        super(proccesor, ram, storage);
        this.videoCard = videoCard;
    }

    @Override
    public String getPerformance() {
        return "Высокая";
    }

    @Override
    public String getPurpose() {
        return "Для игр";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Видеокарта: " + this.videoCard);
    }


}
