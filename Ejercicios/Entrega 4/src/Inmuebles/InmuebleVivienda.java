/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class InmuebleVivienda extends Inmueble {
    
    protected int numHabitaciones;
    protected int numBaños;

    public InmuebleVivienda(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
        super(identificadorInmobiliario, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println("Número de habitaciones = " + numHabitaciones);
        System.out.println("Número de baños = " + numBaños);
    }
    
}