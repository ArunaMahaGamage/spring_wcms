package com.aruna.wcms.citizen.model;

import jakarta.persistence.*;

@Entity
public class Citizen {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String idNumber;

    private String dateOfBirth;

    private String gender;

    private String address;

    private String email;

    private String mobileNumber;
    
    private String provincial;

    private String district;

    private String divisionalSecretaryDivisions;

    @Transient
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getDivisionalSecretaryDivisions() {
        return divisionalSecretaryDivisions;
    }

    public void setDivisionalSecretaryDivisions(String divisionalSecretaryDivisions) {
        this.divisionalSecretaryDivisions = divisionalSecretaryDivisions;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
