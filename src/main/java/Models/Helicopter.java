package Models;

public class Helicopter extends Vehicle{

    private String airport;
    private boolean isInSky;

    public Helicopter(String name, String airport, double rentalPrice, int rentalDuration){
        super(name, rentalPrice, rentalDuration);
        this.airport = airport;
        this.isInSky = false;
    }

    public String takeOff(){
        if (this.getEngineStatus() && !this.getIsInSky()) {
            this.setIsInSky(true);
            return "I am taking off!";
        } else if(this.getEngineStatus() && this.getIsInSky()){
            return "Already in the sky";
        }
        else{
            return "Engine is turned off!";
        }
    }

    public String land(){
        if (this.getIsInSky()){
            setIsInSky(false);
            return "I am landing!";
        }
        else{
            return "Already landed!";
        }
    }

    public String getAirport(){
        return this.airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public boolean getIsInSky(){
        return this.isInSky;
    }

    public void setIsInSky(boolean isInSky) {
        this.isInSky = isInSky;
    }

    @Override
    public double calculateCost(){
        return (double) this.getRentalDuration()*this.getRentalPrice();
    }

    @Override
    public String readPassengerMessage(){
        return "I love my " + this.getName() + " we are flying high!!!";
    }

}
