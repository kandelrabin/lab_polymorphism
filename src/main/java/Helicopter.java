public class Helicopter extends Vehicle{

    private String airport;
    private boolean inSky;

    public Helicopter(String name, double rentalPrice, String travelType, int maximumOccupancy, boolean publicTravel, String airport){
        super(name, rentalPrice, travelType, maximumOccupancy, publicTravel);
        this.airport = airport;
        this.inSky = false;
    }

    public boolean isInSky(){
        return this.inSky;
    }

    public String takeOff(){
        if (this.getEngineStatus() && !this.inSky) {
            this.inSky = true;
            return "I am taking off!";
        } else if(this.getEngineStatus() && this.inSky){
            return "Already in the sky";
        }
        else{
            return "Engine is turned off!";
        }
    }

    public String land(){
        if (this.isInSky()){
            return "I am landing!";
        }
        else{
           return "Already landed!";
        }
    }

    public String getAirport(){
        return this.airport;
    }

}
