import Models.Accessory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AccessoryTest {

    Accessory accessory;

    @BeforeEach
    public void setUp(){
        accessory = new Accessory("SatNav", 100.00, 3);
    }

    @Test
    public void canGetName(){
        assertThat(accessory.getName()).isEqualTo("SatNav");
    }

    @Test
    public void canSetName(){
        accessory.setName("Tyre Inflator");
        assertThat(accessory.getName()).isEqualTo("Tyre Inflator");
    }

    @Test
    public void canGetRentalPrice(){
        assertThat(accessory.getRentalPrice()).isEqualTo(100.00);
    }

    @Test
    public void canSetRentalPrice(){
        accessory.setRentalPrice(200.00);
        assertThat(accessory.getRentalPrice()).isEqualTo(200.00);
    }

    @Test
    public void canGetRentalDuration(){
        assertThat(accessory.getRentalDuration()).isEqualTo(3);
    }

    @Test
    public void canSetRentalDuration(){
        accessory.setRentalDuration(5);
        assertThat(accessory.getRentalDuration()).isEqualTo(5);
    }

    @Test
    public void canCalculateCost(){
        double expected = accessory.getRentalDuration() * accessory.getRentalPrice();
        assertThat(accessory.calculateCost()).isEqualTo(expected);
    }


}
