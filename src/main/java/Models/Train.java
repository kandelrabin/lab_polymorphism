package Models;

public class Train extends Vehicle{

    private String departStation;
    private String finalStation;

    public Train(String name, String departStation, String finalStation, double rentalPrice, int rentalDuration){
        super(name, rentalPrice, rentalDuration);
        this.departStation = departStation;
        this.finalStation = finalStation;
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

    public void setDepartStation(String departStation){
        this.departStation = departStation;
    }

    public String getFinalStation(){
        return this.finalStation;
    }

    public void setFinalStation(String finalStation) {
        this.finalStation = finalStation;
    }

    @Override
    public double calculateCost() {
        return this.getRentalDuration()*this.getRentalPrice();
    }
}
