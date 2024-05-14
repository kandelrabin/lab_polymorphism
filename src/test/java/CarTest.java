import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("Mercedes", "S-Class",2023, 500.00, "Road", 5, false);
    }

    // test for Abstract Vehicle class methods
    @Test
    public void canGetName(){
        assertThat(car.getName()).isEqualTo("Mercedes");
    }

    @Test
    public void canGetMaximumOccupancy(){
        assertThat(car.getMaximumOccupancy()).isEqualTo(5);
    }


    @Test
    public void canGetTravelType(){
        assertThat(car.getTravelType()).isEqualTo("Road");
    }

    @Test
    public void canCheckIsPublicTravel(){
        assertThat(car.isPublicTravel()).isEqualTo(false);
    }

    @Test
    public void canGetEngineStatus(){
        assertThat(car.getEngineStatus()).isEqualTo(false);
    }

    @Test
    public void canStartEngine(){
        car.startEngine();
        assertThat(car.getEngineStatus()).isEqualTo(true);
    }

    @Test
    public void canTurnOffEngine(){
        car.startEngine();
        car.turnOffEngine();
        assertThat(car.getEngineStatus()).isEqualTo(false);
    }

    // test for concrete Car class methods
    @Test
    public void canAccelerate(){
        assertThat(car.accelerate()).isEqualTo("Engine is turned off!");
        car.startEngine();
        assertThat(car.accelerate()).isEqualTo("I am accelerating!");
    }

    @Test
    public void canBrake(){
        assertThat(car.brake()).isEqualTo("I am braking!");
    }

    @Test
    public void canGetModel(){
        assertThat(car.getModel()).isEqualTo("S-Class");
    }

    @Test
    public void canGetYear(){
        assertThat(car.getYear()).isEqualTo(2023);
    }

    @Test
    public void canGetNumberOfWheels(){
        assertThat(car.getNumberOfWheels()).isEqualTo(4);
    }

    @Test
    public void canSetPremiumFuelType(){
        car.setFuelType("Petrol");
        assertThat(car.getFuelType()).isEqualTo("Fuel: Petrol, Premium Fuel: false");
        car.setFuelType("Petrol", true);
        assertThat(car.getFuelType()).isEqualTo("Fuel: Petrol, Premium Fuel: true");
    }


}
