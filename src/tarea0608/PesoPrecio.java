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
public enum PesoPrecio {
    S(10), M(50), L(80), XL(100);
    
    private double precio;
    
    private PesoPrecio(double precio){
        this.precio= precio;
    }

    public double getPrecio() {
        return precio;
    }
    
}
