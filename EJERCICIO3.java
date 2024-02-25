/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio3;

/**
 *
 * @author USUARIO
 */
public class EJERCICIO3 {

    public static void main(String[] args) {
        double htrabajadas, preciohora, pretencion, salbruto, salneto, Tretencion ;
        
        pretencion = 0.125;
        preciohora = 5000;
        htrabajadas = 48;
        salbruto = htrabajadas*preciohora;
        Tretencion = salbruto*pretencion;
        salneto = salbruto - (Tretencion);
        System.out.println("El salario bruto del trabajador es: $" + salbruto);
        System.out.println("El total de retención en la fuente es: $" + Tretencion);
        System.out.println("El salario neto del trabajador es: $" + salneto);
        
                
    }
}
