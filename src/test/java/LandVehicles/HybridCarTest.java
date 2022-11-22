package LandVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class HybridCarTest {
    private HybridCar hybridCar;
    @BeforeEach
    public void setUp (){hybridCar = new HybridCar(4,5, Vehicle.fuelType.ELECTRIC,15, LandVehicle.driveTrain.MECHANICAL,true);
    }
    @Test
    public void canGetDrivetrains(){
        LandVehicle.driveTrain expected = LandVehicle.driveTrain.MECHANICAL;
        LandVehicle.driveTrain actual = hybridCar.getDriveTrains();
        assertEquals(expected,actual);
    }
    @Test
    public void hasSteeringInput(){
        boolean expected = true;
        boolean actual = hybridCar.isSteeringInput();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetFuelReminder(){
        String expected = "ELECTRIC power for the win!";
        String actual = hybridCar.fuelReminder();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetRange(){
        String expected = "This car has a range of 150 miles";
        String actual = hybridCar.range(150);
        assertEquals(expected,actual);
    }
}
