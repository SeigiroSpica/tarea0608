/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea0608;

/**
 *
 * @author ale_g
 */
public class Electrodomestico {
    private double precioBase, peso;
    private ColoresDisponibles color;
    private ConsumoEnergetico consumoE;

    public Electrodomestico() {
        precioBase= 100; //Euros
        peso= 5; //kg
        color= ColoresDisponibles.BLANCO;
        consumoE= ConsumoEnergetico.F;
    }
    
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color= ColoresDisponibles.BLANCO;
        consumoE= ConsumoEnergetico.F;
    }

    public Electrodomestico(double precioBase, double peso, ColoresDisponibles color, ConsumoEnergetico consumoE) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = color;
        this.consumoE = consumoE;
    }
    
    private ConsumoEnergetico comprobarConsumoEnergetico(ConsumoEnergetico consumoE){
        return ConsumoEnergetico.F;
    }
    
    private ColoresDisponibles comprobarColor(ColoresDisponibles color){
        return ColoresDisponibles.BLANCO;
    }
    
    public double precioFinal(){
        return 0;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public ColoresDisponibles getColor() {
        return color;
    }

    public void setColor(ColoresDisponibles color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(ConsumoEnergetico consumoE) {
        this.consumoE = consumoE;
    }
    
    
    
}
