/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.ticketgabias;

import java.util.Scanner;

/**
 *
 * @author omarinmo
 */
public class CLI {
    /**
     * Start method interfaz
     */
    public void start() {
        Scanner soption = new Scanner(System.in);
        Scanner sdate = new Scanner(System.in);
        Scanner squanty = new Scanner(System.in);
        Scanner smoney = new Scanner(System.in);
        
        SellSystem system = new SellSystem();
        system.generateTicket();
        boolean exit = false;
        while (!exit) {
            System.out.println("Welcome to the Users Management\n"
                    + "Press 1 to start       Press 2 to exit");
            int option = soption.nextInt();
            // Check date
            if (option == 1) {

                System.out.println("Introduce Tickets quanty");
                int quanty = squanty.nextInt();
                System.out.println(system.showDate(quanty));
                System.out.println("Choose a date with dd/MM/yyyy: ");
                String date = sdate.nextLine();
                int total = system.totalPrice(quanty);
                System.out.println("The value of your tickets is: "+total);

                //Trycacth para el dinero
                System.out.println("Introduce your money: ");
                int money = smoney.nextInt();
                System.out.println("Calculating your change");
                if (system.changeMoney(money, total) <= 0) {

                    //quita el numero de entradas
                    system.buyTickets(quanty, date);
                }

                //system.CheckDate(numero de entradas) Comprueba si hay entradas en esa fecha
                //Si hay entradas m
            }
            //exit from the program
            if (option == 2) {
                System.out.println("EXIT  ...");
                exit = true;
            }
        }
    }// FIN INTERFAZ

}
