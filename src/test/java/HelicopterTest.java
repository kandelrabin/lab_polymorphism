import Models.Helicopter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class HelicopterTest {

    Helicopter helicopter;

    @BeforeEach
    public void setUp(){
        helicopter = new Helicopter("Batcopter", "Heathrow", 2000.00, 1);
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
    public void cansetAirport(){
        helicopter.setAirport("Gatwick");
        assertThat(helicopter.getAirport()).isEqualTo("Gatwick");
    }

    public void canGetIsInSky(){
        assertThat(helicopter.getIsInSky()).isEqualTo(false);
    }

    @Test
    public void canSetIsInSky(){
        helicopter.setIsInSky(true);
        assertThat(helicopter.getIsInSky()).isEqualTo(true);
    }

    @Test
    public void canCalculateCost(){
        double expected = helicopter.getRentalPrice() * helicopter.getRentalDuration();
        assertThat(helicopter.calculateCost()).isEqualTo(expected);
    }

    @Test
    public void canReadPassengerMessage(){
        String message = helicopter.readPassengerMessage();
        assertThat(message).isEqualTo("I love my Batcopter we are flying high!!!");
    }
}
