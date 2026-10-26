package kz.aitu.se.strategy;

/**
 * Concrete Strategy: Multiplication
 * Author: Anuar Yelansar (Елансар)
 */
public class MultiplyStrategy implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a * b;
    }
}