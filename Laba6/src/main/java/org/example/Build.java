package org.example;

public class Build {
    private String adress;
    private int floors;
    private double totalArea;
    private int[] numApartaments;

    public void setNumApartaments(int[] numApartaments){
        this.numApartaments = numApartaments;
    }

    public int[] getNumApartaments(){
        return numApartaments;
    }

    public Build(String adress, int floors, double totalArea, int[] numApartaments){
//        this.adress = adress;
//        this.floors = floors;
//        this.totalArea = totalArea;
        this(adress, floors, totalArea);
        this.numApartaments = numApartaments;
    }





















    public Build(){

    }

    public Build(String adress, int floors, double totalArea){
        this.adress = adress;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }
    public void setFloors(int floors){
        this.floors = floors;
    }
    public void setTotalArea(double totalArea){
        this.totalArea = totalArea;
    }

    public String getAdress(){
        return adress;
    }

    public int getFloors(){
        return floors;
    }
    public double getTotalArea(){
        return totalArea;
    }
    public double averageAreaPerFloor(){
        return totalArea/floors;
    }
}
