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
public enum ConsumoEnergetico {
    A(100), B(80), C(60), D(50), E(30), F(10);
    
    private double precio;
    
    private ConsumoEnergetico(double precio){
        this.precio=precio;
    }

    public double getPrecio() {
        return precio;
    }
}
