package package_person;

public class personDetails {
    //this file will have a main method

    public static void main(String[] args) {
        Person firstPerson, secondPerson, thirdPerson;
        //in the process of creating an object from my Person class

        firstPerson = new Person(); //doing new creates a new object
        secondPerson = new Person();
        thirdPerson = new Person();

        //we will be entering the info, assigning values to fields
        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = "Volkswagen Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Ariel";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = "Lexus";
        thirdPerson.violations = true;
        thirdPerson.creditScore =600;

        //instead of doing each one, we create a method in Person.java to print this all out
//        System.out.printf("%s%n",firstPerson.name);
//        System.out.printf("%d%n",firstPerson.age);
//        System.out.printf("%c%n",firstPerson.gender);
//        System.out.printf("%s%n",firstPerson.car);
//        System.out.printf("%b%n",firstPerson.violations);
//        System.out.printf("%.0f%n%n",firstPerson.creditScore);
//
//        System.out.printf("%s%n",secondPerson.name);
//        System.out.printf("%d%n",secondPerson.age);
//        System.out.printf("%c%n",secondPerson.gender);
//        System.out.printf("%s%n",secondPerson.car);
//        System.out.printf("%b%n",secondPerson.violations);
//        System.out.printf("%.0f%n",secondPerson.creditScore);

        //the next code is just a test code to see if it works which it does!
        firstPerson.monthlyRate = firstPerson.getRate(firstPerson.monthlyRate);
        firstPerson.adjustedRate = firstPerson.assumingGender(firstPerson.adjustedRate);
//        System.out.println(firstPerson.monthlyRate);
//        System.out.println(firstPerson.adjustedRate);
        firstPerson.totalMonthly = firstPerson.monthlyRate + firstPerson.adjustedRate;
//
        secondPerson.monthlyRate = secondPerson.getRate(secondPerson.monthlyRate);
        secondPerson.adjustedRate = secondPerson.assumingGender(secondPerson.adjustedRate);
        secondPerson.totalMonthly = secondPerson.monthlyRate +secondPerson.adjustedRate;
//        System.out.println(secondPerson.monthlyRate);
//        System.out.println(secondPerson.adjustedRate);

        thirdPerson.monthlyRate = thirdPerson.getRate(thirdPerson.monthlyRate);
        thirdPerson.adjustedRate = thirdPerson.assumingGender(thirdPerson.adjustedRate);
        thirdPerson.totalMonthly = thirdPerson.monthlyRate +thirdPerson.adjustedRate;


        firstPerson.display();
        System.out.println("Preliminary rate for " +firstPerson.name
                +": $" + firstPerson.getRate(firstPerson.monthlyRate));
        System.out.println("Adjusted rate for " +firstPerson.name
                +": $" +firstPerson.assumingGender(firstPerson.adjustedRate));
        System.out.println("Total Monthly Premium: $" + firstPerson.totalMonthly + "\n");

        secondPerson.display();
        System.out.println("Preliminary rate for " +secondPerson.name
                +": $" +secondPerson.getRate(secondPerson.monthlyRate));
        System.out.println("Adjusted rate for " +secondPerson.name
                +": $" +secondPerson.assumingGender(secondPerson.adjustedRate));
        System.out.println("Total Monthly Premium: $" + secondPerson.totalMonthly + "\n");

        thirdPerson.display();
        System.out.println("Preliminary rate for " +thirdPerson.name
                +": $" +thirdPerson.getRate(thirdPerson.monthlyRate));
        System.out.println("Adjusted rate for " +thirdPerson.name
                +": $" +thirdPerson.assumingGender(thirdPerson.adjustedRate));
        System.out.println("Total Monthly Premium: $" + thirdPerson.totalMonthly);
    }
}
