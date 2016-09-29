package data.dto;

import data.enums.Gender;

import java.util.Date;

/**
 * Created by bzawa on 9/29/2016.
 */
public class RegistrationData {

    private Gender gender;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String company;
    private String password;

    public Gender getGender() {
        return gender;
    }

    public RegistrationData setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public RegistrationData setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public RegistrationData setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public RegistrationData setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public RegistrationData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCompany() {
        return company;
    }

    public RegistrationData setCompany(String company) {
        this.company = company;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public RegistrationData setPassword(String password) {
        this.password = password;
        return this;
    }

    public static final class RegistrationDataBuilder {
        private Gender gender;
        private String firstName;
        private String lastName;
        private Date dateOfBirth;
        private String email;
        private String company;
        private String password;

        private RegistrationDataBuilder() {
        }

        public static RegistrationDataBuilder aRegistrationData() {
            return new RegistrationDataBuilder();
        }

        public RegistrationDataBuilder withGender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public RegistrationDataBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public RegistrationDataBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public RegistrationDataBuilder withDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public RegistrationDataBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public RegistrationDataBuilder withCompany(String company) {
            this.company = company;
            return this;
        }

        public RegistrationDataBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public RegistrationData build() {
            RegistrationData registrationData = new RegistrationData();
            registrationData.setGender(gender);
            registrationData.setFirstName(firstName);
            registrationData.setLastName(lastName);
            registrationData.setDateOfBirth(dateOfBirth);
            registrationData.setEmail(email);
            registrationData.setCompany(company);
            registrationData.setPassword(password);
            return registrationData;
        }
    }
}
