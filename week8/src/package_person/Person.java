package package_person;

public class Person {
    //this file doesn't have a main method
    //we will start typing fields (variables)

    String name, car;
    char gender;
    int age;
    boolean violations;
    double creditScore, monthlyRate, adjustedRate, totalMonthly;

    public void display() {
        System.out.printf("Customer name: %s%n",name);
        System.out.printf("Age: %d%n",age);
        System.out.printf("Gender: %c%n",gender);
        System.out.printf("Car: %s%n",car);
        System.out.printf("Violations: %b%n",violations);
        System.out.printf("Credit Score: %.0f%n",creditScore);
    }

    //our logic is regarding our credit score & violations
    public double getRate(double monthlyRate) {
        if(violations == true && creditScore <= 700) {
            monthlyRate = 500;
        } else {
            monthlyRate = 100;
        }
        return  monthlyRate;
    }

    public double assumingGender(double adjustedRate) {
        if (gender == 'M' && age <= 25) {
            adjustedRate = 100;
        } else {
            adjustedRate = 0;
        }
        return  adjustedRate;
    }

}
