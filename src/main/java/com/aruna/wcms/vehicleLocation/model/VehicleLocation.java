package com.aruna.wcms.vehicleLocation.model;

import jakarta.persistence.*;

@Entity
public class VehicleLocation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(unique = true)
    private Integer vehicleId;

    private Double lat;

    private Double lon;
}
