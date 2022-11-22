package LandVehicles;

import interfaces.IHybrid;

public class HybridCar extends LandVehicle implements IHybrid {

    public HybridCar(int noOfWheels, int maximumOccupancy, fuelType fuelTypes, double vehicleLength, driveTrain driveTrains, boolean steeringInput) {
        super(noOfWheels, maximumOccupancy, fuelTypes, vehicleLength, driveTrains, steeringInput);
    }

    public String fuelReminder() {
        return String.format("%s power for the win!", getFuelTypes());
    }
    public String range (int distance){
    return String.format("This car has a range of %d miles", distance);
    }
}
