# Java Primitive Data Type Checker

## 📌 Overview
The **Java Primitive Data Type Checker** is a console-based utility that evaluates an inputted numerical value and determines all the Java primitive integer data types capable of storing it. It provides an interactive way to understand memory allocation, bounds, and limits of Java's numerical data types without causing integer overflow.

This logic is commonly used in competitive programming and system-level data validation to ensure variables are declared with optimal memory efficiency.

## 🚀 Features
* **Multi-Input Processing:** Allows the user to specify how many test cases they want to evaluate in a single runtime session.
* **Dynamic Range Checking:** Evaluates the input against the official mathematical bounds of Java's primitive classes (`Byte`, `Short`, `Integer`, `Long`).
* **Robust Exception Handling:** Implements a `try-catch` block to gracefully handle inputs that exceed the maximum limit of a 64-bit signed integer (numbers too large for a `long`), preventing program crashes.

## 🧠 Core Concepts & Data Ranges

The program maps the user's input against the following Java primitive architectures:

| Data Type | Memory Size | Minimum Value | Maximum Value |
| :--- | :--- | :--- | :--- |
| **`byte`** | 8-bit signed | -128 | 127 |
| **`short`** | 16-bit signed | -32,768 | 32,767 |
| **`int`** | 32-bit signed | -2<sup>31</sup> (-2,147,483,648) | 2<sup>31</sup>-1 (2,147,483,647) |
| **`long`** | 64-bit signed | -2<sup>63</sup> | 2<sup>63</sup>-1 |

If an input exceeds the boundaries of all the above types, the program catches the exception and notifies the user that the number cannot be fitted anywhere in standard Java primitives.

## 🛠️ Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher installed on your machine.

## 💻 How to Run

1. Clone or download the repository to your local machine.
2. Open your terminal or command prompt and navigate to the directory containing the file `number_data_type_fit.java`.
3. Compile the Java file using:
   ```bash
   javac number_data_type_fit.java