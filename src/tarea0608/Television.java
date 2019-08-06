package tarea0608;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ale_g
 */
public class Television extends Electrodomestico{
    private int resolucion;//pulgadas
    private boolean sintonizadorTDT;

    public Television() {
        super();
        resolucion=20;
        sintonizadorTDT=false;
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
        resolucion=20;
        sintonizadorTDT=false;
    }

    public Television(int resolucion, boolean sintonizadorTDT, double precioBase, double peso, ColoresDisponibles color, ConsumoEnergetico consumoE) {
        super(precioBase, peso, color, consumoE);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    
    @Override
    public double precioFinal(){
        if (isSintonizadorTDT() && getResolucion()>40){
            return super.precioFinal()+50+porcentajeRecargoPulgadas();
        } else {
            if(getResolucion()>40){
                return super.precioFinal()+porcentajeRecargoPulgadas();
            } else {
                return super.precioFinal();
            }
        }
    }
    
    private double porcentajeRecargoPulgadas(){
        return (super.precioFinal()*30)/100;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    
    
}
