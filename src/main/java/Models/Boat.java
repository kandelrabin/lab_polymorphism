package Models;

public class Boat extends Vehicle{

    private String harbor;

    public Boat(String name, String harbor, double rentalPrice, int rentalDuration){
        super(name, rentalPrice, rentalDuration);
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

    public void setHarbor(String harbor){
        this.harbor = harbor;
    }

    @Override
    public double calculateCost() {
        return this.getRentalDuration()*this.getRentalPrice();
    }

    @Override
    public String readPassengerMessage(){
        return "I am on a "+ this.getName() + " boat.";
    }
}
