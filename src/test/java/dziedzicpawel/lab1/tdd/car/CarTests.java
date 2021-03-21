package dziedzicpawel.lab1.tdd.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CarTests {

    private Car car;

    @BeforeEach
    public void createCar() {
        this.car = new Car("red", "Skoda Octavia", 5.4, 70);
    }

    @Test
    public void shouldCreateCar() {

        Assertions.assertEquals(car.getColor(), "red");
        Assertions.assertEquals(car.getMake(), "Skoda Octavia");
        Assertions.assertEquals(car.getFuelConsumption(), 5.4);
        Assertions.assertEquals(car.getTankCapacity(), 70);
    }

    @Test
    public void shouldHaveCorrectRefuel() {

        boolean extraLitresOfFuel1 = car.refuel(100);
        boolean extraLitresOfFuel2 = car.refuel(-50);
        boolean extraLitresOfFuel3 = car.refuel(10);

        Assertions.assertFalse(extraLitresOfFuel1);
        Assertions.assertFalse(extraLitresOfFuel2);
        Assertions.assertTrue(extraLitresOfFuel3);
    }
    @Test
    public void shouldHaveDrive() {

        int distance1 = 100;
        int distance2 = 100000;
        int distance3= 300;

        boolean isPossible = car.drive(distance1);
        boolean isPossible2= car.drive(distance2);
        boolean isPossible3= car.drive(distance3);

        Assertions.assertTrue(isPossible);
        Assertions.assertEquals(901.2, car.calculateNewDailyOdometer(distance1), 1e-3);
        Assertions.assertEquals(100100.9, car.calculateNewOdometer(distance1), 1e-3);
        Assertions.assertTrue(car.getFuelLevel()>=0);
        Assertions.assertFalse(isPossible2);
        Assertions.assertTrue(isPossible3);
        Assertions.assertEquals(3.8,car.calculateAmountOfFuelAfterDriving(distance3), 13-3);
        Assertions.assertEquals(101.2, car.calculateNewDailyOdometer(distance3), 1e-3);
    }

    @Test
    public void shouldResettingOdometer() {

        boolean resetIsSuccessful= car.resetOdometer(car.getOdometer());

        Assertions.assertTrue(resetIsSuccessful);
    }
}