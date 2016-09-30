package data.testData;

import data.dto.PaymentData;

/**
 * Created by Bartlomiej_Zawadzki on 9/30/2016.
 */
public class PaymentTestData {

    private PaymentTestData() {
    }

    private static PaymentData paymentTestData() {
        PaymentData paymentData = PaymentData.PaymentDataBuilder.aPaymentData()
                .withCardHolderName("holder")
                .withCardNumber("4012888888881881")
                .withCardCode("222")
                .withExpirationMonth("1")
                .withExpirationYear("2020")
                .build();
        return paymentData;
    }

    public static PaymentData paymentDataCorrect() {
        return paymentTestData();
    }

}
