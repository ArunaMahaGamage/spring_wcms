package com.aruna.wcms.administrator.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Administrator {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;


}
