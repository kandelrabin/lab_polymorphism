import Interfaces.Hireable;
import Models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class VehicleHireShopTest {

    VehicleHireShop vehicleHireShop;
    Accessory satNav;
    Car car;
    Boat boat;
    Helicopter helicopter;
    Train train;

    @BeforeEach
    public void setUp(){
        vehicleHireShop = new VehicleHireShop("Enterprise");
        satNav = new Accessory("SatNav", 100.00, 3);
        car = new Car("Mercedes", "C-Class", 2020, 500.00, 3);
        boat = new Boat("River Navigator", "Docklands", 400.00, 1);
        helicopter = new Helicopter("Bat Copter", "Heathrow", 2000.00, 1);
        train = new Train("NWR", "London", "Manchester", 5000.00,1);
    }

    @Test
    public void canGetName(){
        assertThat(vehicleHireShop.getName()).isEqualTo("Enterprise");
    }

    @Test
    public void canSetName(){
        vehicleHireShop.setName("Sixt");
        assertThat(vehicleHireShop.getName()).isEqualTo("Sixt");
    }

    @Test
    public void canAddItemToCatalogue(){
        String key = car.getName()+car.getModel()+car.getYear();
        vehicleHireShop.addItemToHiredItems(key, car);
        assertThat(vehicleHireShop.getItemFromHiredItems(key)).isEqualTo(car);
    }

    @Test
    public void canGetItemFromCatalogue(){
        int result = vehicleHireShop.getHiredItemsSize();
        assertThat(result).isEqualTo(0);
    }

    @Test
    public void removeItemFromCatalogue(){
        vehicleHireShop.addItemToHiredItems("car001", car);
        vehicleHireShop.addItemToHiredItems("train001", train);
        assertThat(vehicleHireShop.getHiredItemsSize()).isEqualTo(2);

        vehicleHireShop.removeItemFromHiredItems("train001");
        assertThat(vehicleHireShop.getHiredItemsSize()).isEqualTo(1);
    }

    @Test
    public void canGetTill(){
        assertThat(vehicleHireShop.getTill()).isEqualTo(0.00);
    }

    @Test
    public void canUpdateTill(){
        vehicleHireShop.depositToTill(1000.00);
        assertThat(vehicleHireShop.getTill()).isEqualTo(1000.00);
    }

    @Test
    public void canCalculateHiredItemsEarnings(){
        vehicleHireShop.addItemToHiredItems("car001", car);
        vehicleHireShop.addItemToHiredItems("train001", train);
        double expected = car.calculateCost() + train.calculateCost();
        double result = vehicleHireShop.calculateHiredItemsEarnings();
        assertThat(result).isEqualTo(expected);
    }


}
