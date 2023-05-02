import java.util.Scanner;

public class myEnum {

    enum whoWins {HOME, VISITOR, NEITHER}

    public static void main(String[] args) {
        //now declare a variable
        whoWins who;
        int seahawks, broncos;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos");
        broncos = input.nextInt();

        //if the seahawks score greater than the broncos
        if (seahawks > broncos) {
            who = whoWins.HOME; //whoWins.HOME is an object of the whoWins type
            System.out.println(who + " team won!");
            System.out.println("Seahawks win by "+ (seahawks-broncos)+" points!");
        } else if (broncos >seahawks) {
            who = whoWins.VISITOR; //whoWins.HOME is an object of the whoWins type
            System.out.println(who + " team won!");
            System.out.println("Broncos win by "+ (broncos-seahawks)+" points!");
        } else {
            who = whoWins.NEITHER;
            System.out.println(who + " team won!");
            System.out.println("It's a tie!");
        }

    }
}
