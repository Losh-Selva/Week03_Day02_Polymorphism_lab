package LandVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainTest {
    private Train train;
    @BeforeEach
    public void setUp(){ train = new Train(80,120, Vehicle.fuelType.ELECTRIC,140, LandVehicle.driveTrain.DC,false,true);
    }
    @Test
    public void canGetVehicleLength(){
        double expected = 140;
        double actual =train.getVehicleLength();
        assertEquals(expected,actual);
    }
    @Test
    public void canGetDrivetrains(){
        LandVehicle.driveTrain expected = LandVehicle.driveTrain.DC;
        LandVehicle.driveTrain actual = train.getDriveTrains();
        assertEquals(expected,actual);
    }
    @Test
    public void hasSteeringInput(){
        boolean expected = false;
        boolean actual = train.isSteeringInput();
        assertEquals(expected, actual);
    }
    @Test
    public void isAFreightTrain(){
        boolean expected = true;
        boolean actual = train.isFreightTrain();
        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelReminder(){
        String expected = "This train doesn't run on dreams, it runs on ELECTRIC power!";
        String actual = train.fuelReminder();
        assertEquals(expected, actual);
    }
}
