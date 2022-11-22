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
    public void isAvailableToPublic(){
        boolean expected= true;
        boolean actual = helicopter.isAvailableToPublic();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetPropellerType(){
        String expected = "Propeller";
        String actual = helicopter.getPropulsionType();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetNoOfPropellers(){
        int expected = 4;
        int actual = helicopter.getNoOfPropellers();
        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelReminder(){
        String expected = "Don't fly without ATF!";
        String actual = helicopter.fuelReminder();
        assertEquals(expected, actual);
    }
}
