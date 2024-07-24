/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario;

/**
 *
 * @author KevinR
 */
public class Comprador {

    private String nombres;
    private String cedula;

    public Comprador(String n, String c) {
        nombres = n;
        cedula = c;
    }

    public String obtenerNombres() {
        return nombres;
    }

    public void establecerNombres(String n) {
        nombres = n;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

}
