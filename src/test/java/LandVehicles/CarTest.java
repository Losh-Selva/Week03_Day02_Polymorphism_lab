package LandVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    private Car car;
    @BeforeEach
    public void setUp(){car = new Car(4, 5, Vehicle.fuelType.GASOLINE, 14.7, LandVehicle.driveTrain.MECHANICAL, true, 5) {
    };
    }
    @Test
    public void canGetVehicleLength() {
        double expected = 14.7;
        double actual = car.getVehicleLength();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetDrivetrains(){
        LandVehicle.driveTrain expected = LandVehicle.driveTrain.MECHANICAL;
        LandVehicle.driveTrain actual = car.getDriveTrains();
        assertEquals(expected,actual);
    }
    @Test
    public void hasSteeringInput(){
        boolean expected = true;
        boolean actual = car.isSteeringInput();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetNoOfDoors(){
        int expected = 5;
        int actual = car.getNoOfDoors();
        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelReminder(){
        String expected = "Remember to fuel up with GASOLINE";
        String actual = car.fuelReminder();
        assertEquals(expected, actual);
    }
}
