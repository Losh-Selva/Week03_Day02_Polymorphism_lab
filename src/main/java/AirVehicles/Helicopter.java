package AirVehicles;

public class Helicopter extends AirVehicle {
 private int noOfPropellers;
 public Helicopter(int noOfWheels, int maximumOccupancy, fuelType fuelTypes, boolean availableToPublic, String propulsionType, int noOfPropellers){
  super(noOfWheels,maximumOccupancy,fuelTypes,availableToPublic, propulsionType);
  this.noOfPropellers = noOfPropellers;
 }
 //GETTERS AND SETTERS

 public int getNoOfPropellers() {
  return noOfPropellers;
 }
 public void setNoOfPropellers(int noOfPropellers) {
  this.noOfPropellers = noOfPropellers;
 }
//METHODS
public String fuelReminder(){
 return String.format("Don't fly without %s !", getFuelTypes());
}
}
