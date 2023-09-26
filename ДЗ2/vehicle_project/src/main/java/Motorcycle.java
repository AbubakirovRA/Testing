public class Motorcycle extends Vehicle {
    public Motorcycle() {
        numWheels = 2;
    }

    @Override
    public void testDrive() {
        speed = 75;
    }
}