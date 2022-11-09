/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.usermanage;

import java.util.Objects;

/**
 *
 * @author omarinmo
 */
public class Users {
    private String name;
    private String email;
    private String password;
    private String question;
    private String asnwer;

    public Users() {
    }

    
    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    //Getters and Setters

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAsnwer() {
        return asnwer;
    }

    public void setAsnwer(String asnwer) {
        this.asnwer = asnwer;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Users other = (Users) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }
    
    
    @Override
    public String toString() {
        return "User{" + "name=" + name + ", email=" + email + ", password=" + password + '}';
    }
}
