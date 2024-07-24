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
public class TipoCamioneta extends Vehiculo {

    private double porcentajeAdicionalFijo;
    private double valorImportacion;
    private double seguroMantenimiento;

    public TipoCamioneta(String m, Comprador p, double pre, double porc) {
        super(m, p, pre);
        porcentajeAdicionalFijo = porc;
    }

    public double obtenerPorcentajeAdicionalFijo() {
        return porcentajeAdicionalFijo;
    }

    public void establecerPorcentajeAdicionalFijo(double p) {
        porcentajeAdicionalFijo = p;
    }

    public double obtenerValorImportacion() {
        return valorImportacion;
    }

    public void establecerValorImportacion() {
        valorImportacion = precioBase * (porcentajeAdicionalFijo / 100);
    }

    public double obtenerSeguroMantenimiento() {
        return seguroMantenimiento;
    }

    public void establecerSeguroMantenimiento() {
        seguroMantenimiento = valorImportacion * 1.5;
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + valorImportacion + seguroMantenimiento;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sPorcentaje Adicional Importacion: "
                + "%.0f%%\n"
                + "Valor Importacion: %.2f\nSeguro Mantenimiento: %.2f\n"
                + "Precio Final: %.2f\n", super.toString(), porcentajeAdicionalFijo,
                valorImportacion, seguroMantenimiento,precioFinal);
        return cadena;
    }

}
