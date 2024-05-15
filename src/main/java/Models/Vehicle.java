package Models;

import Interfaces.Hireable;

public abstract class Vehicle implements Hireable {

    private String name;
    private String travelType;
    private double rentalPrice;
    private int rentalDuration;
    private String fuelType;
    private boolean engineStatus;

    public Vehicle(String name, double rentalPrice, int rentalDuration){
        this.name = name;
        this.rentalPrice = rentalPrice;
        this.rentalDuration = rentalDuration;
        this.travelType = "";
        this.fuelType = "";
        this.engineStatus = false;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTravelType(){
        return this.travelType;
    }

    public void setTravelType(String travelType){
        this.travelType = travelType;
    }

    public double getRentalPrice(){
        return this.rentalPrice;
    }

    public void setRentalPrice(double rentalPrice){
        this.rentalPrice = rentalPrice;
    }

    public int getRentalDuration(){
        return this.rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean getEngineStatus(){
        return this.engineStatus;
    }

    public void startEngine(){
        if (!this.engineStatus) this.engineStatus = true;
    }

    public void turnOffEngine(){
        if(this.engineStatus) this.engineStatus = false;
    }


    public abstract String readPassengerMessage();

}
