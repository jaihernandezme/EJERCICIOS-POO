/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio5;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO5 {

    public static void main(String[] args) {
        double radio, area, circunferencia;
        
        radio= 23;
        area= Math.PI* Math.pow(radio, 2);
        circunferencia = 2*Math.PI*radio;
        
        System.out.println("El radio del circulo es: " + radio);
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia del circulo es: " + circunferencia);
                
    }
}
