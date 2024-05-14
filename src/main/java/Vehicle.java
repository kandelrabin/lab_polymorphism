public abstract class Vehicle {

    protected String name;
    private double rentalPrice;
    private String travelType;
    private int maximumOccupancy;
    private boolean publicTravel;
    protected String fuelType;
    protected boolean engineStatus;

    public Vehicle(String name, double rentalPrice, String travelType, int maximumOccupancy, boolean publicTravel){
        this.name = name;
        this.rentalPrice = rentalPrice;
        this.travelType = travelType;
        this.maximumOccupancy = maximumOccupancy;
        this.publicTravel = publicTravel;
        this.fuelType = "";
        this.engineStatus = false;
    }

    public String getName(){
        return this.name;
    }

    public int getMaximumOccupancy(){
        return this.maximumOccupancy;
    }

    public String getFuelType(){
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTravelType(){
        return this.travelType;
    }

    public boolean isPublicTravel() {
        return this.publicTravel;
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


}
