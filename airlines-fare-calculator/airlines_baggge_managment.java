
import java.util.Scanner;

public class airlines_baggge_managment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select Class of traveleing by the Passenger from the given option. ");
        System.out.println("- 1 for First ClassClass");
        System.out.println("- 2 for Business Class");
        System.out.println("- 3 for Economy Class");

        System.out.print(":- ");
        int t_class = input.nextInt();
        System.out.println();

        System.out.print("Enter the weight of lugguge in kg : ");
        double weight = input.nextDouble();
        System.out.println();

        System.out.print("Is it Connecting flight or Not. Y/N : ");
        char connecting_Flight = input.next().trim().charAt(0);
        System.out.println();

        System.out.print("Is the passenger is a Frequent Flyer. Y/N : ");
        char frequent_traveller = input.next().trim().charAt(0);
        System.out.println();

        double excess_baggege_fee = 0;

        if (t_class == 1) {
            if (frequent_traveller == 'Y' || frequent_traveller == 'y') {
                if (weight <= 60) {
                    excess_baggege_fee = (weight - (40 + 10)) * 300;
                }

                else {
                    excess_baggege_fee = (weight - 40) * 300;
                }

            }

            else if (frequent_traveller == 'N' || frequent_traveller == 'n') {
                excess_baggege_fee = (weight - 40) * 300;
            }

            else {
                System.out.println("Invailed Input!");
            }

        }

        else if (t_class == 2) {

            if (frequent_traveller == 'Y' || frequent_traveller == 'y') {
                if (weight <= 60) {
                    excess_baggege_fee = (weight - (30 + 10)) * 400;
                } else {
                    excess_baggege_fee = (weight - 30) * 400;
                }

            }

            else if (frequent_traveller == 'N' || frequent_traveller == 'n') {
                excess_baggege_fee = (weight - 30) * 400;
            }

            else {
                System.out.println("Invailed Input!");
            }

        }

        else if (t_class == 3) {

            if (frequent_traveller == 'Y' || frequent_traveller == 'y') {

                if (weight <= 60) {
                    excess_baggege_fee = (weight - (20 + 10)) * 500;
                }

                else {
                    excess_baggege_fee = (weight - 20) * 500;
                }

            }

            else if (frequent_traveller == 'N' || frequent_traveller == 'n') {
                excess_baggege_fee = (weight - 20) * 500;
            }

            else {
                System.out.println("Invailed Input!");
            }

        }

        else {
            System.out.println("Invailed input!");
        }

        double excess_baggege_fee_new = 0;

        if (connecting_Flight == 'Y' || connecting_Flight == 'y') {
            if (excess_baggege_fee > 5000) {
                excess_baggege_fee_new = (excess_baggege_fee) - (excess_baggege_fee * 0.15);
            }

            else {
                excess_baggege_fee_new = excess_baggege_fee;
            }

        }

        else if (connecting_Flight == 'N' || connecting_Flight == 'n') {
            excess_baggege_fee_new = excess_baggege_fee;
        }

        else {
            System.out.println("Invailed input!");
        }

        if (excess_baggege_fee_new <= 20000) {
            System.out.println("Your excess baggege fee : " + excess_baggege_fee_new);
        }

        else if (excess_baggege_fee_new > 20000) {
            System.out.println("Your excess baggege fee : " + "20000");
        }

        input.close();
    }

}
