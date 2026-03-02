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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getComplainIDNumber() {
        return complainIDNumber;
    }

    public void setComplainIDNumber(String complainIDNumber) {
        this.complainIDNumber = complainIDNumber;
    }

    public String getCitizenIDNumber() {
        return citizenIDNumber;
    }

    public void setCitizenIDNumber(String citizenIDNumber) {
        this.citizenIDNumber = citizenIDNumber;
    }

    public String getComplainTitle() {
        return complainTitle;
    }

    public void setComplainTitle(String complainTitle) {
        this.complainTitle = complainTitle;
    }

    public String getComplain() {
        return complain;
    }

    public void setComplain(String complain) {
        this.complain = complain;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
