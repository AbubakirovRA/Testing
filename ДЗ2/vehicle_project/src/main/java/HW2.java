// Задание 1. Проект Vehicle. Написать следующие тесты с использованием JUnit5:
//  - Проверить, что экземпляр объекта Car также является экземпляром транспортного средства (используя
//оператор instanceof).
// - Проверить, что объект Car создается с 4-мя колесами.
// - Проверить, что объект Motorcycle создается с 2-мя колесами.
// - Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
// - Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод
//testDrive()).
// - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) машина
// останавливается (speed = 0).
// - Проверить, что в режиме парковки (сначала testDrive, потом park, т.е. эмуляция движения транспорта) мотоцикл
// останавливается (speed = 0).
// Введение в юнит-тестирование
// Vehicle
// В этом проекте, вы будете работать с проектом "Vehicle", который представляет собой иерархию классов,
// включающую абстрактный базовый класс "Vehicle" и два его подкласса "Car" и "Motorcycle".
// Базовый класс "Vehicle" содержит абстрактные методы "testDrive()" и "park()", а также поля "company",
// "model", "yearRelease", "numWheels" и "speed".
// Класс "Car" расширяет "Vehicle" и реализует его абстрактные методы. При создании объекта "Car", число
// колес устанавливается в 4, а скорость в 0. В методе "testDrive()" скорость устанавливается на 60, а в методе
// "park()" - обратно в 0.
// Класс "Motorcycle" также расширяет "Vehicle" и реализует его абстрактные методы. При создании объекта
// "Motorcycle", число колес устанавливается в 2, а скорость в 0. В методе "testDrive()" скорость
// устанавливается на 75, а в методе "park()" - обратно в 0.

// Для написания тестов с использованием JUnit 5 для проекта "Vehicle" следует создать классы тестов для каждого из требуемых тестовых случаев. 
// Ниже приведен пример тестовых классов для каждого из указанных тестовых случаев:

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

// В этих тестовых методах мы создаем объекты классов Car и Motorcycle, затем используем утверждения JUnit 5 (assertEquals, assertTrue) 
// для проверки ожидаемых результатов. 
// Каждый тестовый метод проверяет одно из требований из их описания.

// В проект нужно импоритровать JUnit 5, и определить классы Car и Motorcycle и их методы testDrive(), park(), getSpeed(), и getNumWheels().


