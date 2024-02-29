package calculator.commands.impl;

import calculator.receiver.CalculatorHistory;
import calculator.commands.Command;

public class SubtractionCommand implements Command {
    private final CalculatorHistory history;

    public SubtractionCommand(CalculatorHistory history) {
        this.history = history;
    }

    @Override
    public void execute(double num1, double num2) {
        double result = num1 - num2;
        history.addOperation("subtract(" + num1 + " , " + num2 + ") = " + result);
        System.out.println(result);
    }
}
