import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoatTest {

    Boat boat;

    @BeforeEach
    public void setUp(){
        boat = new Boat("River Navigator", 900.00, "Water", 10, false, "Docklands");
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

}
