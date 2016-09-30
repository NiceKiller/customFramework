package data.dto;

/**
 * Created by Bartlomiej_Zawadzki on 9/30/2016.
 */
public class PaymentData {

    private String cardHolderName;
    private String cardNumber;
    private String expirationMonth;
    private String expirationYear;
    private String cardCode;

    public String getCardHolderName() {
        return cardHolderName;
    }

    public void setCardHolderName(String cardHolderName) {
        this.cardHolderName = cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpirationMonth() {
        return expirationMonth;
    }

    public void setExpirationMonth(String expirationMonth) {
        this.expirationMonth = expirationMonth;
    }

    public String getExpirationYear() {
        return expirationYear;
    }

    public void setExpirationYear(String expirationYear) {
        this.expirationYear = expirationYear;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }


    public static final class PaymentDataBuilder {
        private String cardHolderName;
        private String cardNumber;
        private String expirationMonth;
        private String expirationYear;
        private String cardCode;

        private PaymentDataBuilder() {
        }

        public static PaymentDataBuilder aPaymentData() {
            return new PaymentDataBuilder();
        }

        public PaymentDataBuilder withCardHolderName(String cardHolderName) {
            this.cardHolderName = cardHolderName;
            return this;
        }

        public PaymentDataBuilder withCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public PaymentDataBuilder withExpirationMonth(String expirationMonth) {
            this.expirationMonth = expirationMonth;
            return this;
        }

        public PaymentDataBuilder withExpirationYear(String expirationYear) {
            this.expirationYear = expirationYear;
            return this;
        }

        public PaymentDataBuilder withCardCode(String cardCode) {
            this.cardCode = cardCode;
            return this;
        }

        public PaymentData build() {
            PaymentData paymentData = new PaymentData();
            paymentData.setCardHolderName(cardHolderName);
            paymentData.setCardNumber(cardNumber);
            paymentData.setExpirationMonth(expirationMonth);
            paymentData.setExpirationYear(expirationYear);
            paymentData.setCardCode(cardCode);
            return paymentData;
        }
    }
}
