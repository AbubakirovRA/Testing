package com.example;

public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса Calculator
        Calculator calculator = new Calculator();

        // Входные данные: сумма покупки и процент скидки
        double purchaseAmount = 100.0;
        int discountAmount = 20;

        try {
            // Вычисляем сумму с учетом скидки
            double discountedAmount = calculator.calculateDiscount(purchaseAmount, discountAmount);

            // Выводим результат
            System.out.println("Сумма покупки со скидкой: " + discountedAmount);
        } catch (ArithmeticException e) {
            // Если произошла ошибка (например, недопустимые аргументы), выводим сообщение
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
