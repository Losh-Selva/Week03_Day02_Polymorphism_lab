package AirVehicles;

import Vehicles.Vehicle;

public abstract class AirVehicle extends Vehicle {
    private boolean availableToPublic;
    private String propulsionType;

    public AirVehicle(int noOfWheels, int maximumOccupancy,fuelType fuelTypes, boolean availableToPublic, String propulsionType){
        super(noOfWheels,maximumOccupancy,fuelTypes);
        this.availableToPublic = availableToPublic;
        this.propulsionType = propulsionType;

    }

    //GETTERS AND SETTERS
    public boolean isAvailableToPublic(){
        return availableToPublic;
    }

    public void setAvailableToPublic(boolean availableToPublic) {
        this.availableToPublic = availableToPublic;
    }

    public String getPropulsionType() {
        return propulsionType;
    }

    public void setPropulsionType(String propulsionType) {
        this.propulsionType = propulsionType;
    }
}
