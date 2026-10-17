# Prime Number Generator & Counter

## 📌 Overview
This Java console application calculates and displays all prime numbers strictly less than a user-provided integer `n`. In addition to listing the individual prime numbers, the program computes and outputs the total count of primes found within that range. 

The program utilizes the **Sieve of Eratosthenes**, which is one of the most efficient mathematical algorithms for finding all prime numbers up to a specified integer.

## 🚀 Features
* **High Efficiency:** Employs an optimized algorithmic approach rather than standard brute-force division, drastically reducing computation time for large numbers.
* **Mathematical Optimizations:** 
  * The outer verification loop only runs up to the square root of the target number ($\sqrt{n}$).
  * The inner marking loop starts directly at the square of the current prime ($k^2$), skipping redundant checks for smaller multiples that have already been marked.
* **Dual Output:** Prints the complete sequence of discovered primes and the final aggregated count.

## 🧠 Core Algorithm (Sieve of Eratosthenes)
1. An array of size `n` is created and initially populated with `1`s (representing `true` or "is prime"), assuming all numbers $\ge 2$ are prime.
2. Starting from the first prime number ($2$), the algorithm iterates through the array.
3. For every prime number found, it iterates through its multiples and marks them as `0` (not prime).
4. The process repeats up to $\sqrt{n}$, leaving only the prime numbers marked as `1`.

## ⚙️ Complexity Analysis
* **Time Complexity:** $\mathcal{O}(n \log \log n)$
  The Sieve of Eratosthenes is highly optimized. Marking multiples takes progressively fewer steps as the primes get larger, resulting in a near-linear time complexity.
* **Space Complexity:** $\mathcal{O}(n)$
  The program allocates a single integer array of size `n` to track the prime status of each number.

## 💻 How to Run

1. Ensure you have the Java Development Kit (JDK) installed on your system.
2. Save the source code in a file named `no_of_prime_numbers.java`.
3. Open your terminal or command prompt and navigate to the folder containing the file.
4. Compile the Java file using:
   ```bash
   javac no_of_prime_numbers.java
   ```
5. Run the compiled application:
   ```bash
   java no_of_prime_numbers
   ```

## 📋 Example Usage

**Standard Input & Output:**

```text
Enetr the 'n' for which you wnat to check number of prime numbers lies between them and print: 30

Prime Numbers that lies bteween 0 to 30 are : 2 3 5 7 11 13 17 19 23 29 
Total Number of Prime Numbers that lies bteween 0 to 30 are : 10
```