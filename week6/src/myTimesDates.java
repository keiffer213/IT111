import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

import static java.time.LocalDate.parse;

public class myTimesDates {

    public static void main(String[] args){
        //keep it simple - display current date
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        //don't like it, would like to see month, day of week & year

        Month currentMonth = LocalDate.now().getMonth();
        System.out.println(currentMonth);


        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        System.out.println(currentDay);

        //year would have to be an integer
        int currentYear = LocalDate.now().getYear();
        System.out.println(currentYear);

        //we would like to now the number of the day
        //if today is the 9th of the month - 9
        int currentDayNumber = LocalDate.now().getDayOfMonth();
        System.out.println(currentDayNumber);

        System.out.println("Today is " + currentDay+ ",  " +currentMonth +
                " " + currentDayNumber+ "th, " +currentYear);
    }
}
