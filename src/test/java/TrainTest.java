import Models.Train;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TrainTest {

    Train train;

    @BeforeEach
    public void setUp(){
        train = new Train("NWR", "London", "Manchester", 5000.00, 3);
    }

    @Test
    public void canAccelerate(){
        assertThat(train.accelerate()).isEqualTo("Engine is turned off!");
        train.startEngine();
        assertThat(train.accelerate()).isEqualTo("I am accelerating!");
    }

    @Test
    public void canBrake(){
        assertThat(train.brake()).isEqualTo("I am braking!");
    }

    @Test
    public void canGetDepartStation(){
        assertThat(train.getDepartStation()).isEqualTo("London");
    }

    @Test
    public void canSetDepartStation(){
        train.setDepartStation("Guildford");
        assertThat(train.getDepartStation()).isEqualTo("Guildford");
    }

    @Test
    public void canGetFinalStation(){
        assertThat(train.getFinalStation()).isEqualTo("Manchester");
    }

    @Test
    public void canSetFinalStation(){
        train.setFinalStation("Southampton");
        assertThat(train.getFinalStation()).isEqualTo("Southampton");
    }

    @Test
    public void canCalculateCost(){
        double expected = train.getRentalPrice() * train.getRentalDuration();
        assertThat(train.calculateCost()).isEqualTo(expected);
    }

    @Test
    public void canReadPassengerMessage(){
        String message = train.readPassengerMessage();
        assertThat(message).isEqualTo("Loving the scenery. I am on a NWR train.");
    }

}
