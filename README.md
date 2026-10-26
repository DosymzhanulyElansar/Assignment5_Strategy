# Assignment #5 - Strategy Pattern

**Student:** Anuar Yelansar (Елансар)  
**Group:** SE-2522  

## Overview
This project implements the **Strategy behavioral design pattern** in Java (Option B: Calculator). It demonstrates how to replace conditional statements (`if-else` / `switch-case`) with interchangeable algorithms behind a common interface, allowing dynamic algorithm selection at runtime.

## Project Structure
- `Strategy.java` - Common interface for all calculation strategies.
- `AddStrategy.java` - Concrete strategy for addition.
- `SubtractStrategy.java` - Concrete strategy for subtraction.
- `MultiplyStrategy.java` - Concrete strategy for multiplication.
- `CalculatorContext.java` - Context class that maintains a reference to a strategy and delegates execution.
- `Main.java` - Client application demonstrating runtime strategy switching.

## How to Build and Run
1. Open the project in **IntelliJ IDEA** (Java JDK 17+ required).
2. Navigate to `Main.java`.
3. Click the green **Run** button next to the `main` method.

## How to Add a New Strategy
1. Create a new class that implements the `Strategy` interface (e.g., `DivideStrategy`).
2. Implement the `execute(double a, double b)` method.
3. Use it in the client by passing it to the context via `setStrategy()`. No existing classes need to be modified!