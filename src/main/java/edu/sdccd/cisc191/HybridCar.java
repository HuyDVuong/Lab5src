package edu.sdccd.cisc191;

public class HybridCar extends Car {
    public int getNumberOfDoors() {return NumberOfDoors;}
    public void setNumberOfDoors(int numberOfDoors) {NumberOfDoors = numberOfDoors;}
    private int NumberOfDoors;

    public int getFuelLevel() {return FuelLevel;}
    private int FuelLevel;

    public int getBatteryCharge() {return BatteryCharge;}
    private int BatteryCharge;

    public void chargeUp() {
        this.BatteryCharge = 100;
    }
    public void tankUp() {
        this.FuelLevel = 100;
    }

    public HybridCar(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option, int NumberOfDoors)
    {
        super(ManufacturerName, MilesOnVehicle, Price, NumberOfSeats, option, NumberOfDoors);
        this.NumberOfDoors = NumberOfDoors;
    }
}
