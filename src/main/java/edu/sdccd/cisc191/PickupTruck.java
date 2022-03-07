package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle {
    public int getCargoCapacity() {
        return CargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        CargoCapacity = cargoCapacity;
    }

    private int CargoCapacity;

    public PickupTruck(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option, int CargoCapacity)
    {
        super(ManufacturerName, MilesOnVehicle, Price, NumberOfSeats, option);
        this.CargoCapacity = CargoCapacity;
    }
}
