package com.aruna.wcms.citizenSignIn.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class CitizenSignIn {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String IDNumber;

    private String userName;

    private String password;

    @Column(unique = true)
    private String token;
}
