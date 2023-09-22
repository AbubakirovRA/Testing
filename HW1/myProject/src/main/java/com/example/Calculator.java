package com.example;

public class Calculator {

    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (purchaseAmount < 0 || discountAmount < 0 || discountAmount > 100) {
            throw new ArithmeticException("Invalid input: purchaseAmount or discountAmount is out of range.");
        }

        double discount = purchaseAmount * discountAmount / 100.0;
        return purchaseAmount - discount;
    }
}
