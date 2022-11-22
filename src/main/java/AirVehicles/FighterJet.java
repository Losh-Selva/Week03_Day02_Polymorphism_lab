package AirVehicles;

public class FighterJet extends AirVehicle {
    private int noOfJets;

    public FighterJet(int noOfWheels, int maximumOccupancy, fuelType fuelTypes, boolean availableToPublic, String propulsionType, int noOfJets) {
        super(noOfWheels, maximumOccupancy, fuelTypes, availableToPublic, propulsionType);
        this.noOfJets = noOfJets;
    }
    //GETTERS AND SETTERS

    public int getNoOfJets() {
        return noOfJets;
    }

    public void setNoOfJets(int noOfJets) {
        this.noOfJets = noOfJets;
    }

    //METHOD
    public String fuelReminder() {
        return String.format("Make sure you have enough %s!", getFuelTypes());
    }
}
