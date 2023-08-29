package guru.qa;

import com.github.javafaker.Faker;
import guru.qa.utils.DataTestGenerated;


import java.util.Locale;

public class TestData {

    public static Faker faker = new Faker(new Locale("en"));
    DataTestGenerated data = new DataTestGenerated();

    public String
            firstName = data.getRandomFirstName(),
            lastName = data.getRandomLastName(),
            email = data.getRandomEmail(),
            phone = data.getRandomPhoneNumber(),
            subject = data.getRandomSubject(),
            currentAddress = data.getRandomAddress(),
            month = data.getRandomMonth(),
            day = data.getRandomDay(),
            year = data.getRandomYear(),
            gender = data.getRandomGender(),
            hobbie = data.getRandomHobie(),
            state = data.getRandomState(),
            city = data.getRandomCity(state),
            foto = "foto.jpg";


}
