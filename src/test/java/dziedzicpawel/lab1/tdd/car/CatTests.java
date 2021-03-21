package dziedzicpawel.lab1.tdd.car;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CatTests {

    @Test
    public void shouldCreateCar() {
        Car car = new Car("red", "Skoda Octavia", 5.4, 70);

        Assertions.assertEquals(car.getColor(), "red");
        Assertions.assertEquals(car.getMake(), "Skoda Octavia");
        Assertions.assertEquals(car.getFuelConsumption(), 5.4);
        Assertions.assertEquals(car.getTankCapacity(), 70);
    }

    @Test
    public void shouldHaveCorrectRefuel() {
        Car car = new Car("red", "Skoda Octavia", 5.4, 70);

        boolean extraLitresOfFuel1 = car.refuel(100);
        boolean extraLitresOfFuel2 = car.refuel(-50);
        boolean extraLitresOfFuel3 = car.refuel(10);

        Assertions.assertFalse(extraLitresOfFuel1);
        Assertions.assertFalse(extraLitresOfFuel2);
        Assertions.assertTrue(extraLitresOfFuel3);
    }
}