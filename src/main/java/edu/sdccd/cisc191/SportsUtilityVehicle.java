package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle {
    public int getMaxTowingWeight() {
        return this.MaxTowingWeight;
    }

    public void setMaxTowingWeight(int maxTowingWeight) {
        this.MaxTowingWeight = maxTowingWeight;
    }

    private int MaxTowingWeight;

    public SportsUtilityVehicle(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option, int MaxTowingWeight)
    {
        super(ManufacturerName, MilesOnVehicle, Price, NumberOfSeats, option);
        this.MaxTowingWeight = MaxTowingWeight;
    }
}
