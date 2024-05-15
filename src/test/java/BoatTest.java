import Models.Boat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    Boat boat;

    @BeforeEach
    public void setUp(){
        boat = new Boat("River Navigator",  "Docklands", 700.00, 2);
    }

    @Test
    public void canRide(){
        assertThat(boat.ride()).isEqualTo("Engine is turned off!");
        boat.startEngine();
        assertThat(boat.ride()).isEqualTo("I am riding!");
    }

    @Test
    public void canGetHarbor(){
        assertThat(boat.getHarbor()).isEqualTo("Docklands");
    }

    @Test
    public void canSetHarbor(){
        boat.setHarbor("Kingston Upon Thames");
        assertThat(boat.getHarbor()).isEqualTo("Kingston Upon Thames");
    }

    @Test
    public void canCalculateCost(){
        double expected = boat.getRentalPrice() * boat.getRentalDuration();
        assertThat(boat.calculateCost()).isEqualTo(expected);
    }

    @Test
    public void canReadPassengerMessage(){
        String message = boat.readPassengerMessage();
        assertThat(message).isEqualTo("I am on a River Navigator boat.");
    }

}
