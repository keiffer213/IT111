import java.util.Scanner;

public class GradeAveraging {

    public static void main(String[] args) {
    //ask the end user to inut their numberical grades
        int grade, counter = 1;
        double total = 0, average = 0;

        Scanner input = new Scanner(System.in);

        //our while loop will count how many times we are asking
        //our user to input a grade

        while(counter <= 5) {
            System.out.printf("Please enter your %d numerical grade: ", counter);
            grade = input.nextInt();
            if (grade < 0 || grade > 100) {//makes sure the value input is a valid grade
                System.out.println("Please enter a grade between 0 and 100");
            } else {
                total += grade;
                counter++;
            }
        }
        counter--;
        String message;
        char letterGrade;

        average = total/counter;

        System.out.printf("You have earned an average grade of %.2f after" +
                " providing us with %d grades\n", average, counter);

        if(average >= 90 && average <= 100) {
            letterGrade = 'A';
            message = "Excellent work!";
        } else if (average >= 80 && average < 90) {
            letterGrade = 'B';
            message = "Solid work!";
        } else if (average >= 70 && average < 80) {
            letterGrade = 'C';
            message = "More studying necessary";
        } else if (average >= 60 && average < 70) {
            letterGrade = 'D';
            message = "Sneaking by";
        } else {
            letterGrade = 'F';
            message = "Not a passing grade";
        }

        System.out.printf("You have earned the following letter grade %c and here is the message: %n%s", letterGrade,message);
    }
}
