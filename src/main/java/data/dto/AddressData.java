package data.dto;

/**
 * Created by Bartlomiej_Zawadzki on 9/30/2016.
 */
public class AddressData {

    private String country;
    private String city;
    private String address;
    private String postCode;
    private String phoneNumber;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public static final class AddressDataBuilder {
        private String country;
        private String city;
        private String address;
        private String postCode;
        private String phoneNumber;

        private AddressDataBuilder() {
        }

        public static AddressDataBuilder anAddressData() {
            return new AddressDataBuilder();
        }

        public AddressDataBuilder withCountry(String country) {
            this.country = country;
            return this;
        }

        public AddressDataBuilder withCity(String city) {
            this.city = city;
            return this;
        }

        public AddressDataBuilder withAddress(String address) {
            this.address = address;
            return this;
        }

        public AddressDataBuilder withPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }

        public AddressDataBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public AddressData build() {
            AddressData addressData = new AddressData();
            addressData.setCountry(country);
            addressData.setCity(city);
            addressData.setAddress(address);
            addressData.setPostCode(postCode);
            addressData.setPhoneNumber(phoneNumber);
            return addressData;
        }
    }
}
