package org.example;
import java.time.LocalTime;

public class Train {
    private String destination;
    private String trainNumber;
    private LocalTime departureTime;

    public Train(){

    }

    public Train(String destination, String trainNumber, LocalTime departureTime){
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public void isDelayed(int minutes){
        this.departureTime = this.departureTime.plusMinutes(minutes);
    }

    public String info(){
        return "Поезд: " + trainNumber +
                "\nМесто прибытия: " + destination +
                "\nВремя отправления: " + departureTime.toString();
    }
}
