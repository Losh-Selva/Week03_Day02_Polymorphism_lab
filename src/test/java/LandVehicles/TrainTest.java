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
    public void isAFreightTrain(){
        boolean expected = true;
        boolean actual = train.isFreightTrain();
        assertEquals(expected,actual);
    }
}
