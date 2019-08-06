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
    private PesoPrecio pesoRango;

    public Electrodomestico() {
        precioBase= 100; //Euros
        peso= 5; //kg
        pesoRango=PesoPrecio.S;
        color= ColoresDisponibles.BLANCO;
        consumoE= ConsumoEnergetico.F;
    }
    
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        pesoRango= darRangoPeso(peso);
        color= ColoresDisponibles.BLANCO;
        consumoE= ConsumoEnergetico.F;
    }

    public Electrodomestico(double precioBase, double peso, ColoresDisponibles color, ConsumoEnergetico consumoE) {
        this.precioBase = precioBase;
        this.peso = peso;
        pesoRango= darRangoPeso(peso);
        this.color = comprobarColor(color);
        this.consumoE = comprobarConsumoEnergetico(consumoE);
    }
    
    private PesoPrecio darRangoPeso(double peso){
        if (peso>=80){
            return PesoPrecio.XL;
        } else {
            if (peso>=50){
                return PesoPrecio.L;
            } else {
                if (peso>=20){
                    return PesoPrecio.M;
                } else {
                    return PesoPrecio.S;
                }
            }
        }
    }
    private ConsumoEnergetico comprobarConsumoEnergetico(ConsumoEnergetico consumoE){
        for (ConsumoEnergetico i: ConsumoEnergetico.values()){
            if (i==consumoE){
                return consumoE;
            }
        }
        return ConsumoEnergetico.F;
    }
    
    private ColoresDisponibles comprobarColor(ColoresDisponibles color){
        for (ColoresDisponibles i: ColoresDisponibles.values()){
            if (i==color){
                return color;
            }
        }
        return ColoresDisponibles.BLANCO;
    }
    
    public double precioFinal(){
        return precioBase+consumoE.getPrecio()+pesoRango.getPrecio();
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
