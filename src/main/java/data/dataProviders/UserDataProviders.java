package data.dataProviders;

import com.tngtech.java.junit.dataprovider.DataProvider;

/**
 * Created by bzawa on 9/29/2016.
 */
public class UserDataProviders {

    @DataProvider
    public static Object[][] dataProviderCustomers() {
        return new Object[][] {
                { "ta_api_test_100", "Password1", "ta_api_test_100@mailinator.com", "Hans", "Wurst" },
                { "ta_api_test_101", "Password1", "ta_api_test_101@mailinator.com", "Terry", "Camilleri" },
                { "ta_api_test_102", "Password1", "ta_api_test_102@mailinator.com", "Awsfs", "Sadfasf" },
        };
    }
}
