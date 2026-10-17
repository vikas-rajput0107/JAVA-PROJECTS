# Airline Baggage Fee Calculator

## 📌 Overview
The **Airline Baggage Fee Calculator** is a Java-based console application designed to compute excess baggage fees based on a complex set of interacting airline rules. It takes into account the passenger's travel class, total baggage weight, frequent flyer status, and whether they are on a connecting flight to accurately determine the final payable fee.

## 🚀 Features & Business Rules Implemented
The program successfully implements the following nested conditions:

* **Tiered Free Allowances:**
  * First Class: 40 kg free
  * Business Class: 30 kg free
  * Economy Class: 20 kg free
* **Dynamic Excess Fees:**
  * First Class: ₹300 per excess kg
  * Business Class: ₹400 per excess kg
  * Economy Class: ₹500 per excess kg
* **Frequent Flyer Override:** Grants an additional 10 kg of free allowance, provided the passenger's total baggage weight does not exceed 60 kg.
* **Connecting Flight Discount:** Applies a 15% discount strictly to the excess fee if the passenger is on a connecting flight and their initial calculated excess fee is greater than ₹5,000.
* **Hard Cap Maximum:** Ensures that the final calculated excess baggage fee never exceeds the absolute maximum of ₹20,000, regardless of the class or weight.

## 🛠️ Prerequisites
* **Java Development Kit (JDK):** Version 8 or higher installed on your system.

## 💻 How to Run

1. Save the provided Java code into a file named `airlines_baggge_managment.java`. *(Note: Ensure the file name exactly matches the class name in the code).*
2. Open your terminal or command prompt and navigate to the directory where you saved the file.
3. Compile the Java code using the following command:
   ```bash
   javac airlines_baggge_managment.java
   ```
4. Run the compiled application:
   ```bash
   java airlines_baggge_managment
   ```

## 📋 Example Usage

**Scenario: Business Class, 65kg, Frequent Flyer, Connecting Flight**

```text
Select Class of traveleing by the Passenger from the given option. 
1 for First Class
2 for Business Class
3 for Economy Class
2

Enter the weight of lugguge in kg : 
65

Is it Connecting flight or Not. Y/N : 
Y

Is the passenger is a Frequent Flyer. Y/N : 
Y

Your excess baggege fee : 11900.0
```

*(Explanation for the example: The 10kg frequent flyer bonus is voided because weight > 60kg. Base allowance is 30kg. Excess is 35kg. 35kg * ₹400 = ₹14,000. A 15% connecting flight discount applies because ₹14,000 > ₹5,000, reducing the fee to ₹11,900. The cap of ₹20,000 is not exceeded.)*

## 🏗️ Technical Details
* **Language:** Java
* **Concepts Used:** Nested `if-else-if` conditional logic, standard console I/O (`java.util.Scanner`), primitive data types, and basic arithmetic percentage calculations.