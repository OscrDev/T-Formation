/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.supermarket;

/**
 *
 * @author omarinmo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        
        Products <Milk> product1 = new Products ("COVAC",1);
        Products <Car> product2= new Products("HONDA", 3500);
        
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
}
