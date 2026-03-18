package com.aruna.wcms.administratorSignIn.model;

import jakarta.persistence.*;

@Entity
public class AdministratorSignIn {

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOauth2Token() {
        return oauth2Token;
    }

    public void setOauth2Token(String oauth2Token) {
        this.oauth2Token = oauth2Token;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
