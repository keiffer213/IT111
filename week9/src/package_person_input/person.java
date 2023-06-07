package package_person_input;

public class person {
    //no main method
    //create the fields

    String name, zipCode;
    char gender;
    int age, states, cityCode;
    //we have individual violations & main violations
    boolean violations, violationDUI, violationRedLight, violationSpeeding;
    double creditScore, baselineRate = 300, adjustedRate, monthlyRate, surCharge, totalRate;

    //create method named display for printing information
    public void display() {
        System.out.println("This is what you have entered!");
        System.out.printf("%s%n", name);
        System.out.printf("%d%n", age);
        System.out.printf("%c%n", gender);
        System.out.printf("%s%n", zipCode);
        System.out.printf("Your baseline rate is: $%.0f%n", baselineRate);
        System.out.println("Your baseline rate is calculated without taking into consideration" +
                " the following: Age, Credit Score, Violations and residence %n");
        System.out.printf("Violations: %b%n", violations);
        System.out.printf("DIO Violation: %b%n", violationDUI);
        System.out.printf("Red Light Violation: %b%n", violationRedLight);
        System.out.printf("Speeding Violations: %b%n", violationSpeeding);
        System.out.printf("Credit Score: %.0f%n", creditScore);

    }

    //method for violations & credit score
    public double getRate(double monthlyRate) {
        if(violations == true || creditScore <= 700) {
            monthlyRate = 300;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }

    //new method for age, if younger or older pay more money
    public double ageCategory(double adjustedRate) {
        if(age <= 25 || age >= 65) {
            adjustedRate = 300.00;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    //method for states/zipcode/strings/changing string to integer!
    public int identifyRegion(int states) {
        // 90-96 is CA, 97 is OR, 98-99 is WA
        String zip2;
        zip2 = zipCode.substring(0,2);
        cityCode = Integer.parseInt(zip2);

        if(cityCode >= 90 && cityCode <= 96) {
            System.out.printf("You entered %s and you're from California!%n", zipCode);
        } else if (cityCode == 97) {
            System.out.printf("You entered %s and you're from Oregon!%n", zipCode);
        } else if (cityCode == 98 || cityCode == 99) {
            System.out.printf("You entered %s and you're from Washington!%n", zipCode);
        } else {
            System.out.println("You're not from the PNW, please contact our National Office%n");
        }
        return cityCode;
    }

    //method to charge a surcharge to people who live in CA
    public double californiaRegion(double surCharge) {
        if(cityCode >= 90 && cityCode <= 96) {
            surCharge = 200;
        } else {
            surCharge = 0;
        }
        return surCharge;
    }
}
