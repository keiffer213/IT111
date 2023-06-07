package package_person_input;
import java.util.Scanner;

public class personDetails {

    public static void main(String[] args) {
        //create object
        person customer1 = new person();

        //initialize additional variables
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name! ");
        customer1.name = input.next();
        System.out.println("Please enter your age! ");
        customer1.age = input.nextInt();
        System.out.println("Please enter your gender! ");
        customer1.gender = input.next().charAt(0);
        System.out.println("Please enter your Zipcode! (Only 5 numbers please)");
        customer1.zipCode = input.next();
        System.out.println("Any traffic violations? Please enter true for yes, and " +
                "false for no");
        customer1.violations = input.nextBoolean();
        //add an if else statement!
        if (customer1.violations == true) {
            System.out.println("Please type true if you had a DUI, or false if not");
            customer1.violationDUI = input.nextBoolean();

            System.out.println("Please type true if you had a a red light violation, or false if not");
            customer1.violationRedLight = input.nextBoolean();

            System.out.println("Please type true if you had a speeding violation, or false if not");
            customer1.violationSpeeding = input.nextBoolean();
        }
        System.out.println("Please type in your credit score");
        customer1.creditScore = input.nextDouble();

        customer1.display();
        //System.out.println(customer1.identifyRegion(customer1.states));
        customer1.identifyRegion(customer1.states);
        customer1.adjustedRate = customer1.ageCategory(customer1.adjustedRate);
        customer1.monthlyRate = customer1.getRate(customer1.monthlyRate);

        if (customer1.cityCode >= 90 && customer1.cityCode <= 96 ) {
            customer1.surCharge = customer1.californiaRegion(customer1.surCharge);
            System.out.printf("Your california surcharge is $%.2f%n", customer1.surCharge);
        }

        customer1.totalRate = customer1.adjustedRate + customer1.baselineRate + customer1.monthlyRate + customer1.surCharge;
        System.out.printf("Age Category Adjustment: $%.2f%n", customer1.adjustedRate);
        System.out.printf("Violations or credit score adjustment: $%.2f%n", customer1.monthlyRate);
        System.out.printf("Your total monthly rate is: $%.2f%n", customer1.totalRate);

    }
}
