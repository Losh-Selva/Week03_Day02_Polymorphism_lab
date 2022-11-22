package LandVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LandVehicleTest {
    private LandVehicle landVehicle;
    @BeforeEach
    public void setUp(){ landVehicle = new LandVehicle(6,3, Vehicle.fuelType.GASOLINE,20.2, LandVehicle.driveTrain.MECHANICAL,true);
    }
    @Test
    public void canGetVehicleLength(){
        double expected = 20.2;
        double actual =landVehicle.getVehicleLength();
        assertEquals(expected,actual);
    }
    @Test
    public void canGetDrivetrains(){
        LandVehicle.driveTrain expected = LandVehicle.driveTrain.MECHANICAL;
        LandVehicle.driveTrain actual = landVehicle.getDriveTrains();
        assertEquals(expected,actual);
    }
    @Test
    public void hasSteeringInput(){
        boolean expected = true;
        boolean actual = landVehicle.isSteeringInput();
        assertEquals(expected, actual);
    }

}
