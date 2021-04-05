package com.lithium.easyclean.mainPackage.start;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String password;
    private String email;

    public User(){

    }
    public User(String name, String password,  String email){
        this.name = name;
        this.password = password;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}


