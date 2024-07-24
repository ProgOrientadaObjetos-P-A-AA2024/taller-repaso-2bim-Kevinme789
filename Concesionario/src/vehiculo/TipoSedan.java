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
public class TipoSedan extends Vehiculo {

    private double porcentajeDescuento;
    private double valorDescuento;
    private double seguroMecanico;

    public TipoSedan(String m, Comprador p, double pre, double porc) {
        super(m, p, pre);
        porcentajeDescuento = porc;
    }

    public double obtenerPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void establecerPorcentajeDescuento(double p) {
        porcentajeDescuento = p;
    }

    public double obtenerValorDescuento() {
        return valorDescuento;
    }

    public void establecerValorDescuento() {
        valorDescuento = precioBase * (porcentajeDescuento / 100.0);
    }

    public double obtenerSeguroMecanico() {
        return seguroMecanico;
    }

    public void establecerSeguroMecanico() {
        seguroMecanico = precioBase * 0.01;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguroMecanico + valorDescuento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sPorcentaje Descuento: %.0f%%\n"
                + "Valor Descuento: %.2f\nSeguro Mecanico: %.2f\n"
                + "Precio Final: %.2f\n", super.toString(), porcentajeDescuento,
                valorDescuento, seguroMecanico, precioFinal);
        return cadena;
    }

}
