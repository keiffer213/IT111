public class myEnum2 {

    enum Wines {CABERNET, MERLOT, SYRAH}

    public static void main(String[] args) {

        Wines choose = Wines.CABERNET;

        switch (choose) {
            case CABERNET-> {
                System.out.println("Love my Washington Cabernets");
            }
            case MERLOT-> {
                System.out.println("The main character is Sideways did not like merlots");
            }
            case SYRAH-> {
                System.out.println("I like some Syrahs");
            }
            default -> {
                System.out.println("Invaalid input");
            }
        }

    }
}
