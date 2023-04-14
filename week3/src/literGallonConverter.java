public class literGallonConverter {

    public static void main(String[] args) {
        double lit, gal;
        int x = 0;
        // 1 Gallon = 3.79 Liters

        for(gal = 1; gal <= 100; gal += 4) {
            lit = gal * 3.79;

            if(gal == 1) { //if-else statement for gallon/s
                System.out.printf("%.2f Liters = %.1f Gallon\n", lit, gal);
            } else {
                System.out.printf("%.2f Liters = %.1f Gallons\n", lit, gal);
            }

            x += 1;
            if(x == 5) { //print a space every 5 lines
                System.out.println(" ");
                x = 0; //reset value
            }
        }

        System.out.println("We are done!!!!!");
    }

}
