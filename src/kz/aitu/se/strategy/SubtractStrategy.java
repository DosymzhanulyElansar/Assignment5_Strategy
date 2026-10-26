package kz.aitu.se.strategy;

/**
 * Concrete Strategy: Subtraction
 * Author: Anuar Yelansar (Елансар)
 */
public class SubtractStrategy implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a - b;
    }
}
