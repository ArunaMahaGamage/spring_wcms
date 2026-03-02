package com.aruna.wcms.submitComplain.model;

import jakarta.persistence.*;

@Entity
public class Complain {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String complainIDNumber;

    private String citizenIDNumber;

    private String complainTitle;

    private String complain;

    private String status;
}
