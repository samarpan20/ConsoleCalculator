package calculator.receiver;

import java.util.List;
import java.util.Stack;

public class CalculatorHistory { //Receiver Class
    private final List<String> history;

    public CalculatorHistory() {
        this.history = new Stack<>();
    }

    public void addOperation(String operation) {
        history.add(operation);
    }

    public void displayHistory() {
        if (history.isEmpty())
            System.out.println("No history to display");
        else {
            System.out.println("Calculation History: ");
            history.forEach(System.out::println);
        }
    }
}
