/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class CasaConjuntoCerrado extends CasaUrbana {
    
    protected static double valorArea = 2500000;
    protected int valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneCamposDeportivos;
    
    public CasaConjuntoCerrado(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int valorAministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println("Valor de la administración = " + valorAdministracion);
        System.out.println("¿Tiene piscina? = " + tienePiscina);
        System.out.println("¿Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
    }
    
}