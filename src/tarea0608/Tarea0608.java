/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea0608;

import java.util.Scanner;

/**
 *
 * @author ale_g
 */
public class Tarea0608 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        String dato;
        ConsumoEnergetico consumoE;
        System.out.println("Ingrese un consumo: ");
        dato=teclado.next().toUpperCase();
        consumoE= Enum.valueOf(ConsumoEnergetico.class, dato);
        
        System.out.println("El consumo es: "+ConsumoEnergetico.values());
    }
    
}
