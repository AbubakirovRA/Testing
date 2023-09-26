public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        System.out.println("Car information:");
        System.out.println("Number of Wheels: " + car.getNumWheels());
        System.out.println("Initial Speed: " + car.getSpeed());
        
        car.testDrive();
        System.out.println("Speed after Test Drive: " + car.getSpeed());
        
        car.park();
        System.out.println("Speed after Parking: " + car.getSpeed());

        System.out.println("\nMotorcycle information:");
        System.out.println("Number of Wheels: " + motorcycle.getNumWheels());
        System.out.println("Initial Speed: " + motorcycle.getSpeed());
        
        motorcycle.testDrive();
        System.out.println("Speed after Test Drive: " + motorcycle.getSpeed());
        
        motorcycle.park();
        System.out.println("Speed after Parking: " + motorcycle.getSpeed());
    }
}

// Этот класс Main создает экземпляры Car и Motorcycle, выполняет на них тестовое вождение и парковку, 
// а затем выводит информацию о состоянии каждого транспортного средства. 
