package LandVehicles;

import Vehicles.Vehicle;

public abstract class LandVehicle extends Vehicle {
    private double vehicleLength;
    private driveTrain driveTrains;
    public enum driveTrain{
        DC, AC, MECHANICAL
    }
    private boolean steeringInput;
    public LandVehicle(int noOfWheels, int maximumOccupancy,fuelType fuelTypes, double vehicleLength, driveTrain driveTrains, boolean steeringInput){
        super(noOfWheels,maximumOccupancy,fuelTypes);
        this.vehicleLength = vehicleLength;
        this.driveTrains = driveTrains;
        this.steeringInput = steeringInput;
    }
    //GETTERS AND SETTERS
    public double getVehicleLength() {
        return vehicleLength;
    }

    public void setVehicleLength(double vehicleLength) {
        this.vehicleLength = vehicleLength;
    }

    public driveTrain getDriveTrains() {
        return driveTrains;
    }

    public void setDriveTrains(driveTrain driveTrains) {
        this.driveTrains = driveTrains;
    }

    public boolean isSteeringInput() {
        return steeringInput;
    }

    public void setSteeringInput(boolean steeringInput) {
        this.steeringInput = steeringInput;
    }
}
