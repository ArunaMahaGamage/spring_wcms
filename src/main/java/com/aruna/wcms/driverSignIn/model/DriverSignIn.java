package com.aruna.wcms.driverSignIn.model;

import jakarta.persistence.*;

@Entity
public class DriverSignIn {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String driverLicenceNumber;

    private String userID;

    private String password;
}
