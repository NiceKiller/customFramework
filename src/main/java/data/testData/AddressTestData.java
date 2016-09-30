package data.testData;

import data.dto.AddressData;

/**
 * Created by Bartlomiej_Zawadzki on 9/30/2016.
 */
public class AddressTestData {

    private AddressTestData() {
    }

    private static AddressData addressTestData() {
        AddressData addressData = AddressData.AddressDataBuilder.anAddressData()
                .withCountry("Poland")
                .withCity("Gdansk")
                .withAddress("some address 12")
                .withPostCode("80000")
                .withPhoneNumber("500500500")
                .build();
        return addressData;
    }

    public static AddressData addressDataCorrect() {
        return addressTestData();
    }
}
