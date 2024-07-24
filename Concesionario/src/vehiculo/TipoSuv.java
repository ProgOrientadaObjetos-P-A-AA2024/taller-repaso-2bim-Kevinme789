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
public class TipoSuv extends Vehiculo {

    private double porcentajePersonas;
    private double seguroPersonas;

    public TipoSuv(String m, Comprador p, double pre, double porc) {
        super(m, p, pre);
        porcentajePersonas = porc;
    }

    public double obtenerPorcentajePersonas() {
        return porcentajePersonas;
    }

    public void establecerPorcentajePersonas(double p) {
        porcentajePersonas = p;
    }

    public double obtenerSeguroPersonas() {
        return seguroPersonas;
    }

    public void establecerSeguroPersonas() {
        seguroPersonas = precioBase * (porcentajePersonas / 100.0);
    }

    @Override
    public void establecerPrecioFinal() {
        precioFinal = precioBase + seguroPersonas;
    }

    @Override
    public String toString() {
        String cadena = String.format("%sPorcentaje Adicional de Personas: "
                + "%.0f%%\n"
                + "Seguro de Personas: %.2f\n"
                + "Precio Final: %.2f\n", super.toString(), porcentajePersonas,
                seguroPersonas, precioFinal);
        return cadena;
    }

}
