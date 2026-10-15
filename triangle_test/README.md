# Triangle Type Checker

## Description
This is a simple Java console application that asks the user for the three side lengths of a triangle and determines if they form a valid shape. If the triangle is valid, the program classifies it as **Equilateral**, **Isosceles**, or **Scalene**.

## Features
* **Validity Check:** Uses the Triangle Inequality Theorem to ensure the provided sides can actually form a closed triangle.
* **Accurate Classification:** Identifies the type of valid triangle:
  * **Equilateral:** All three sides are equal.
  * **Isosceles:** At least two sides are equal.
  * **Scalene:** All three sides are different lengths.
* **Interactive:** Takes dynamic integer input directly from the console.

## Core Logic & Concepts
* **Conditional Statements (`if-else`):** Used to handle the branching logic for classification.
* **Logical Operators (`&&`, `||`):** Used to evaluate multiple conditions simultaneously.
* **Triangle Inequality Theorem:** The fundamental rule stating that the sum of the lengths of any two sides of a triangle must be strictly greater than the length of the remaining third side `(a + b > c && a + c > b && b + c > a)`.

## How to Run
1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Save the source code in a file named `triangle_test.java`.
3. Open your terminal or command prompt and navigate to the folder containing the file.
4. Compile the program using the Java compiler:
   ```bash
   javac triangle_test.java