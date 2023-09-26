public abstract class Vehicle {
    protected String company;
    protected String model;
    protected int yearRelease;
    protected int numWheels;
    protected int speed;

    public Vehicle() {
        numWheels = 0;
        speed = 0;
    }

    public abstract void testDrive();

    public void park() {
        speed = 0;
    }

    public int getNumWheels() {
        return numWheels;
    }

    public int getSpeed() {
        return speed;
    }
}

// Этот код создает иерархию классов с базовым классом Vehicle, а также подклассами Car и Motorcycle. 
// В базовом классе Vehicle определены поля и методы, общие для всех транспортных средств, такие как testDrive(), park(), getSpeed() и getNumWheels(). 
// Подклассы Car и Motorcycle переопределяют метод testDrive() для установки скорости в соответствии с требованиями.

