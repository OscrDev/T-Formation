/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.calculator;

/**
 *
 * @author omarinmo
 */
public class CientificCalculator extends Calculator {

    private double factorial(int number1) {
        double result = 1;
        for (int i = 1; i < number1; i++) {
            result += i * result;

        }
        return result;

    }

    private double pow(int number1, int number2) {

        return Math.pow(number1, number2);
    }

    public double operator(int number1, char operator, int number2) throws Exception {
        double result = 0;
        switch (operator) {

            case '!':
                result = factorial(number1);

                break;
            case '^':
                result = pow(number1, number2);
                break;
                
            default:
                super.operator(number1, operator, number2);
        }
        return result;
    }
}
