package guru.qa.utils;

import com.github.javafaker.Faker;
import java.util.concurrent.ThreadLocalRandom;

import static guru.qa.TestData.*;

public class DataTestGenerated {


    public  String getRandomFirstName() {

        return faker.name().firstName();
    }

    public  String getRandomLastName() {

        return faker.name().lastName();
    }

    public  String getRandomEmail() {

        return faker.internet().emailAddress();

    }

    public  String getRandomGender(){

        String[] genders =  {"Male", "Female", "Other"};

        return new Faker().options().option(genders);

    }

    public  String getRandomMonth() {

        String[] months =  {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};

        return new Faker().options().option(months);

    }

    public  int getRandomInt(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public  String getRandomYear() {

        return new Faker().random().nextInt(1980, 2001).toString();

    }

    public  String getRandomDay() {
        int day = getRandomInt(1, 28);
        if (day < 10) {
            return "0" + day;
        } else {
            return Integer.toString(day);
        }
    }


    public  String getRandomPhoneNumber() {

        return faker.numerify("##########");
    }

    public  String getRandomSubject() {

        String[] subjects =  {"Accounting", "Arts", "Biology", "Chemistry", "Civics", "Economics",
                "English", "Commerce", "Computer Science", "Physics", "Maths", "Hindi", "History", "Social Studies"};

        return new Faker().options().option(subjects);

    }


    public  String getRandomHobie() {

        String[] hobbies =  {"Sports", "Reading", "Music"};

        return new Faker().options().option(hobbies);
    }

    public  String getRandomAddress() {

        return faker.address().fullAddress();

    }

    public  String getRandomState() {

        return "Haryana";
    }

    public  String getRandomCity(String stateValue) {

        return "Karnal";
    }

}
