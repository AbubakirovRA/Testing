public class Car extends Vehicle {
    public Car() {
        numWheels = 4;
    }

    @Override
    public void testDrive() {
        speed = 60;
    }
}
