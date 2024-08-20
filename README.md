# ConsoleCalculator

A simple console-based calculator implemented in Java using the Command Pattern.

## Overview

This project implements a console calculator that performs basic arithmetic operations (addition, subtraction, multiplication, division) based on user input. Each arithmetic operation is encapsulated as a command object using the Command Pattern, providing flexibility and extensibility.

## Features

- Supports addition, subtraction, multiplication, and division.
- Encapsulates each arithmetic operation as a command object.
- Provides error handling for division by zero.

## Usage

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/console-calculator.git
    ```

2. Compile the Java files:

    ```bash
    javac *.java
    ```

3. Run the ConsoleCalculator class:

    ```bash
    java ConsoleCalculator
    ```

4. Follow the on-screen instructions to perform arithmetic operations.

## Command Pattern

The Command Pattern is a behavioral design pattern that encapsulates a request as an object, thereby allowing parameterization of clients with queues, requests, and operations. In this project, each arithmetic operation (addition, subtraction, multiplication, division) is encapsulated as a command object, providing flexibility and extensibility for future enhancements.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Author

- [Samarpan](https://github.com/samarpan20)

Feel free to fork, contribute, or provide feedback on this project!
