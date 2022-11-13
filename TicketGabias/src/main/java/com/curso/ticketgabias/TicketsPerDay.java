/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ticketgabias;

import java.util.HashMap;

/**
 *
 * @author omarinmo
 */
public class TicketsPerDay {

    private int price;
    private String date;
    private int quanty;
    private static final int MAX_PRICE = 4;
    private static final int MAX_QUANTY = 10;
    /**
     * Constructor without parameters
     */
    public TicketsPerDay() {
        this.price = MAX_PRICE;
    }
    /**
     *  Constructor with parameters
     * @param date 
     */
    public TicketsPerDay(String date) {
        this.price = MAX_PRICE;
        this.date = date;
        this.quanty = MAX_QUANTY;

    }
    /**
     * 
     * @return price 
     */
    public int getPrice() {
        return price;
    }
    /**
     * Modify price for tickets
     * @param price 
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * 
     * @return date
     */
    public String getDate() {
        return date;
    }
    /**
     * Modify date
     * @param date 
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * 
     * @return quanty ticketsPerDay
     */
    public int getQuanty() {
        return quanty;
    }
    /**
     * 
     * @param Modify quanty 
     */
    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

}
