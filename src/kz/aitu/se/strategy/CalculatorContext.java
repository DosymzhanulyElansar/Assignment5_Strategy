package kz.aitu.se.strategy;

/**
 * Context class that holds a reference to a Strategy
 * Author: Anuar Yelansar (Елансар)
 */
public class CalculatorContext {
    private Strategy strategy;

    public CalculatorContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(double a, double b) {
        if (strategy == null) {
            throw new IllegalStateException("Strategy is not set!");
        }
        return strategy.execute(a, b);
    }
}
