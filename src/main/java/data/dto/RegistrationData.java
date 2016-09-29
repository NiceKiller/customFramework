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

    public RegistrationData(Gender gender, String firstName, String lastName, Date dateOfBirth, String email, String company, String password) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.company = company;
        this.password = password;
    }

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
    
}
