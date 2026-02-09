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
    private String IDNumber;

    private String dateOfBirth;

    private String gender;

    private String address;

    private String email;

    private String mobileNumber;

    private String positon;

    private String department;

    private String employeeNumber;

    private String provincial;

    private String district;

    private String divisionalSecretaryDivisions;
}
