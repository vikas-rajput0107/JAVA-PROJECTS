import java.util.*;

public class num_guess_game {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        int randomNum = random.nextInt(100)+1;
        int gussedNumber, NumberOfAttempts = 0;
        
        System.out.println();
        System.out.println("....................................................................................................");
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I have Selected a Natural Number from 1 to 100, You have to Guess it Correcttly in Minimun Attempts!");
        System.out.println("....................................................................................................");
        System.out.println();

        do {
            System.out.print("Enter your gussed Number: ");
            gussedNumber = input.nextInt();
            System.out.println();
            NumberOfAttempts++;

            if (randomNum>gussedNumber) {
                System.out.println("You have entered a smaller number!");
                System.out.println("try again!");
                System.out.println();
            }
            
            else{
                System.out.println("You have entered a larger number!");
                System.out.println("try again!"); 
                System.out.println();     
            }
            
        } while (gussedNumber!=randomNum);

        System.out.println("Congrats! You cracked it in "+NumberOfAttempts+ " attemts." );
        input.close();
    }

}
