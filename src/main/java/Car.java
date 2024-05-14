public class Car extends Vehicle {

    private String model;
    private int year;
    private int numberOfWheels;
    public boolean isPremiumFuel;

    public Car(String name, String model, int year, double rentalPrice, String travelType, int maximumOccupancy, boolean publicTravel){
        super(name, rentalPrice, travelType, maximumOccupancy, publicTravel);
        this.model = model;
        this.year = year;
        this.numberOfWheels = 4;
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

    public int getYear(){
        return this.year;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

    public void setFuelType(String fuelType, boolean isPremiumFuel){
        this.fuelType = fuelType;
        this.isPremiumFuel = isPremiumFuel;
    }

    public String getFuelType(){
        return "Fuel: " + this.fuelType + ", Premium Fuel: "+ this.isPremiumFuel;
    }

}
