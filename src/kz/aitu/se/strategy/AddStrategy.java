package kz.aitu.se.strategy;

/**
 * Concrete Strategy: Addition
 * Author: Anuar Yelansar (Елансар)
 */
public class AddStrategy implements Strategy {
    @Override
    public double execute(double a, double b) {
        return a + b;
    }
}