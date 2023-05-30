public class personRegular {

    public static void main(String[] args) {
        //create variables
        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagen Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;
        double monthlyRate1, monthlyRate2;
        double adjustedRate1, adjustedRate2;
        double total1, total2;

        //logic in the car insurance industry - if you have traffic tickets, DUIs, etc
        //you will be paying more for your insurance
        //poor credit, pay more money

        if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        }   else {
            monthlyRate1 = 100;
        }

        if(secondPersonViolations == true && secondPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        }   else {
            monthlyRate2 = 100;
        }

        if(firstPersonGender == 'F' && firstPersonAge <= 25) {
            adjustedRate1 = 100;
        } else {
            adjustedRate1 = 0;
        }

        if(secondPersonGender == 'F' && secondPersonAge <=25) {
            adjustedRate2 = 100;
        } else {
            adjustedRate2 = 0;
        }

        total1 = monthlyRate1 + adjustedRate1;
        total2 = monthlyRate2 + adjustedRate2;

        System.out.printf("First Person Name: %s%n", firstPersonName);
        System.out.printf("First Person Gender: %c%n", firstPersonGender);
        System.out.printf("First Person Age: %d%n", firstPersonAge);
        System.out.printf("First Person Car: %s%n", firstPersonCar);
        System.out.printf("First Person Violations: %b%n", firstPersonViolations);
        System.out.printf("First Person Credit Score: %d%n", firstPersonCreditScore);
        System.out.printf("First Person Preliminary Rate: %.0f%n", monthlyRate1);
        System.out.printf("First Person Final Monthly Rate(Including Gender & Age): %.0f%n%n", total1);


        System.out.printf("Second Person Name: %s%n", secondPersonName);
        System.out.printf("Second Person Gender: %c%n", secondPersonGender);
        System.out.printf("Second Person Age: %d%n", secondPersonAge);
        System.out.printf("Second Person Car: %s%n", secondPersonCar);
        System.out.printf("Second Person Violations: %b%n", secondPersonViolations);
        System.out.printf("Second Person Credit Score: %d%n", secondPersonCreditScore);
        System.out.printf("Second Person Preliminary Rate: %.0f%n", monthlyRate2);
        System.out.printf("Second Person Final Monthly Rate(Including Gender & Age): %.0f%n%n", total2);


    }
}
