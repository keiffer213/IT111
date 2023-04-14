public class celciusFarConverter {

    public static void main(String[] args) {
        // fahrenheit = ( celsius * 9/5) + 32

        int cel, far;

        for(cel = 0; cel <= 100; cel = cel+2) {
        far = (cel * 9/5) + 32;
            //System.out.printf("Celsius: %d, Fahrenheit: %d \n", cel, far);

            System.out.println(cel + " degrees Celsius is equal to " +
                    far + " degrees Fahrenheit");
        }
        System.out.println("All Done!");
    }
}
