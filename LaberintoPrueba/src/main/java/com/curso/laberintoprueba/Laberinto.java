/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.laberintoprueba;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author omarinmo
 */
public class Laberinto {

    protected char[][] laberinto; //Matriz para almacenar caracteres
    protected int filas; // variable para recorrer archivo
    protected int columnas; //variable para recorrer archivo
    protected ArrayDeque<Position> path; //array de pila con objeto Posicion
    protected Position posicionActual, posicionFinal;//posiciones

    public Laberinto() {
        try {
            File miArchivo = new File("C:\\Users\\omarinmo\\Desktop\\pruebaCursoGit\\lab.txt");//Leemos la ruta del archivo
            filas = 0;
            Scanner miLeer = new Scanner(miArchivo);//objeto scanner para leer archivo
            path = new ArrayDeque<>();
            posicionActual = new Position();
            posicionFinal = new Position();

            laberinto = new char[50][50]; //asignamos cantidad al array
            while (miLeer.hasNextLine()) { //miLeer ¿ tiene siguiente linea?

                String linea = miLeer.nextLine(); //Creamos una variable linea y pasamos a siguiente linea
                columnas = linea.length();//igualamos columans con la longitud de linea
                for (int i = 0; i < linea.length(); i++) {// Creamos blucle para recorrer la longitud de linea

                    laberinto[filas][i] = linea.charAt(i);//Metemos dentro de laberiton los caracteres recorridos de archivos y de i
                    if (linea.charAt(i) == 'E') {//Condicion si linea de i contiene E es el principio

                        posicionActual.set(filas, i);//actualizamos posicion

                    }
                    if (linea.charAt(i) == 'S') //Condicion si linea de i es "S" es el final

                        posicionFinal.set(filas, i);//Actualizamos posicion final

                    }
                    ++filas;//incrementamos la variable archivos para que recorra como el bucle
                }              
            
            miLeer.close();//Cerramos el proceso de lectura del archivo.
        } catch (FileNotFoundException ex) {
            System.out.println("An error occurred");
            ex.printStackTrace();
        }
        
    }

    public void mover(Position p) {// Creamos un metodo para mover la posicion

        int posicionX = p.getX();
        int posicionY = p.getY();
        /**
         * Le decimos a laberinto con posicionX e Y que cambie por un punto la
         * posicion actual.
         */
        laberinto[posicionX][posicionY] = '.';
        posicionActual.set(posicionX, posicionY);

    }

    public ArrayDeque<Position> buscarFinal() {

        
        while (posicionActual.getX() != posicionFinal.getX() && posicionActual.getY() != posicionFinal.getY()) {
            Position moverA = new Position(posicionActual.getX(), posicionActual.getY());
            /**
             * Condicion, si laberinto puede sumar uno a la posicion x
             * actualizamos posicion x y avanzaria una posicion hacia abajo
             */
            if (laberinto[posicionActual.getX() + 1][posicionActual.getY()] == ' ') {
                moverA.set(posicionActual.getX() + 1, posicionActual.getY());
                /**
                 * Si laberinto puede restar 1 a Y quiere decir que puede girar
                 * hacia la derecha
                 */
            } else if (laberinto[posicionActual.getX()][posicionActual.getY() - 1] == ' ') {
                moverA.set(posicionActual.getX(), posicionActual.getY() - 1);
                /**
                 * Si laberinto resta 1 a X subimos una casilla (restamos -1 a X
                 * para retroceder)
                 */
            } else if (laberinto[posicionActual.getX() - 1][posicionActual.getY()] == ' ') {
                moverA.set(posicionActual.getX() - 1, posicionActual.getY());
                /**
                 * Entonces Y suma +1 giramos a la izquierda
                 */
            } else {
                moverA.set(posicionActual.getX(), posicionActual.getY() + 1);
            }
            mover(moverA);
            path.push(moverA);
            System.out.println(moverA);
            
        }
        return path;
    }
    /**
     * Metodo para imprimir laberinto
     * con for dentro de for
     * para recorrer filas y columnas
     */
    public void imprimirLaberinto(){
        for (int i = 0; i < filas; i++) {
            
            for (int j = 0; j < columnas; j++) {
                
                System.out.print(laberinto[i][j]);/**
                                                    * Me imprimia separado el mapa 
                                                    * por usar println en vez de print
                                                    */
            }
            System.out.print("\n");
        }
        System.out.println("\n");
    }
//Getter de posicion actual y final
    public Position getPosicionActual() {
        return posicionActual;
    }

    public Position getPosicionFinal() {
        return posicionFinal;
    }
    
}
