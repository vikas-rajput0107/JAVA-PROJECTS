
 
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
    