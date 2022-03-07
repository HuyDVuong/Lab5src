package edu.sdccd.cisc191;

public class ElectricCar extends Car {
    private int BatteryCharge;

    public int getBatteryCharge() {return BatteryCharge;}


    public void chargeUp() {
        this.BatteryCharge = 100;
    }

    public ElectricCar(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option, int NumberOfDoors)
    {
        super(ManufacturerName, MilesOnVehicle, Price, NumberOfSeats, option, NumberOfDoors);
        this.NumberOfDoors = NumberOfDoors;
    }
}
