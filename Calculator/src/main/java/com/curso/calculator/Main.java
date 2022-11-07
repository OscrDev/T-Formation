/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.calculator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omarinmo
 */
public class Main {

    public static void main(String[] args) {

        Calculator calculator = new  Calculator();
        try { 
            System.out.println("Operating in Calculator");
            System.out.println(calculator.operator(50, '-', 20));
        } catch (Exception ex) {
            System.out.println("Error, message " + ex);
        }
        
        CientificCalculator cientificCalculator= new CientificCalculator();
        
        try {
            System.out.println("Operating in CientificCalculator: ");
            System.out.println(cientificCalculator.operator(10, '!', 0));
            System.out.println(cientificCalculator.operator(2, '^', 5));
        } catch (Exception ex) {
            Logger.getLogger("Error, message "+ ex);
        }
    }
}
