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
        while (opcion < 6) {
            try {

                System.out.println("   MENU PRINCIPAL");
                System.out.println("1- Añadir TV.");
                System.out.println("2- Añadir Lavadora.");
                System.out.println("3- Añadir Otro Elctrodomestico.");
                System.out.println("4- Mostrar Precio de venta de cada articulo.");
                System.out.println("5- Mostrar valor total de todos los aticulos.");
                System.out.println("6- Salir.");
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
                        color = Enum.valueOf(ColoresDisponibles.class, datoGuardado);
                        System.out.print("Ingrese el Consumo Energetico(A-F): ");
                        datoGuardado = teclado.nextLine().toUpperCase();
                        consumoE = Enum.valueOf(ConsumoEnergetico.class, datoGuardado);
                        System.out.print("Ingrese la resolucion(en pulgadas): ");
                        resolucion = Integer.parseInt(teclado.nextLine());
                        System.out.print("sintonizador TDT(Si/No): ");
                        datoGuardado = teclado.nextLine().toUpperCase();
                        TDT = datoGuardado.equals("SI");
                        item = new Television(resolucion, TDT, precio, peso, color, consumoE);
                        electrodomestico.add(item);
                        System.out.println("\nNuevo TV añadido.\n\nPresione Enter para continuar...");
                        teclado.nextLine();
                    }
                    break;
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
                        color = Enum.valueOf(ColoresDisponibles.class, datoGuardado);
                        System.out.print("Ingrese el Consumo Energetico(A-F): ");
                        datoGuardado = teclado.nextLine().toUpperCase();
                        consumoE = Enum.valueOf(ConsumoEnergetico.class, datoGuardado);
                        System.out.print("Ingrese la tamaño de tambor (kg): ");
                        tambor = Double.parseDouble(teclado.nextLine());
                        item = new Lavadora(tambor, precio, peso, color, consumoE);
                        electrodomestico.add(item);
                        System.out.println("\nNueva Lavadora añadida.\n\nPresione Enter para continuar...");
                        teclado.nextLine();
                    }
                    break;
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
                        color = Enum.valueOf(ColoresDisponibles.class, datoGuardado);
                        System.out.print("Ingrese el Consumo Energetico(A-F): ");
                        datoGuardado = teclado.nextLine().toUpperCase();
                        consumoE = Enum.valueOf(ConsumoEnergetico.class, datoGuardado);
                        item = new Electrodomestico(precio, peso, color, consumoE);
                        electrodomestico.add(item);
                        System.out.println("\nNuevo Electrodomestico Añadido.\n\nPresione Enter para continuar...");
                        teclado.nextLine();
                    }
                    break;
                    case 4: {
                        System.out.println("\n\n");
                        for (int i = 0; i < electrodomestico.size(); i++) {
                            if (electrodomestico.get(i) instanceof Television) {
                                System.out.println("TV €" + electrodomestico.get(i).precioFinal());
                            } else {
                                if (electrodomestico.get(i) instanceof Lavadora) {
                                    System.out.println("Lavadora €" + electrodomestico.get(i).precioFinal());
                                } else {
                                    System.out.println("Electrodomestico X €" + electrodomestico.get(i).precioFinal());
                                }
                            }
                        }
                        System.out.println("\n\nPresione Enter para continuar...");
                        teclado.nextLine();
                    }
                    break;
                    case 5: {
                        int totalLavadoras = 0,
                                totalTV = 0,
                                totalElectrodomesticos = 0;
                        for (int i = 0; i < electrodomestico.size(); i++) {
                            if (electrodomestico.get(i) instanceof Television) {
                                totalTV += electrodomestico.get(i).precioFinal();
                            } else {
                                if (electrodomestico.get(i) instanceof Lavadora) {
                                    totalLavadoras += electrodomestico.get(i).precioFinal();
                                } else {
                                    totalElectrodomesticos += electrodomestico.get(i).precioFinal();
                                }
                            }
                        }
                        System.out.println("\n\nValor total de TV: €" + totalTV + ".");
                        System.out.println("Valor total de Lavadoras: €" + totalLavadoras + ".");
                        System.out.println("Valor total de Electrodomesticos: €" + totalElectrodomesticos + ".");
                        System.out.println("\n\nPresione Enter para continuar...");
                        teclado.nextLine();
                    }
                    break;
                    case 6:
                        break;
                    default: {
                        opcion = 0;
                        System.out.println("\n\nOpción no valida.");
                        System.out.println("\n\nPresione Enter para volver al menu...");
                        teclado.nextLine();
                    }
                    break;
                }
            } catch (Exception e) {
                System.out.println("\nDato ingresado fuera del rango esperado.\n\nPresione Enter para volver al Menu...");
                teclado.nextLine();
                opcion = 0;
            }
        }
    }

}
