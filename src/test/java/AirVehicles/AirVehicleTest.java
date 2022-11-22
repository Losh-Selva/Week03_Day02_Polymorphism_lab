package AirVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class AirVehicleTest {
    private AirVehicle airVehicle;
    @BeforeEach
    public void setUp() {airVehicle = new AirVehicle(6,120, Vehicle.fuelType.ATF, true, "Jet Engine");
    }
    @Test
    public void isAvailableToPublic(){
        boolean expected = true;
        boolean actual = airVehicle.isAvailableToPublic();
        assertEquals(expected, actual);
    }
@Test
    public void canGetPropulsionType(){
        String expected = "Jet Engine";
        String actual = airVehicle.getPropulsionType();
        assertEquals(expected, actual);
}
}


