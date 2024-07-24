/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concesionario;

import java.util.ArrayList;
import vehiculo.Vehiculo;

/**
 *
 * @author KevinR
 */
public class Concesionario {

    ArrayList<Vehiculo> vehiculos;
    String nombreConcesionaria;
    double ventaTotal;
    double vehiculoCaro;
    double vehiculoBarato;

    public Concesionario(ArrayList<Vehiculo> v, String n) {
        vehiculos = v;
        nombreConcesionaria = n;
    }

    public ArrayList<Vehiculo> obtenerVehiculos() {
        return vehiculos;
    }

    public void establecerVehiculos(ArrayList<Vehiculo> v) {
        vehiculos = v;
    }

    public String obtenerNombreConcesionaria() {
        return nombreConcesionaria;
    }

    public void establecerNombreConcesionaria(String n) {
        nombreConcesionaria = n;
    }

    public double obtenerVentaTotal() {

        return ventaTotal;
    }

    public void establecerVentaTotal() {
        ventaTotal = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            ventaTotal = ventaTotal + vehiculos.get(i).obtenerPrecioFinal();
        }
    }

    public double obtenerVehiculoCaro() {
        return vehiculoCaro;
    }

    public void establecerVehiculoCaro() {
        vehiculoCaro = 0;
        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).obtenerPrecioFinal() > vehiculoCaro) {
                vehiculoCaro = vehiculos.get(i).obtenerPrecioFinal();
            }
        }
    }

    public double obtenerVehiculoBarato() {
        return vehiculoBarato;
    }

    public void establecerVehiculoBarato() {
        for (int i = 0; i < vehiculos.size(); i++) {
            if (i == 0) {
                vehiculoBarato = vehiculos.get(i).obtenerPrecioFinal();
            }
            if (vehiculos.get(i).obtenerPrecioFinal() < vehiculoBarato) {
                vehiculoBarato = vehiculos.get(i).obtenerPrecioFinal();
            }
        }
    }

    @Override
    public String toString() {
        String cadena = String.format("CONCESIONARIA %s\n", nombreConcesionaria);
        for (int i = 0; i < vehiculos.size(); i++) {
            cadena = String.format("%s%s", cadena, vehiculos.get(i));
        }
        cadena = String.format("%s\nVehiculo mas Caro: %.2f\n"
                + "Vehiculo mas Barato: %.2f\n"
                + "Venta Total: %.2f", cadena, vehiculoCaro, vehiculoBarato,
                ventaTotal);
        return cadena;

    }

}
