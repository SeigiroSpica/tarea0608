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
public class Lavadora extends Electrodomestico{
    private double tambor;
    private static final double TAMBORBASE=5;//kg

    public Lavadora() {
        super();
        tambor=TAMBORBASE;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        tambor=TAMBORBASE;
    }

    public Lavadora(double tambor, double precioBase, double peso, ColoresDisponibles color, ConsumoEnergetico consumoE) {
        super(precioBase, peso, color, consumoE);
        this.tambor = tambor;
    }
    
    @Override
    public double precioFinal(){
        if (tambor<30){
            return super.precioFinal();
        } else {
            return super.precioFinal()+50;
        }
    }

    public double getTambor() {
        return tambor;
    }
    
}
