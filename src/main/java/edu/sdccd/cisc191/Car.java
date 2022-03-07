package edu.sdccd.cisc191;

public class Car extends Vehicle {

    public int NumberOfDoors;

    public Car(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option, int NumberOfDoors)
    {
        super(ManufacturerName, MilesOnVehicle, Price, NumberOfSeats, option);
        this.NumberOfDoors = NumberOfDoors;
    }

    public int getNumberOfDoors() {return NumberOfDoors;}
    public void setNumberOfDoors(int numberOfDoors) {this.NumberOfDoors = numberOfDoors;}


}
