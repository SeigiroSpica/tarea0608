/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea0608;

import java.util.ArrayList;
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
        String datoIngresado;
        ArrayList<Electrodomestico> electrodomestico=new ArrayList<>();
        Lavadora lavadora;
        Television television;
        Electrodomestico electro1;
        television= new Television();
        electro1= new Electrodomestico();
        lavadora= new Lavadora();
        electrodomestico.add(electro1);
        electrodomestico.add(television);
        electrodomestico.add(lavadora);
        electro1= new Lavadora();
        electrodomestico.add(electro1);
        for (int i=0;i<electrodomestico.size();i++){
            System.out.println(electrodomestico.get(i).precioFinal());
        }
    }
    
}
