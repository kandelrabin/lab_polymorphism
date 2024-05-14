import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    Helicopter helicopter;

    @BeforeEach
    public void setUp(){
        helicopter = new Helicopter("Batcopter", 1500.00, "Air", 7, false, "Heathrow");
    }

    @Test
    public void canCheckIsInSky(){
        assertThat(helicopter.isInSky()).isEqualTo(false);
    }

    @Test
    public void canTakeOff(){
        assertThat(helicopter.takeOff()).isEqualTo("Engine is turned off!");
        helicopter.startEngine();
        assertThat(helicopter.takeOff()).isEqualTo("I am taking off!");
        assertThat(helicopter.takeOff()).isEqualTo("Already in the sky");
    }

    @Test
    public void canLand(){
        assertThat(helicopter.land()).isEqualTo("Already landed!");
        helicopter.startEngine();
        helicopter.takeOff();
        assertThat(helicopter.land()).isEqualTo("I am landing!");
    }

    @Test
    public void canGetAirport(){
        assertThat(helicopter.getAirport()).isEqualTo("Heathrow");
    }

    @Test
    public void canGetFuelType(){
        assertThat(helicopter.getFuelType()).isEqualTo("");
    }

    @Test
    public void canSetFuelType(){
        helicopter.setFuelType("Jet Fuel");
        assertThat(helicopter.getFuelType()).isEqualTo("Jet Fuel");
    }

}
