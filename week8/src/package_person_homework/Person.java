package package_person_homework;

public class Person {

    String name, car;
    char gender;
    int age, carYear, currentYear = 2023, carAge;
    boolean violations;
    double creditScore, monthlyRate, adjustedRate, monthlyTotal, adjustedRateCarAge;

    public void display() {
        System.out.printf("Customer name: %s%n", name);
        System.out.printf("Age: %d%n",age);
        System.out.printf("Gender: %c%n",gender);
        System.out.printf("Car: %s%n",car);
        System.out.printf("Car Year: %d, Car Age: %d%n", carYear, carAge);
        System.out.printf("Violations: %b%n",violations);
        System.out.printf("Credit Score: %.0f%n",creditScore);
        //        this code was just to check if the values of each rate is correct
        //        System.out.printf("Monthly Rate: %.0f, Adjusted Rate: %.0f, Adjusted Car Age Rate: %.0f%n"
        //                , monthlyRate, adjustedRate, adjustedRateCarAge);
        System.out.printf("Total Monthly Premium: $%.0f%n%n", monthlyTotal);
    }

    //find monthly rate based on violations and credit score
    public double getRate(double monthlyRate) {
        if(violations == true && creditScore <= 700) {
            monthlyRate = 400;
        } else {
            monthlyRate = 100;
        }

        return monthlyRate;
    }

    //find adjusted rate based on the gender and age
    public double assumingGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 140;
        } else {
            adjustedRate = 25;
        }

        return  adjustedRate;
    }

    //find adjusted rate based on the age of the car
    public double carAgeRate(double adjustedRateCarAge) {
        carAge = currentYear - carYear;

        if (carAge <= 5) {
            adjustedRateCarAge = 163;
        } else if(carAge > 5 && carAge <= 15) {
            adjustedRateCarAge = 104;
        } else {
            adjustedRateCarAge = 75;
        }

        return  adjustedRateCarAge;
    }

    //get calculation of monthly total by calling method
    public void getMonthlyTotal() {
        monthlyTotal = adjustedRate + monthlyRate + adjustedRateCarAge;

    }

}
