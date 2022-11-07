/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.curso.laberintoprueba;

import java.util.ArrayDeque;

/**
 *
 * @author omarinmo
 */
public class Main {

    public static void main(String[] args) throws Exception{
        
        ArrayDeque<Position> path= new ArrayDeque<>();
        Laberinto lab = new Laberinto ();
        path= lab.buscarFinal();
        lab.imprimirLaberinto();
    }
}
