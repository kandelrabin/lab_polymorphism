public class Train extends Vehicle{

    private String departStation;
    private String finalStation;
    private int numberOfWheels;

    public Train(String name, String departStation, String finalStation, double rentalPrice, String travelType, int maximumOccupancy, boolean publicTravel){
        super(name, rentalPrice, travelType, maximumOccupancy, publicTravel);
        this.departStation = departStation;
        this.finalStation = finalStation;
        this.numberOfWheels = 40;
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

    public String getDepartStation(){
        return this.departStation;
    }

    public String getFinalStation(){
        return this.finalStation;
    }

    public int getNumberOfWheels(){
        return this.numberOfWheels;
    }

}
