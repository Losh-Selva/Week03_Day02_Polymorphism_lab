package LandVehicles;

public class Train extends LandVehicle {
    private boolean isFreightTrain;

    public Train(int noOfWheels, int maximumOccupancy, fuelType fuelTypes, double vehicleLength, driveTrain driveTrains, boolean steeringInput, boolean isFreightTrain) {
        super(noOfWheels, maximumOccupancy, fuelTypes, vehicleLength, driveTrains, steeringInput);
        this.isFreightTrain = isFreightTrain;
    }

    //GETTERS AND SETTERS
    public boolean isFreightTrain() {
        return isFreightTrain;
    }

    public void setFreightTrain(boolean freightTrain) {
        this.isFreightTrain = freightTrain;
    }

    //METHOD
    public String fuelReminder() {
        return String.format("This train doesn't run on dreams, fill up with %s !", getFuelTypes());
    }
}
