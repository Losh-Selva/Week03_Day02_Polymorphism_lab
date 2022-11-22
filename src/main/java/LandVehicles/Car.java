package LandVehicles;

import Vehicles.Vehicle;

public class Car extends LandVehicle {
    private int noOfDoors;
    public Car(int noOfWheels, int maximumOccupancy,fuelType fuelTypes, double vehicleLength, driveTrain driveTrains, boolean steeringInput, int noOfDoors){
        super(noOfWheels,maximumOccupancy,fuelTypes,vehicleLength,driveTrains,steeringInput);
        this.noOfDoors = noOfDoors;
    }
//GETTERS AND SETTERS
    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
    //METHODS
public String fuelReminder(){
        return String.format("Remember to fuel up with %s", getFuelTypes());
}
}