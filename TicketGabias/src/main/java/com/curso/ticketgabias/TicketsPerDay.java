
package com.curso.ticketgabias;

import java.util.HashMap;

/**
 *
 * @author omarinmo
 * @version 0.1
 * 
 */

public class TicketsPerDay {
    //Attributes 
    private int price;
    private String date;
    private int quanty;
    private static final int MAX_PRICE = 4;
    private static final int MAX_QUANTY = 10;
    /**
     * Constructor without parameters
     * 
     */
    public TicketsPerDay() {
        this.price = MAX_PRICE;
    }
    /**
     *  Constructor with parameters
     * @param date : Enter the date of the ticket
     */
    public TicketsPerDay(String date) {
        this.price = MAX_PRICE;
        this.date = date;
        this.quanty = MAX_QUANTY;

    }
    /**
     * Get price of the ticket
     * @return price : Ticket value
     */
    public int getPrice() {
        return price;
    }
    /**
     * Modify price for tickets
     * @param price : Ticket value
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * Get date of the ticket 
     * @return date : Ticket date information string
     */
    public String getDate() {
        return date;
    }
    
   /**
    * Modify information date of the ticket
    * @param date : Ticket date information
    */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * Get quanty of tickets
     * @return quanty : numbers of tickets
     */
    public int getQuanty() {
        return quanty;
    }
    /**
     * Modify quanty of tickets
     * @param quanty : numbers of tickets
     */
    public void setQuanty(int quanty) {
        this.quanty = quanty;
    }

}
