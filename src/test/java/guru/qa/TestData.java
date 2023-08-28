package guru.qa;

import com.github.javafaker.Faker;
import java.util.Locale;
import static guru.qa.utils.DataTestGenerated.*;

public class TestData {

    public static Faker faker = new Faker(new Locale("en"));

    public static String
            firstName = getRandomFirstName(),
            lastName = getRandomLastName(),
            email = getRandomEmail(),
            phone = getRandomPhoneNumber(),
            subject = getRandomSubject(),
            currentAddress = getRandomAddress(),
            month = getRandomMonth(),
            day = getRandomDay(),
            year = getRandomYear(),
            gender = getRandomGender(),
            hobbie = getRandomHobie(),
            state = getRandomState(),
            city = getRandomCity(state),
            foto = "foto.jpg";

}
