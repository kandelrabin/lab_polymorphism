public class Boat extends Vehicle{

    private String harbor;

    public Boat(String name, double rentalPrice, String travelType, int maximumOccupancy, boolean publicTravel, String harbor){
        super(name, rentalPrice, travelType, maximumOccupancy, publicTravel);
        this.harbor = harbor;
    }

    public String ride(){
        if (this.getEngineStatus()){
            return "I am riding!";
        } else {
            return "Engine is turned off!";
        }
    }

    public String getHarbor(){
        return this.harbor;
    }
}
