package calculator.console;

import calculator.commands.impl.AdditionCommand;
import calculator.commands.impl.DivisionCommand;
import calculator.commands.impl.MultiplicationCommand;
import calculator.commands.impl.SubtractionCommand;
import calculator.invoker.CalculatorInvoker;
import calculator.receiver.CalculatorHistory;

import java.util.Scanner;

public class CalculatorConsole {

    private final CalculatorHistory history = new CalculatorHistory();
    private final CalculatorInvoker calculator = new CalculatorInvoker();
    private double num1 = 0;
    private double num2 = 0;

    public void runCalculator() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            String operator = scanner.nextLine();
            processCalculator(operator, scanner);
        }
    }

    private void showMenu() {
        System.out.println("Enter operator '+' to add ");
        System.out.println("Enter operator '-' to subtract ");
        System.out.println("Enter operator '*' to multiply ");
        System.out.println("Enter operator '/' to divide ");
        System.out.println("Enter 'history' to view history ");
        System.out.println("Enter 'exit' to exit ");

    }

    private void processCalculator(String operator, Scanner scanner) {


        switch (operator) {
            case "+" -> {
                calculator.setCommand(new AdditionCommand(history));
                takeInput(scanner);
            }
            case "-" -> {
                calculator.setCommand(new SubtractionCommand(history));
                takeInput(scanner);
            }
            case "*" -> {
                calculator.setCommand(new MultiplicationCommand(history));
                takeInput(scanner);
            }
            case "/" -> {
                calculator.setCommand(new DivisionCommand(history));
                takeInput(scanner);
            }
            case "exit" -> {
                System.out.println("Exiting calculator.");
                scanner.close();
                System.exit(200);
            }
            case "history" -> {
                history.displayHistory();
                return;
            }
            default -> {
                System.out.println("Invalid operator!");
                return;
            }
        }
        calculator.calculate(num1, num2);
    }

    private void takeInput(Scanner scanner) {

        System.out.println("Enter first number: ");
        this.num1 = scanner.nextDouble();
        System.out.println("Enter second number: ");
        this.num2 = scanner.nextDouble();

    }
}

