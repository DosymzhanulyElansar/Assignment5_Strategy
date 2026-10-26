package kz.aitu.se.strategy;

/**
 * Client class demonstrating strategy pattern and runtime switching
 * Author: Anuar Yelansar (Елансар)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Assignment #5: Strategy Pattern Calculator ===");
        System.out.println("Author: Anuar Yelansar\n");

        double a = 10.0;
        double b = 5.0;

        CalculatorContext context = new CalculatorContext(new AddStrategy());
        System.out.println("Addition (10 + 5) = " + context.executeStrategy(a, b));

        context.setStrategy(new SubtractStrategy());
        System.out.println("Subtraction (10 - 5) = " + context.executeStrategy(a, b));

        context.setStrategy(new MultiplyStrategy());
        System.out.println("Multiplication (10 * 5) = " + context.executeStrategy(a, b));
    }
}