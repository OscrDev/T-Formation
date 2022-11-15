/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ticketgabias;

import java.util.ArrayList;

/**
 *
 * @author omarinmo
 */
public class SellSystem {

    TicketsPerDay ticketsperday;
    ArrayList<TicketsPerDay> tickets;
    /**
     * Constructor without parameters
     */
    public SellSystem() {
        this.ticketsperday=new TicketsPerDay();
        this.tickets = new ArrayList();
    }
    /**
     * Method Generator tickets
     */
    public void generateTicket() {

        TicketsPerDay ticket1 = new TicketsPerDay("01-01-2022");
        TicketsPerDay ticket2 = new TicketsPerDay("02-01-2022");
        TicketsPerDay ticket3 = new TicketsPerDay("03-01-2022");
        TicketsPerDay ticket4 = new TicketsPerDay("04-01-2022");
        TicketsPerDay ticket5 = new TicketsPerDay("05-01-2022");
        TicketsPerDay ticket6 = new TicketsPerDay("06-01-2022");
        TicketsPerDay ticket7 = new TicketsPerDay("07-01-2022");
        TicketsPerDay ticket8 = new TicketsPerDay("08-01-2022");
        TicketsPerDay ticket9 = new TicketsPerDay("09-01-2022");
        TicketsPerDay ticket10 = new TicketsPerDay("10-01-2022");
        TicketsPerDay ticket11 = new TicketsPerDay("11-01-2022");
        TicketsPerDay ticket12 = new TicketsPerDay("12-01-2022");
        TicketsPerDay ticket13 = new TicketsPerDay("13-01-2022");
        TicketsPerDay ticket14 = new TicketsPerDay("14-01-2022");
        tickets.add(ticket1);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);
        tickets.add(ticket5);
        tickets.add(ticket6);
        tickets.add(ticket7);
        tickets.add(ticket8);
        tickets.add(ticket9);
        tickets.add(ticket10);
        tickets.add(ticket11);
        tickets.add(ticket12);
    }

    //Se introduce el nº deseado de entradas y entonces muestra todas las fechas >= a ese numero de fechas
    /**
     * 
     * @param quanty
     * @return ArrayList date tipe String
     */
    public ArrayList<String> showDate(int quanty) {
        ArrayList<String> tickets_perday = new ArrayList();
        try {
            for (TicketsPerDay ticket : tickets) {

                if (ticket.getQuanty() >= quanty) {
                    tickets_perday.add(ticket.getDate());

                }

            }
        } catch (Exception e) {
            System.out.println("We dont have dates for this quanty");
        }

        return tickets_perday;

    }
/**
 * 
 * @param  quanty : number of tickets
 * @param  date : Information of tickets
 */
    public void buyTickets(int quanty, String date) {
        //TODO
        for (TicketsPerDay ticket : tickets) {
            if (ticket.getQuanty() >= quanty && date.equals(ticket.getDate())) {

                int new_quanty = ticket.getQuanty() - quanty;
                ticket.setQuanty(new_quanty);
            }
        }

    }
    /**
     * 
     * @param quanty : number of tickets
     * @return int
     */
    public int totalPrice(int quanty) {
        
        return quanty * this.ticketsperday.getPrice();

    }
    /**
     * Change money
     * @param money : User introduce money
     * @param total : Total change money
     * @return int change 
     */
    public int changeMoney(int money, int total) {
        int change = -1;
        try {
            if (money >= total) {
                change = total - money;

            }

        } catch (Exception e) {
            System.out.println("The money is insufficient");

        }
        return change;
    }
}
