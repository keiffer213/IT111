import java.util.Arrays;

public class myArrays {

    public static void main(String[] args) {

//        String car = "Volvo";
//        String[] cars = new String[4];//start counting at [0]
//        cars[0] = "Volvo";
//        cars[1] = "Ford";
//        cars[2] = "Toyota";
//        cars[3] = "Honda";
        String cars[] = {"Volvo", "Ford", "Toyota", "Honda"};

        System.out.println(cars[2].toUpperCase());
        //cannot just print cars array without import
        System.out.println(Arrays.toString(cars));

//        String[] books = {"Handmaid's Tale", "Slenderman",
//                "The Joy Luck Club", "East of Eden", "The Looking Tower"};
        String[] books = new String[5];
        books[0] = "Handmaid's Tale";
        books[1] = "Slenderman";
        books[2] = "The Joy Luck Club";
        books[3] = "East of Eden";
        books[4] = "The Looking Tower";

        System.out.println(Arrays.toString(books));
        //we are gonna build a for each look
        for(String book : books) {
            System.out.println(book);

        }

        int[] numbers = new int[3];
        numbers[0] = 20;
        numbers[1] = 30;
        numbers[2] = 50;

        System.out.println(Arrays.toString(numbers));
        for(int number : numbers) {
            System.out.println(number);
        }

        String[] wines = new String[5];
        wines[0] = "Cabernet";
        wines[1] = "Merlot";
        wines[2] = "Syrah";
        wines[3] = "Malbac";
        wines[4] = "Cabernet-Frank";

        for(String wine: wines){
            System.out.println(wine);
            System.out.println(wine.length());
        }

        for(String wine: wines) {
            if(wine.equals("Syrah")) {
                break;
            }
            System.out.println(wine);
        }

        for(String wine: wines) {
            if(wine.equals("Malbac")) {
                break;
            }
            System.out.println(wine);
        }

    }
}
