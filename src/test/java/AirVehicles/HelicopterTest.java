package AirVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HelicopterTest {
    private Helicopter helicopter;

    @BeforeEach
    public void setUp(){helicopter = new Helicopter(4, 10, Vehicle.fuelType.ATF, true, "Propeller", 4) {
    };
    }

    @Test
    public void canGetNoOfPropellers(){
        int expected = 4;
        int actual = helicopter.getNoOfPropellers();
        assertEquals(expected,actual);
    }
}
