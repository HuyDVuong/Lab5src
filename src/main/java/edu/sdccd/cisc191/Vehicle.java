package edu.sdccd.cisc191;

public class Vehicle {

     String ManufacturerName;
     int MilesOnVehicle;
     int Price;
     int NumberOfSeats;
     Options[] option;

    public Vehicle(String ManufacturerName, int MilesOnVehicle, int Price, int NumberOfSeats, Options[] option)
    {
        this.ManufacturerName = ManufacturerName;
        this.MilesOnVehicle = MilesOnVehicle;
        this.Price = Price;
        this.NumberOfSeats = NumberOfSeats;
        this.option = option;
    }

    public String getManufacturerName() {return ManufacturerName;}
    public void setManufacturerName(String manufacturerName) {this.ManufacturerName = manufacturerName;}

    public int getMilesOnVehicle() {return MilesOnVehicle;}
    public void setMilesOnVehicle(int milesOnVehicle) {this.MilesOnVehicle = milesOnVehicle;}

    public int getPrice() {return Price;}
    public void setPrice(int price) {this.Price = price;}

    public int getNumberOfSeats() {return NumberOfSeats;}
    public void setNumberOfSeats(int numberOfSeats) {this.NumberOfSeats = numberOfSeats;}

    public Options[] getOptions() {return option;}
    public void setOptions(Options[] option) {this.option = option;}


}
