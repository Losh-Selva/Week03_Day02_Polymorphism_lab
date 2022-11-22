package Vehicles;

public abstract class Vehicle {
    private int noOfWheels;
    private int maximumOccupancy;
    private fuelType fuelTypes;
    public enum fuelType{
        GASOLINE, ELECTRIC, ATF,
    }

    public Vehicle(int noOfWheels, int maximumOccupancy, fuelType fuelTypes){
        this.noOfWheels = noOfWheels;
        this.maximumOccupancy = maximumOccupancy;
        this.fuelTypes = fuelTypes;
    }
//GETTERS AND SETTERS
    public int getNoOfWheels(){
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getMaximumOccupancy() {
        return maximumOccupancy;
    }

    public void setMaximumOccupancy(int maximumOccupancy) {
        this.maximumOccupancy = maximumOccupancy;
    }

    public fuelType getFuelTypes() {
        return fuelTypes;
    }

    public void setFuelTypes(fuelType fuelTypes) {
        this.fuelTypes = fuelTypes;
    }
//METHODS
    public String kickOut(){
        return String.format("Get out, there is only %d spaces in here!", this.maximumOccupancy);}
    public String kickOut(String rude){
        return String.format("Haha, there's only %s spaces, get out!", this.maximumOccupancy);
    }

    public abstract String fuelReminder();

}

