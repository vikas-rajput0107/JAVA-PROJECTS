# VSLR Calculator

## Description
The VSLR Calculator is a simple, interactive, console-based Java application designed to perform basic arithmetic operations. The program runs continuously, allowing users to perform multiple calculations in a single session until they explicitly choose to exit. 

## Features
*   **Interactive Menu:** Prompts the user continuously for operations without needing to restart the application.
*   **Basic Arithmetic:** Supports standard mathematical operations on floating-point numbers (decimals).
*   **Error Handling:** Prevents program crashes by safely handling division-by-zero errors.
*   **Input Validation:** Detects invalid operators and prompts the user to try again.
*   **Graceful Exit:** Allows the user to terminate the program safely at any time using a specific exit key.

## Supported Operations
*   Addition (+)
*   Subtraction (-)
*   Multiplication (*)
*   Division (/)
*   Modulo / Remainder (%)

## Prerequisites
To run this application, you must have the **Java Development Kit (JDK)** installed on your system.

## How to Use
1. **Compile the program:** Open your terminal or command prompt, navigate to the folder containing the Java file, and compile it using the standard Java compiler command.
2. **Run the application:** Execute the compiled Java class. 
3. **Choose an operation:** Upon starting, the calculator will welcome you and ask for a mathematical operator (`+`, `-`, `*`, `/`, `%`). Type your desired operator and press Enter.
4. **Enter numbers:** You will be prompted to enter the first number, followed by the second number.
5. **View the result:** The calculator will display the result of the operation.
6. **Continue or Exit:** After displaying the result, the prompt will loop. You can enter another operator for a new calculation, or type `x` (or `X`) and press Enter to exit the application.