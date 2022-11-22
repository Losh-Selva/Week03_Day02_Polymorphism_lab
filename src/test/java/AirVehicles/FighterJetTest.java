package AirVehicles;
import Vehicles.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FighterJetTest {
    private FighterJet fighterJet;

    @BeforeEach
    public void setUp(){fighterJet = new FighterJet (6,10, Vehicle.fuelType.ATF, false, "Jet Engine", 6);
    }
    @Test
    public void isAvailableToPublic(){
        boolean expected= false;
        boolean actual = fighterJet.isAvailableToPublic();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetPropellerType(){
        String expected = "Jet Engine";
        String actual = fighterJet.getPropulsionType();
        assertEquals(expected, actual);
    }
    @Test
    public void canGetNoOJets(){
        int expected = 6;
        int actual = fighterJet.getNoOfJets();
        assertEquals(expected,actual);
    }
    @Test
    public void canGetFuelReminder(){
        String expected = "Make sure you have enough ATF!";
        String actual = fighterJet.fuelReminder();
        assertEquals(expected, actual);
    }
}