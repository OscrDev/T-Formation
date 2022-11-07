/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.supermarket;

/**
 *
 * @author omarinmo
 */
public class Products <T>{
    
    String name;
    int price;

    public Products(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" + "name=" + name + ", price=" + price + '}';
    }
    
    
    
}
