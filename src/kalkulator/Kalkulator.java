/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;


/**
 *
 * @author lucky
 */
public class Kalkulator {
    
public double tambah (double num1, double num2){
return num1 + num2;
}

public double kurang (double num1, double num2){
    return num1 - num2;
}

public double kali (double num1, double num2){
    return num1 * num2;
}

public double bagi (double num1, double num2){
    if (num2 !=0) {
    return num1 / num2;
} else {
    System.out.println( "error : pembagian di bagi 0 tidak di perbolehkan");
    return Double.NaN;
        }
    }
}
        
     

