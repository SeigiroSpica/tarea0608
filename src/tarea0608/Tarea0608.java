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
        Scanner teclado = new Scanner(System.in);
        ArrayList<Electrodomestico> electrodomestico = new ArrayList<>();
        int opcion = 0;
        String datoGuardado;
        Electrodomestico item;
        while (opcion < 4) {
            System.out.println("   MENU PRINCIPAL");
            System.out.println("1- Añadir TV.");
            System.out.println("2- Añadir Lavadora.");
            System.out.println("3- Añadir Otro Elctrodomestico.");
            System.out.println("4- Mostrar Precio Final de todos los aticulos.");
            System.out.print("\nOpción: ");
            opcion = Integer.parseInt(teclado.nextLine());
            switch (opcion) {
                case 1: {
                    double precio, peso;
                    ColoresDisponibles color;
                    ConsumoEnergetico consumoE;
                    int resolucion;
                    boolean TDT;
                    System.out.println("\n\n   Añadir TV:");
                    System.out.print("Ingrese el precio(Euros): ");
                    precio = Double.parseDouble(teclado.nextLine());
                    System.out.print("Ingrese el peso(kg): ");
                    peso = Double.parseDouble(teclado.nextLine());
                    System.out.print("Ingrese el color(Blanco, Negro, Rojo, Azul, Gris): ");
                    datoGuardado = teclado.nextLine().toUpperCase();
                    color=Enum.valueOf(ColoresDisponibles.class, datoGuardado);
                    System.out.print("Ingrese el Consumo Energetico(A-F): ");
                    datoGuardado = teclado.nextLine().toUpperCase();
                    consumoE= Enum.valueOf(ConsumoEnergetico.class, datoGuardado);
                    System.out.print("Ingrese la resolucion(en pulgadas): ");
                    resolucion = Integer.parseInt(teclado.nextLine());
                    System.out.print("sintonizador TDT(Si/No): ");
                    datoGuardado= teclado.nextLine().toUpperCase();
                    TDT = datoGuardado.equals("SI");
                    item= new Television(resolucion, TDT, precio, peso, color, consumoE);
                    electrodomestico.add(item);
                    System.out.println("\nNuevo TV añadido.\n\nPresione Enter para continuar...");
                    teclado.nextLine();
                } break;
                case 2: {
                    double precio, peso, tambor;
                    ColoresDisponibles color;
                    ConsumoEnergetico consumoE;
                    System.out.println("\n\n   Añadir Lavadora:");
                    System.out.print("Ingrese el precio(Euros): ");
                    precio = Double.parseDouble(teclado.nextLine());
                    System.out.print("Ingrese el peso(kg): ");
                    peso = Double.parseDouble(teclado.nextLine());
                    System.out.print("Ingrese el color(Blanco, Negro, Rojo, Azul, Gris): ");
                    datoGuardado = teclado.nextLine().toUpperCase();
                    color=Enum.valueOf(ColoresDisponibles.class, datoGuardado);
                    System.out.print("Ingrese el Consumo Energetico(A-F): ");
                    datoGuardado = teclado.nextLine().toUpperCase();
                    consumoE= Enum.valueOf(ConsumoEnergetico.class, datoGuardado);
                    System.out.print("Ingrese la tamaño de tambor (kg): ");
                    tambor = Double.parseDouble(teclado.nextLine());
                    item= new Lavadora(tambor, precio, peso, color, consumoE);
                    electrodomestico.add(item);
                    System.out.println("\nNueva Lavadora añadida.\n\nPresione Enter para continuar...");
                    teclado.nextLine();
                } break;
                case 3: {
                    double precio, peso, tambor;
                    ColoresDisponibles color;
                    ConsumoEnergetico consumoE;
                    System.out.println("\n\n   Añadir Electrodomestico:");
                    System.out.print("Ingrese el precio(Euros): ");
                    precio = Double.parseDouble(teclado.nextLine());
                    System.out.print("Ingrese el peso(kg): ");
                    peso = Double.parseDouble(teclado.nextLine());
                    System.out.print("Ingrese el color(Blanco, Negro, Rojo, Azul, Gris): ");
                    datoGuardado = teclado.nextLine().toUpperCase();
                    color=Enum.valueOf(ColoresDisponibles.class, datoGuardado);
                    System.out.print("Ingrese el Consumo Energetico(A-F): ");
                    datoGuardado = teclado.nextLine().toUpperCase();
                    consumoE= Enum.valueOf(ConsumoEnergetico.class, datoGuardado);
                    item= new Electrodomestico(precio, peso, color, consumoE);
                    electrodomestico.add(item);
                    System.out.println("\nNuevo Electrodomestico Añadido.\n\nPresione Enter para continuar...");
                    teclado.nextLine();
                } break;
                case 4: {
                    for (int i=0;i<electrodomestico.size();i++){
                        System.out.println(electrodomestico.get(i).precioFinal());

                    }
                } break;
            }
        }
    }

}

