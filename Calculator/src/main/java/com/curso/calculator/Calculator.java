/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculator;

/**
 *
 * @author omarinmo
 */
public class Calculator {

    private int number1;
    private int number2;
    private char operator;

    public Calculator() {
    }
//Methods

    private double add(int number1, int number2) {
        number1 += number2;
        return number1;
    }

    private double substract(int number1, int number2) {
        return number1 - number2;
    }

    private double multiply(int number1, int number2) {
        return number1 * number2;

    }

    private double division(int number1, int number2) throws Exception {
        if (number2 == 0) {
            throw new Exception("Error, number = 0");
        }

        return number1 / number2;

    }

    public double operator(int number1, char operator, int number2) throws Exception {
        double result = 0;
        switch (operator) {

            case '+':
                result = add(number1, number2);

                break;
            case '-':
                result = substract(number1, number2);
                break;
            case '*':
                result = multiply(number1, number2);
                break;
            case '/':
                result = division(number1, number2);
                break;
        }
        return result;
    }
}
