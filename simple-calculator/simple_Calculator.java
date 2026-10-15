
import java.util.Scanner;

public class simple_Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float ans;

        System.out.println("Welcome! to the VSLR calculator!");
        System.out.println();
        while (true) {
            System.out.println("Enter x to exit from the VSLR or ");
            System.out.println("Enter any one mathemetical opration from these to perform on two numbers : +, *, /, -, %.. : ");
            char ch = input.next().trim().charAt(0);

            if (ch == 'x' || ch == 'X') {
                System.out.println("Successfully exited the VSLR calculator");
                break;
            } 
            
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                
                System.out.print("Enter the First time : ");
                float num1 = input.nextFloat();
                System.out.print("Enter the Second time : ");
                float num2 = input.nextFloat();

                if (ch == '+') {
                    ans = num1+num2;
                    System.out.println("Sum of " + num1 + " + " + num2 + " is : " + ans);
                    System.out.println();
                    
                }
                
                if (ch == '-') {
                    
                    ans = num1-num2;
                    System.out.println("diffrence of " + num1 + " - " + num2 + " is : " + ans);
                    System.out.println();
 
                }

                if (ch == '*') {
                    
                    ans = num1 * num2;
                    System.out.println("Multiplication of " + num1 + " * " + num2 + " is : " + ans);
                    System.out.println();
 
                }

                if (ch == '%') {
                    
                    ans = num1 % num2;
                    System.out.println("Remainder when " + num1 + " is divided by " + num2 + " is : " + ans);
                    System.out.println();
 
                }

                if (ch == '/') {
                    if (num2 != 0) {
                         ans = num1 / num2;
                         System.out.println( + num1 + " / " + num2 + " = " + ans);
                         System.out.println();
                        
                    }
                    
                    else {
                        System.out.println("Divisor Can't be equal to 0. Plese Try Again!");
                    }
                }
            }
            else {
                System.out.println("Invalid Input!");
                System.out.println();
            }
        }
        input.close();
    }
}
