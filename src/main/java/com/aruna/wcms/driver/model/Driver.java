package com.aruna.wcms.driver.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String driverLicenceNumber;

    @Column(unique = true)
    private String driverIDNumber;

    private String driverFullName;

    private String firstName;

    private String lastName;

    private String birthDate;

    private String licenceDateOfIssue;

    private String address;

    private String mobileNumber;

    @ColumnDefault("false")
    Boolean lightMotorcycles;

    @ColumnDefault("false")
    Boolean motorcycles;

    @ColumnDefault("false")
    private Boolean motorTricycle;

    @ColumnDefault("false")
    private Boolean dualPurposeVehicles;

    @ColumnDefault("false")
    private Boolean quadricycles;

    @ColumnDefault("false")
    private Boolean lightMotorLorry;

    @ColumnDefault("false")
    private Boolean motorLorry;

    @ColumnDefault("false")
    private Boolean heavyMotorLorry;

    @ColumnDefault("false")
    private Boolean lightMotorCoach;

    @ColumnDefault("false")
    private Boolean motorCoach;

    @ColumnDefault("false")
    private Boolean heavyMotorCoach;

    @ColumnDefault("false")
    private Boolean landVehicle;

    @ColumnDefault("false")
    private Boolean motorizedInvalidCarriage;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriverLicenceNumber() {
        return driverLicenceNumber;
    }

    public void setDriverLicenceNumber(String driverLicenceNumber) {
        this.driverLicenceNumber = driverLicenceNumber;
    }

    public String getDriverIDNumber() {
        return driverIDNumber;
    }

    public void setDriverIDNumber(String driverIDNumber) {
        this.driverIDNumber = driverIDNumber;
    }

    public String getDriverFullName() {
        return driverFullName;
    }

    public void setDriverFullName(String driverFullName) {
        this.driverFullName = driverFullName;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getLicenceDateOfIssue() {
        return licenceDateOfIssue;
    }

    public void setLicenceDateOfIssue(String licenceDateOfIssue) {
        this.licenceDateOfIssue = licenceDateOfIssue;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Boolean getLightMotorcycles() {
        return lightMotorcycles;
    }

    public void setLightMotorcycles(Boolean lightMotorcycles) {
        this.lightMotorcycles = lightMotorcycles;
    }

    public Boolean getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(Boolean motorcycles) {
        this.motorcycles = motorcycles;
    }

    public Boolean getMotorTricycle() {
        return motorTricycle;
    }

    public void setMotorTricycle(Boolean motorTricycle) {
        this.motorTricycle = motorTricycle;
    }

    public Boolean getDualPurposeVehicles() {
        return dualPurposeVehicles;
    }

    public void setDualPurposeVehicles(Boolean dualPurposeVehicles) {
        this.dualPurposeVehicles = dualPurposeVehicles;
    }

    public Boolean getQuadricycles() {
        return quadricycles;
    }

    public void setQuadricycles(Boolean quadricycles) {
        this.quadricycles = quadricycles;
    }

    public Boolean getLightMotorLorry() {
        return lightMotorLorry;
    }

    public void setLightMotorLorry(Boolean lightMotorLorry) {
        this.lightMotorLorry = lightMotorLorry;
    }

    public Boolean getMotorLorry() {
        return motorLorry;
    }

    public void setMotorLorry(Boolean motorLorry) {
        this.motorLorry = motorLorry;
    }

    public Boolean getHeavyMotorLorry() {
        return heavyMotorLorry;
    }

    public void setHeavyMotorLorry(Boolean heavyMotorLorry) {
        this.heavyMotorLorry = heavyMotorLorry;
    }

    public Boolean getLightMotorCoach() {
        return lightMotorCoach;
    }

    public void setLightMotorCoach(Boolean lightMotorCoach) {
        this.lightMotorCoach = lightMotorCoach;
    }

    public Boolean getMotorCoach() {
        return motorCoach;
    }

    public void setMotorCoach(Boolean motorCoach) {
        this.motorCoach = motorCoach;
    }

    public Boolean getHeavyMotorCoach() {
        return heavyMotorCoach;
    }

    public void setHeavyMotorCoach(Boolean heavyMotorCoach) {
        this.heavyMotorCoach = heavyMotorCoach;
    }

    public Boolean getLandVehicle() {
        return landVehicle;
    }

    public void setLandVehicle(Boolean landVehicle) {
        this.landVehicle = landVehicle;
    }

    public Boolean getMotorizedInvalidCarriage() {
        return motorizedInvalidCarriage;
    }

    public void setMotorizedInvalidCarriage(Boolean motorizedInvalidCarriage) {
        this.motorizedInvalidCarriage = motorizedInvalidCarriage;
    }
}
