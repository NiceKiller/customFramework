package data.testData;

import data.dto.RegistrationData;
import data.enums.Gender;

import java.sql.Date;

/**
 * Created by bzawa on 9/29/2016.
 */
public class RegistrationTestData {

    public static RegistrationData RegistrationTestData(){
        RegistrationData registrationData = new RegistrationData.RegistrationDataBuilder()
                .withGender(Gender.MALE)
                .withFirstName("Lolo")
                .withLastName("Bolo")
                .withDateOfBirth(Date.valueOf())

    }
}
