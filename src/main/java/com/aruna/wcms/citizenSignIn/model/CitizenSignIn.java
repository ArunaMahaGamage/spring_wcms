package com.aruna.wcms.citizenSignIn.model;

import jakarta.persistence.*;

@Entity
public class CitizenSignIn {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String IDNumber;

    private String userID;

    private String password;

    @Column(unique = true)
    private String oauth2Token;

    @Column(unique = true)
    private String refreshToken;
}
