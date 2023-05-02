import java.util.Scanner;

public class dailySpecials {

    public static void main(String[] args) {

        String specials;
        Scanner input = new Scanner(System.in);

        System.out.println("Pleas enter a day of the week excluding weekends (Monday - Friday only!)");
        specials =  input.next();
//      input.close();

        //to make the string typed in be uniform first letter uppercase
        //and the rest of the word be lowercase
        specials = specials.toLowerCase();
        specials = specials.substring(0,1).toUpperCase()
                + specials.substring(1).toLowerCase();

        //in the world of coffee, I need a name of a coffee beverage and a price
        String coffee = "";
        double price = 0;
//        boolean saturday = specials.equals("Saturday");
//        boolean sunday = specials.equals("Sunday");
        boolean weekDay = false; //set initial boolean to "false" to meet while condition

        while (!weekDay) {
            //can do individual special.equal cases or do a specials.matches() for a range or cases
            if (specials.matches("Saturday|Sunday")) { //if input is weekend
                System.out.println("Please enter a weekday, not weekend!");
                specials = input.next();
            } else if (specials.equals("Monday") || specials.equals("Tuesday") || specials.equals("Wednesday") || specials.equals("Thursday") ||specials.equals("Friday")) {
                weekDay = true; //if valid input, then make condition of while loop true to escape
            } else { //if not even a day, prompt to enter a proper input
                System.out.println("Please enter a proper weekday!");
                specials = input.next();
            }

            specials = specials.toLowerCase(); //to format the string properly, can be a function in the future
            specials = specials.substring(0, 1).toUpperCase()
                    + specials.substring(1).toLowerCase();
        }

        switch (specials) {//jmy cases will be the day of the week
            case "Monday"-> {
                coffee = "Latte";
                price = 4.95;
                System.out.printf("%s's coffee of the day is %s and the price will be $%.2f", specials, coffee, price);
            }
            case "Tuesday"-> {
                coffee = "Frapp";
                price = 5.95;
                System.out.printf("%s's coffee of the day is %s and the price will be $%.2f", specials, coffee, price);
            }
            case "Wednesday"-> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.printf("%s's coffee of the day is %s and the price will be $%.2f", specials, coffee, price);
            }
            case "Thursday"-> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.printf("%s's coffee of the day is %s and the price will be $%.2f", specials, coffee, price);
            }
            case "Friday"-> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.printf("%s's coffee of the day is %s and the price will be $%.2f", specials, coffee, price);
            }
//            default:
//                System.out.println("Please enter a valid day or check spelling!");
        }

        int order = -1; //initialize out of scope to meet loop condition
        double total;

        while (order < 0 || order > 1000) { //make sure the order is a proper value
            System.out.printf("\nHow many %ss would you like to order?", coffee);
            order = input.nextInt();
            if (order < 0 || order > 1000) {
                System.out.println("Please enter a valid order number!");
            }
        }

        if (order == 0) { //if-else statement for if the order is 0 or more than 0
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else {//different statements for wording if order is 1 or more than 1
            if (order==1) {System.out.printf("Looks like you will be ordering %d %s today!", order, coffee);}
            else {System.out.printf("Looks like you will be ordering %d %ss today!", order, coffee);}
            total = order * price;
            if (order==1){System.out.printf("%n%d %s has been ordered totalling $%.2f dollars!", order, coffee, total);}
            else {System.out.printf("%n%d %ss have been ordered totalling $%.2f dollars!", order, coffee, total);}
        }

    }
}
