package data.dataProviders;

import com.tngtech.java.junit.dataprovider.DataProvider;
import data.testData.AddressTestData;
import data.testData.PaymentTestData;
import data.testData.RegistrationTestData;

/**
 * Created by bzawa on 9/29/2016.
 */
public class CartTestDataProvider {

    @DataProvider
    public static Object[][] cartTestDataProvider() {
        return new Object[][]{
                {RegistrationTestData.RegistrationDataCorrect(), "HTC One Mini Blue", AddressTestData.addressDataCorrect(), PaymentTestData.paymentDataCorrect()},
                {RegistrationTestData.RegistrationDataWithWrongEmail(), "HTC One Mini Blue", AddressTestData.addressDataCorrect(), PaymentTestData.paymentDataCorrect()}
        };
    }
}
