/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.curso.fibonacci;

import java.util.Scanner;

/**
 *
 * @author omarinmo
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Fibonacci!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Add a number");
        int consoleNumber = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        int nextNumero;
        System.out.println("The serial are : ");
        for (int i = 0; i < consoleNumber; i++) {
            if (i <= n2) {
                nextNumero = i;

            } else {
                nextNumero = n1 + n2;
                n1 = n2;
                n2 = nextNumero;
            }
            System.out.println(nextNumero);
        }

    }
}
