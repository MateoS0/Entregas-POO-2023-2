/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class CasaIndependiente extends CasaUrbana {
    
    protected static double valorArea = 3000000;
    
    public CasaIndependiente(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBaños, numPisos);
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println();
    }
    
}