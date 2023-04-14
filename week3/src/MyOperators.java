public class MyOperators {

    public static void main(String[] args) {

        // arithmetic operators
        // employee, wage, hours worked, overtime, the whole enchilada

//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlyWithOvertime;
//
//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//
//        regularPay = regHours * wage;
//        overtimePay = overtimeHours * (wage * 1.5);
//        total = regularPay + overtimePay;
//
//        hourlyWithOvertime = total / (regHours+overtimeHours);
//
//        System.out.println("Regular pay $" + regularPay + " dollars");
//        System.out.println("$" + overtimePay + " dollars");
//        System.out.println("Total pay $" + total + " dollars");
//        System.out.println("Hourly rate with overtime is $" + hourlyWithOvertime + " dollars");
//        System.out.printf("Hourly rate with overtime is $%.2f", hourlyWithOvertime);


        int number1, number2, number3;
        number1 = 2577;
        number2 = 2;
        number3 = number1 % number2;
//        System.out.println(number3);

        if(number3 == 0) {
            System.out.println(number1 + " is an even number");
            //do something
        } else {
            System.out.println(number1 + " is an odd number");
        }
        //we are now going shopping

//        double tax, priceOfItem, taxOnItem, totalPrice;
//        tax = .10;
//        priceOfItem = 100.00;
//        taxOnItem = priceOfItem * tax;
//        totalPrice = priceOfItem+taxOnItem;
//
//        System.out.println("Price of item is $" + priceOfItem + " dollars");
//        System.out.println("Tax is $" + taxOnItem + " dollars");
//        System.out.println("Price including tax is $" + totalPrice + " dollars");

        //double priceOfItem = 100;
        //tax is 10%

        double priceOfItem = 100;
        priceOfItem *= 1.10;

        System.out.println("Total price of item is " + priceOfItem + " dollars");

        System.out.printf("Total price of item is $%.2f dollars", priceOfItem);


    }

}
