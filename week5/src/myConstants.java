import java.util.Scanner;

public class myConstants {

    public static void main(String[] args) {

        final int TOUCHDOWN = 6;
        final int CONVERSION = 1;
        final int FIELDGOAL = 3;

        int td, con, fg;
        //ask end user to enter touchdowns, con, and fg

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of touchdowns!");
        td = input.nextInt() * TOUCHDOWN;
        System.out.println("Please enter the number of conversions!");
        con = input.nextInt() * CONVERSION;
        System.out.println("Please enter the number of field goals!");
        fg = input.nextInt() * FIELDGOAL;

        System.out.printf("%d %d %d%n", td, con, fg);
        System.out.printf("Our total score is %d", td+con+fg);


    }
}
