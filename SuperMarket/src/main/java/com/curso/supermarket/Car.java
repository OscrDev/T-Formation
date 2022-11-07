/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.supermarket;


/**
 *
 * @author omarinmo
 */
public class Car { 
    
    int wheels= 4;
    String color;

    public Car(String color,int wheels) {
        this.color = color;
        this.wheels= wheels;
    }

    public int getRuedas() {
        return wheels;
    }

    public void setRuedas(int wheels) {
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
