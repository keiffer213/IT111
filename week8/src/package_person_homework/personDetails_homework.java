package package_person_homework;

public class personDetails_homework {

    public static void main(String[] args) {
        //create objects
        Person firstPerson = new Person();
        Person secondPerson = new Person();
        Person thirdPerson = new Person();

        //Assign values to objects
        firstPerson.name = "Maddie";
        firstPerson.gender = 'F';
        firstPerson.age = 35;
        firstPerson.car = "BMW M3";
        firstPerson.carYear = 2017;
        firstPerson.violations = true;
        firstPerson.creditScore = 820;

        secondPerson.name = "Billy";
        secondPerson.gender = 'M';
        secondPerson.age = 42;
        secondPerson.car = "Honda Civic";
        secondPerson.carYear = 2005;
        secondPerson.violations = true;
        secondPerson.creditScore = 699;

        thirdPerson.name = "Patrick";
        thirdPerson.gender = 'M';
        thirdPerson.age = 21;
        thirdPerson.car = "Toyota Supra";
        thirdPerson.carYear = 2022;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 500;

        //get values for monthlyRate & adjustedRate
        firstPerson.monthlyRate = firstPerson.getRate(firstPerson.monthlyRate);
        firstPerson.adjustedRate = firstPerson.assumingGender(firstPerson.adjustedRate);
        firstPerson.adjustedRateCarAge = firstPerson.carAgeRate(firstPerson.adjustedRateCarAge);
        firstPerson.getMonthlyTotal();

        secondPerson.monthlyRate = secondPerson.getRate(secondPerson.monthlyRate);
        secondPerson.adjustedRate = secondPerson.assumingGender(secondPerson.adjustedRate);
        secondPerson.adjustedRateCarAge = secondPerson.carAgeRate(secondPerson.adjustedRateCarAge);

        secondPerson.getMonthlyTotal();
        thirdPerson.monthlyRate = thirdPerson.getRate(thirdPerson.monthlyRate);
        thirdPerson.adjustedRate = thirdPerson.assumingGender(thirdPerson.adjustedRate);
        thirdPerson.adjustedRateCarAge = thirdPerson.carAgeRate(thirdPerson.adjustedRateCarAge);
        thirdPerson.getMonthlyTotal();

        //call display methods
        firstPerson.display();
        secondPerson.display();
        thirdPerson.display();
    }

}
