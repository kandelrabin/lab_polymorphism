package Models;

import Interfaces.Hireable;

public class Accessory implements Hireable {

    private String name;
    private double rentalPrice;
    private int rentalDuration;

    public Accessory(String name, double rentalPrice, int rentalDuration){
        this.name = name;
        this.rentalPrice = rentalPrice;
        this.rentalDuration = rentalDuration;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @Override
    public double calculateCost() {
        return this.getRentalDuration()*this.getRentalPrice();
    }
}
