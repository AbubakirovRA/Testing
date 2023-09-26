import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {

    @Test
    public void testCarIsInstanceOfVehicle() {
        Vehicle car = new Car();
        assertTrue(car instanceof Vehicle);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car();
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasTwoWheels() {
        Motorcycle motorcycle = new Motorcycle();
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarTestDriveSpeed() {
        Car car = new Car();
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleTestDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarStopsAfterPark() {
        Car car = new Car();
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleStopsAfterPark() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }
}