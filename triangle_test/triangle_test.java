import java.util.Scanner;

public class triangle_test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Enter the Side 'a' of the Triangle : ");
        int a = input.nextInt();

        System.out.print("Enter the Side 'b' of the Triangle : ");
        int b = input.nextInt();

        System.out.print("Enter the Side 'c' of the Triangle : ");
        int c = input.nextInt();
        System.out.println();

        
        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("This Triangle is Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("This Triangle is Isosceles");
            } else {
                System.out.println("Given Triangle is a Scalene triangle");
            }
        } else {
            System.out.println("Invalid Triangle");
        }
        input.close();
    }
}