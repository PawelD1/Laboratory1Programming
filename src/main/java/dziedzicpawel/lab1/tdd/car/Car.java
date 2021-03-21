package dziedzicpawel.lab1.tdd.car;

public class Car {

    private String color;
    private String make;
    private double fuelConsumption;
    private int tankCapacity;
    private double fuelLevel=20;
    private double odometer=100000.9;
    private double dailyOdometer= 801.2;

    public Car(String color, String make, double fuelConsumption, int tankCapacity) {
        this.color=color;
        this.make=make;
        this.fuelConsumption=fuelConsumption;
        this.tankCapacity=tankCapacity;
    }

    public boolean refuel(int litres) {
        if(litres <0)
            return false;
        else return !(litres + getFuelLevel() > getTankCapacity());
    }

    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getOdometer() {
        return odometer;
    }

    public double getDailyOdometer() {
        return dailyOdometer;
    }
}