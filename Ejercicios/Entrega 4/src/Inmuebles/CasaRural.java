/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class CasaRural extends Casa {
    
    protected static double valorArea = 1500000;
    protected int distanciaCabera;
    protected int altitud;
    
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println("Distancia la cabecera municipal = " + numHabitaciones + "km.");
        System.out.println("Altitud sobre el nivel del mar = " + altitud + "metros.");
        System.out.println();
    }
    
}