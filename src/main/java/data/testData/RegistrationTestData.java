package data.testData;

import data.dto.RegistrationData;
import data.enums.Gender;

import java.time.LocalDate;
import java.time.Month;

/**
 * Created by bzawa on 9/29/2016.
 */
public class RegistrationTestData {

    private RegistrationTestData() {
    }

    private static RegistrationData registrationTestData() {
        RegistrationData registrationData = RegistrationData.RegistrationDataBuilder.aRegistrationData()
                .withGender(Gender.MALE)
                .withFirstName("Lolo")
                .withLastName("Bolo")
                .withDateOfBirth(LocalDate.of(1990, Month.APRIL, 1))
                .withEmail("lolo@lolo.com")
                .withCompany("company")
                .withPassword("password")
                .build();
        return registrationData;
    }

    public static RegistrationData RegistrationDataCorrect() {
        return registrationTestData();
    }

    public static RegistrationData RegistrationDataWithWrongEmail() {
        return registrationTestData().setEmail("wrongemail");
    }
}
