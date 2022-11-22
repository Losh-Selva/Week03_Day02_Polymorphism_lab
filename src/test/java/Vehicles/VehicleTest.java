package Vehicles;

import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Vehicles.Vehicle.fuelType.GASOLINE;
import static org.junit.jupiter.api.Assertions.assertEquals;
public abstract class VehicleTest {
    private Vehicle vehicle;
    @BeforeEach
    public void setUp(){ vehicle = new Vehicle(4, 5, GASOLINE) {
        @Override
        public String fuelReminder() {
            return null;
        }
    };
    }
@Test
    public void canGetNoOfWheels(){
        int expected = 4;
        int actual = vehicle.getNoOfWheels();
        assertEquals(expected,actual);

}
   @Test
public void canGetMaximumOccupancy(){
        int expected = 5;
        int actual = vehicle.getMaximumOccupancy();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetFuelTypes(){
        Vehicle.fuelType expected = GASOLINE;
        Vehicle.fuelType actual =vehicle.getFuelTypes();
        assertEquals(expected, actual);


    }
    @Test
    public void canKickOut(){
        String expected = "Get out, there is only 5 spaces in here!";
        String actual = vehicle.kickOut();
        assertEquals(expected, actual);
    }

    @Test
    public void canRudelyKickOut(){
        String expected = "Haha, there's only 5 spaces, get out!";
        String actual = vehicle.kickOut("ha");
        assertEquals(expected, actual);

    }
    @Test
    public void canRemindToFuel(){
        String expected = "Remember to use the correct fuel!";
        String actual = vehicle.fuelReminder();
        assertEquals(expected, actual);
    }
}


