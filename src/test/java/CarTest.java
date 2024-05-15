import Models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {

    Car car;

    @BeforeEach
    public void setUp(){
        car = new Car("Mercedes", "S-Class",2023, 500.00, 2);
    }

    // test for Abstract Models.Vehicle class methods
    @Test
    public void canGetName(){
        assertThat(car.getName()).isEqualTo("Mercedes");
    }

    @Test
    public void canSetName(){
        car.setName("BMW");
        assertThat(car.getName()).isEqualTo("BMW");
    }

    @Test
    public void canGetTravelType(){
        assertThat(car.getTravelType()).isEqualTo("");
    }

    @Test
    public void canSetTravelType(){
        car.setTravelType("Road");
        assertThat(car.getTravelType()).isEqualTo("Road");
    }

    @Test
    public void canGetRentalPrice(){
        assertThat(car.getRentalPrice()).isEqualTo(500.00);
    }

    @Test
    public void canSetRentalPrice(){
        car.setRentalPrice(600.00);
        assertThat(car.getRentalPrice()).isEqualTo(600.00);
    }

    @Test
    public void canGetRentalDuration(){
        assertThat(car.getRentalDuration()).isEqualTo(2);
    }
    @Test
    public void canSetRentalDuration(){
        car.setRentalDuration(5);
        assertThat(car.getRentalDuration()).isEqualTo(5);
    }

    @Test
    public void canGetFuelType(){
        assertThat(car.getFuelType()).isEqualTo("");
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



    // test for concrete Models.Car class methods
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
    public void canSetModel(){
        car.setModel("C-Class");
        assertThat(car.getModel()).isEqualTo("C-Class");
    }

    @Test
    public void canGetYear(){
        assertThat(car.getYear()).isEqualTo(2023);
    }

    @Test
    public void canSetYear(){
        car.setYear(2024);
        assertThat(car.getYear()).isEqualTo(2024);
    }

    @Test
    public void canSetFuelType(){
        car.setFuelType("Petrol");
        assertThat(car.getFuelType()).isEqualTo("Petrol");

        car.setFuelType("Petrol", true);
        assertThat(car.getFuelType()).isEqualTo("Fuel: Petrol, Premium Fuel: true");

        car.setFuelType("Diesel", false, true);
        assertThat(car.getFuelType()).isEqualTo("Fuel: Diesel, Premium Fuel: false, Low Carbon: true");
    }

    @Test
    public void canCalculateCost(){
        double expected = car.getRentalPrice() * car.getRentalDuration();
        assertThat(car.calculateCost()).isEqualTo(expected);
    }

    @Test
    public void canReadPassengerMessage(){
        String message = car.readPassengerMessage();
        assertThat(message).isEqualTo("I love my Mercedes");
    }

}
