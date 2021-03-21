package dziedzicpawel.lab1.tdd.car;

public class Car {

    private String color;
    private String make;
    private double fuelConsumption;
    private int tankCapacity;

    public Car(String color, String make, double fuelConsumption, int tankCapacity) {
        this.color=color;
        this.make=make;
        this.fuelConsumption=fuelConsumption;
        this.tankCapacity=tankCapacity;
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
}