/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutor;

import vehiculo.*;
import concesionario.*;
import java.util.ArrayList;

/**
 *
 * @author KevinR
 */
public class Ejecutor {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        Comprador comprador1 = new Comprador("Alberto Herrera", "11043834");
        Comprador comprador2 = new Comprador("Daniel Smaniego", "113449324");
        Comprador comprador3 = new Comprador("Elena Betancourt", "06720342");
        Comprador comprador4 = new Comprador("Maria Tacuri", "492308439");

        TipoSedan sedan = new TipoSedan("H5500", comprador1, 10500, 10);
        sedan.establecerValorDescuento();
        sedan.establecerSeguroMecanico();
        sedan.establecerValorDescuento();
        sedan.establecerPrecioFinal();
        TipoSedan sedan2 = new TipoSedan("IDAL", comprador4, 25000, 12);
        sedan2.establecerValorDescuento();
        sedan2.establecerSeguroMecanico();
        sedan2.establecerValorDescuento();
        sedan2.establecerPrecioFinal();
        TipoSuv suv = new TipoSuv("ZNAIS", comprador2, 50000, 15);
        suv.establecerSeguroPersonas();
        suv.establecerPrecioFinal();
        TipoCamioneta camioneta = new TipoCamioneta("TOYOTA", comprador3, 65000, 20);
        camioneta.establecerValorImportacion();
        camioneta.establecerSeguroMantenimiento();
        camioneta.establecerPrecioFinal();
        vehiculos.add(sedan);
        vehiculos.add(sedan2);
        vehiculos.add(suv);
        vehiculos.add(camioneta);
        Concesionario concesionario = new Concesionario(vehiculos, "ALCATRAZ");
        concesionario.establecerVehiculoBarato();
        concesionario.establecerVehiculoCaro();
        concesionario.establecerVentaTotal();
        System.out.println(concesionario);
    }
}
