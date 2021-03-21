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
}
