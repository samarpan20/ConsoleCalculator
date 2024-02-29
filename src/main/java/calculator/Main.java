package calculator;

import calculator.console.CalculatorConsole;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Calculator!");
//        System.out.println("Enter 'exit' to quit.");

        CalculatorConsole calculatorConsole = new CalculatorConsole();
        calculatorConsole.runCalculator();
    }
}
