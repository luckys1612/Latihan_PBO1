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
public class Main {
    public static void main (String[]args){
        Kalkulator kalkulator = new Kalkulator();

double num1 =51.0;
double num2 = 0;

System.out.println("Hasil Penjumlahan: "+ kalkulator.tambah(num1,num2));
System.out.println("Hasil Pengurangan: "+ kalkulator.kurang(num1,num2));
System.out.println("Hasil Perkalian: "+ kalkulator.kali(num1,num2));
System.out.println("Hasil Pembagian: "+ kalkulator.bagi(num1,num2));

Kalkulator kalkulator2 = new Kalkulator();
    }
   
}
