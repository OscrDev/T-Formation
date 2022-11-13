package com.curso.usermanage;

import java.util.ArrayDeque;
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
    /**
     * 
     * Matrix that grows and allows you to add or remove element
     */
    ArrayDeque<Message> mailBox = new ArrayDeque<>();
    /**
     * Method for add messages to mailbox
     * @param m 
     */
    public void addMessage(Message m) {
        mailBox.add(m);
    }
/**
 * 
 * @return last message 
 */
    public String readLastMessage() {
        //Lo primero que tengo que hacer es un poll a mailbox
        //string = mensage.tostring
        
        String result= mailBox.pollFirst().toString();
        
        return result;
    }

    public Users() {
    }
    /**
     * Contructor with parameters
     * 
     * @param name to user create
     * @param email to user create
     * @param password to user create
     */
    public Users(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    //Getters and Setters
    /**
     * 
     * @return Login question
     */
    public String getQuestion() {
        return question;
    }
    /**
     * 
     * @param Modify question 
     */
    public void setQuestion(String question) {
        this.question = question;
    }
    /**
     * 
     * @return Login answer 
     */
    public String getAsnwer() {
        return asnwer;
    }
    /**
     * Modify answer for question
     * @param asnwer 
     */
    public void setAsnwer(String asnwer) {
        this.asnwer = asnwer;
    }
    /**
     * 
     * @return name user
     */
    public String getName() {
        return name;
    }
    /**
     * 
     * @param Modify name user
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * 
     * @return email user
     */
    public String getEmail() {
        return email;
    }
    /**
     * 
     * @param Modify email to user
     */
    public void setEmail(String email) {
        this.email = email;
    }
    /**
     * 
     * @return Password to user
     */
    public String getPassword() {
        return password;
    }
    /**
     * 
     * @param Modify password to user
     */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
     * 
     * @param obj
     * @return boolean to equals
     */
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
