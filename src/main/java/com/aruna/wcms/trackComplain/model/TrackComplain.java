package com.aruna.wcms.trackComplain.model;

import jakarta.persistence.*;

@Entity
public class TrackComplain {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private String complainIDNumber;

    private String citizenIDNumber;

    private String adminIDNumber;

    private String solution;

    private String status;

    private String citizenFeedback;
}
