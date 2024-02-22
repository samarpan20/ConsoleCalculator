package calculator;

import calculator.commands.impl.AdditionCommand;
import calculator.commands.impl.DivisionCommand;
import calculator.commands.impl.MultiplicationCommand;
import calculator.commands.impl.SubtractionCommand;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //receiver class
        CalculatorHistory history = new CalculatorHistory();

        //invoker class
        Calculator calculator = new Calculator();

        System.out.println("Welcome to the calculator.commands.Command Pattern calculator.Calculator!");
        System.out.println("Enter 'exit' to quit.");

        while (true) {
            System.out.print("Enter operator (+, -, *, /) or 'history' to view history: ");
            String operator = scanner.nextLine();

            if (operator.equals("exit")) {
                System.out.println("Exiting calculator.");
                scanner.close();
                System.exit(200);
            } else if (operator.equals("history")) {
                history.displayHistory();
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            scanner.nextLine();

            switch (operator) {
                case "+" -> {
                    calculator.setCommand(new AdditionCommand(history));
                    calculator.calculate(num1, num2);
                }
                case "-" -> {
                    calculator.setCommand(new SubtractionCommand(history));
                    calculator.calculate(num1, num2);
                }
                case "*" -> {
                    calculator.setCommand(new MultiplicationCommand(history));
                    calculator.calculate(num1, num2);
                }
                case "/" -> {
                    calculator.setCommand(new DivisionCommand(history));
                    calculator.calculate(num1, num2);
                }
                default -> System.out.println("Invalid operator!");
            }
        }
    }
}
