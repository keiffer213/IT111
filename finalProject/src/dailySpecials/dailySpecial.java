package dailySpecials;
import java.util.Scanner;

public class dailySpecial {
    public static void main(String[] args) {


        dsMethods customer = new dsMethods();
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a weekday (Monday - Friday)");
        customer.input1 = input.next();
        customer.input1 = customer.formatInput(customer.input1);

        //while loop makes sure that the input is a valid weekday
        while (!customer.weekDay) {
            if (customer.input1.matches("Saturday|Sunday")) {
                System.out.println("Please enter a weekday, not a weekend!");
                customer.input1 = customer.formatInput(input.next());
            } else if (customer.input1.matches("Monday|Tuesday|Wednesday|Thursday|Friday")) {
                customer.weekDay = true; //if valid input, then condition is true and escape loop
                customer.getSpecial(customer.input1); //set the variables for the daily special
                System.out.printf("%s's coffee of the day is a %s and the price will be $%.2f"
                        , customer.input1, customer.coffee, customer.price);
            } else {
                System.out.println("Please enter a proper weekday!");
                customer.input1 = customer.formatInput(input.next());
            }
        }

        while (customer.order < 0 || customer.order > 1000) {
            System.out.printf("\nHow many %ss would you like to order? ", customer.coffee);
            customer.order = input.nextInt();
            if (customer.order < 0 || customer.order > 1000) {
                System.out.println("Please enter a valid order number!");
            }
        }

        if (customer.order == 0) {
            System.out.printf("Looks like you don't like %ss! So sad!!!", customer.coffee);
        } else {
            customer.totalPrice = customer.getTotalPrice(customer.order);
            if (customer.order == 1) {
                System.out.printf("Looks like you will be ordering %d %s today!", customer.order, customer.coffee);
                System.out.printf("\n%d %s has been ordered totalling $%.2f dollars!",
                        customer.order, customer.coffee, customer.totalPrice);
            } else if (customer.discountLevel == 0 && customer.order > 1){
                System.out.printf("Looks like you will be ordering %d %ss today!", customer.order, customer.coffee);
                System.out.printf("\n%d %ss has been ordered totalling $%.2f dollars!",
                        customer.order, customer.coffee, customer.totalPrice);
            } else if (customer.discountLevel == 1) {
                System.out.printf("Looks like you quality for a group discount! Your regular price is $%.2f dollars!\n",
                        customer.totalPrice);
                System.out.printf("You have ordered %d %ss but will only be charged $%.2f dollars!",
                        customer.order, customer.coffee, customer.discountPrice);
            } else if (customer.discountLevel == 2) {
                System.out.printf("A bigger group discounts! Your regular price is $%.2f\n", customer.totalPrice);
                System.out.printf("You have ordered %d %ss but will only be charged $%.2f dollars!",
                        customer.order, customer.coffee, customer.discountPrice);
            }


        }
    }
}

