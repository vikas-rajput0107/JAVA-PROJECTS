
// leetcode Q number 204
/*Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
Example 2:
Input: n = 0
Output: 0
Example 3:
Input: n = 1
Output: 0*/
 
import java.util.*;
public class no_of_prime_numbers {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enetr the 'n' for which you wnat to check number of prime numbers lies between them and print: ");
        int n = input.nextInt();
        System.out.println();
        primeNum(n);
        input.close();
}





        public static void primeNum(int n){
            int total_prime_numbers = 0;
            int[] primeArray = new int[n];
            for(int i=2 ; i<n ; i++) primeArray[i] = 1;
            for(int k = 2 ; k<(Math.sqrt(n)) ; k++){
                if(primeArray[k] == 1){
                    for(int j = k*k ; j<n ; j+=k) primeArray[j] = 0;
                }
            }
            System.out.print("Prime Numbers that lies bteween 0 to "+n+" are : ");
            for(int g = 2 ; g<n ; g++) {
                if(primeArray[g] == 1) total_prime_numbers++;
                if(primeArray[g] == 1) System.out.print(g+" ");
            }
            System.out.println();
            System.out.println("Total Number of Prime Numbers that lies bteween 0 to "+n+" are : "+total_prime_numbers);
        }
    }
    