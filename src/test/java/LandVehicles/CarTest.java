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
    public void canGetNoOfDoors(){
        int expected = 5;
        int actual = car.getNoOfDoors();
        assertEquals(expected,actual);
    }
}
