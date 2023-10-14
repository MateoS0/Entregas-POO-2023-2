/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Casa extends InmuebleVivienda {
    
    protected int numPisos;
    
    public Casa(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int numPisos) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBaños);
        this.numPisos = numPisos;
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println("Número de pisos = " + numPisos);
    }
    
}