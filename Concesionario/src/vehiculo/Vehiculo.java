/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import concesionario.Comprador;

/**
 *
 * @author KevinR
 */
public abstract class Vehiculo {

    protected String marca;
    protected Comprador propietario;
    protected double precioFinal;
    protected double precioBase;

    public Vehiculo(String m, Comprador p, double pre) {
        marca = m;
        propietario = p;
        precioBase = pre;
    }

    public abstract void establecerPrecioFinal();

    public double obtenerPrecioFinal() {
        return precioFinal;
    }

    public String obtenerMarca() {
        return marca;
    }

    public void establecerMarca(String m) {
        marca = m;
    }

    public Comprador obtenerPropietario() {
        return propietario;
    }

    public void establecerPropietario(Comprador p) {
        propietario = p;
    }

    public double obtenerPrecioBase() {
        return precioBase;
    }

    public void establecerPrecioBase(double p) {
        precioBase = p;
    }

}
