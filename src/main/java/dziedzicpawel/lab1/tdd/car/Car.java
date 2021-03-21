package dziedzicpawel.lab1.tdd.car;

public class Car {

    private final String color;
    private final String make;
    private final double fuelConsumption;
    private final int tankCapacity;
    private final double fuelLevel=20.0;
    private final double odometer=100000.9;
    private final double dailyOdometer= 801.2;

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

    public double calculateNewOdometer(int distance) {
        double newOdometer =getOdometer() + distance;
        while(newOdometer > 200000) {
            newOdometer -= 200000;
        }
        return newOdometer;

    }
    public double calculateNewDailyOdometer(int distance) {
        double  newDailyOdometer = getDailyOdometer() + distance;
        while(newDailyOdometer > 1000) {
            newDailyOdometer-=1000;
        }
        return newDailyOdometer;

    }

    public double calculateAmountOfFuelAfterDriving(int distance) {
        double startFuelDistance = getFuelLevel();
        return startFuelDistance - ((double)distance / 100 * getFuelConsumption());
    }

    public boolean drive(int distance) {
        double fuelResourceAfterDriving= calculateAmountOfFuelAfterDriving(distance);
        return fuelResourceAfterDriving > 0;
    }

    public boolean resetOdometer(double odometer) {
        odometer = 0;
        if(odometer>0)
            return false;
        return true;
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