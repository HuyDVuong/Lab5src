package edu.sdccd.cisc191;

public class GasCar extends Car {

    public int getNumberOfDoors() {return NumberOfDoors;}
    public void setNumberOfDoors(int numberOfDoors) {NumberOfDoors = numberOfDoors;}

    public int getFuelLevel() {return FuelLevel;}
    public void setFuelLevel(int fuelLevel) {FuelLevel = fuelLevel;}

    public void tankUp() {
        this.FuelLevel = 100;
    }

    private int NumberOfDoors;
    protected int FuelLevel;

    public GasCar(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option, int NumberOfDoors)
    {
        super(ManufacturerName, MilesOnVehicle, Price, NumberOfSeats, option, NumberOfDoors);
        this.NumberOfDoors = NumberOfDoors;
    }

}
