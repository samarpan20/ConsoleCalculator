package calculator.invoker;

import calculator.commands.Command;

public class CalculatorInvoker { //Invoker Class
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void calculate(double num1, double num2) {
        command.execute(num1, num2);
    }
}
