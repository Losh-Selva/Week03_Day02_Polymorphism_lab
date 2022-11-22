package AirVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FighterJetTest {
    private FighterJet fighterJet;

    @BeforeEach
    public void setUp(){fighterJet = new FighterJet (6,10, Vehicle.fuelType.ATF, true, "Propeller", 6);
    }

    @Test
    public void canGetNoOfPropellers(){
        int expected = 6;
        int actual = fighterJet.getNoOfJets();
        assertEquals(expected,actual);
    }
}