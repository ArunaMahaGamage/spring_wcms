package com.aruna.wcms.administrator.model;

import jakarta.persistence.*;

@Entity
public class Administrator {
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

    private String mobileNumber;
}
