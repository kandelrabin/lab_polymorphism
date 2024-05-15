package Models;

public class Car extends Vehicle {

    private String model;
    private int year;

    public Car(String name, String model, int year, double rentalPrice, int rentalDuration){
        super(name, rentalPrice, rentalDuration);
        this.model = model;
        this.year = year;
    }

    public String accelerate(){
        if (this.getEngineStatus()) {
            return "I am accelerating!";
        } else {
            return "Engine is turned off!";
        }
    }

    public String brake(){
        return "I am braking!";
    }

    public String getModel(){
        return this.model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getYear(){
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method overloading
    public void setFuelType(String fuelType, boolean isPremiumFuel){
        this.setFuelType("Fuel: " + fuelType + ", Premium Fuel: "+ isPremiumFuel);
    }

    // Implementation of Interface method
    @Override
    public double calculateCost(){
        return (double) this.getRentalDuration()*this.getRentalPrice();
    }


}
