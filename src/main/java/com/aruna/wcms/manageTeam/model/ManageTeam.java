package com.aruna.wcms.manageTeam.model;

import jakarta.persistence.*;

@Entity
public class ManageTeam {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String vehicleId;

    @Column(unique = true)
    private String idNumber;

    private String jobRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }
}
