package dailySpecials;

public class dsMethods {

    String input1, coffee;
    boolean weekDay = false;
    double price, totalPrice, discountLevel = 0, discountPrice;
    int order = -1;

    //this method is for formatting the input to be standardized
    public String formatInput(String input1) {
        //input1 = input1.toLowerCase(); //this is only to transform all to lowercase

        // create a string with 1st char as uppercase and the rest lowercase
        input1 = input1.substring(0,1).toUpperCase()
                + input1.substring(1).toLowerCase();

       return input1;
    }

    //this will initialize the variables for the daily special chosen by the customer
    public void getSpecial(String input1) {
        switch (input1) {//jmy cases will be the day of the week
            case "Monday"-> {
                coffee = "Latte";
                price = 4.95;
            }
            case "Tuesday"-> {
                coffee = "Frapp";
                price = 5.95;
            }
            case "Wednesday"-> {
                coffee = "Cappuccino";
                price = 4.35;
            }
            case "Thursday"-> {
                coffee = "Regular Joe";
                price = 2.95;
            }
            case "Friday"-> {
                coffee = "Green Tea Latte";
                price = 6.95;
            }
        }
    }

    public double getTotalPrice(double order) {
        totalPrice = order * price;

        //the following if statements are for the discounts
        if (order >= 5 && order < 10) {
            discountLevel = 1;
            discountPrice =totalPrice * 0.90;
        } else if (order >= 10) {
            discountLevel = 2;
            discountPrice = totalPrice * 0.80;
        }

        return totalPrice;
    }



}
