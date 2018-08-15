package com.example.FormValidation;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class JobApplicationForm {
    @NotNull
    @Size(min = 1, max = 20)
    private String Name;

    @NotNull
    @Size(min = 1, max = 20)
    private String Adress1;

    @NotNull
    @Size(min = 1, max = 20)
    private String Adress2;

    @Size(min = 1, max = 5)
    @NotNull
    private String Zipcode;

    @Size(min = 1, max = 30)
    @NotNull
    private String City;

    @Size(min = 1, max = 20)
    @NotNull
    private String Country;


    @NotNull
    private String Gender;

    @Size(min = 1, max =3)
    @NotNull
    private String age;


    private String driverlicense;

    private String nightshift;

    private String weekends;

    private String fulltime;


    @Size(min = 1, max = 200)
    @NotNull
    private String description;

    @Size(min = 1, max = 500)
    @NotNull
    private String CV;

    public JobApplicationForm(String name, String adress1, String adress2, String zipcode, String city, String country, String gender, String age, String driverlicense, String nightshift, String weekends, String fulltime, String description, String CV) {
        Name = name;
        Adress1 = adress1;
        Adress2 = adress2;
        Zipcode = zipcode;
        City = city;
        Country = country;
        Gender = gender;
        this.age = age;
        this.driverlicense = driverlicense;
        this.nightshift = nightshift;
        this.weekends = weekends;
        this.fulltime = fulltime;
        this.description = description;
        this.CV = CV;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdress1() {
        return Adress1;
    }

    public void setAdress1(String adress1) {
        Adress1 = adress1;
    }

    public String getAdress2() {
        return Adress2;
    }

    public void setAdress2(String adress2) {
        Adress2 = adress2;
    }

    public String getZipcode() {
        return Zipcode;
    }

    public void setZipcode(String zipcode) {
        Zipcode = zipcode;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getDriverlicense() {
        return driverlicense;
    }

    public void setDriverlicense(String driverlicense) {
        this.driverlicense = driverlicense;
    }

    public String getNightshift() {
        return nightshift;
    }

    public void setNightshift(String nightshift) {
        this.nightshift = nightshift;
    }

    public String getWeekends() {
        return weekends;
    }

    public void setWeekends(String weekends) {
        this.weekends = weekends;
    }

    public String getFulltime() {
        return fulltime;
    }

    public void setFulltime(String fulltime) {
        this.fulltime = fulltime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCV() {
        return CV;
    }

    public void setCV(String CV) {
        this.CV = CV;
    }




}
