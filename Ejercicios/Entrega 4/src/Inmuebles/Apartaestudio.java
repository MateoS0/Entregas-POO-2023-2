/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Apartaestudio extends Apartamento{
    
    protected static double valorArea = 1500000;
    
    public Apartaestudio(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBaños);
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println();
    }
    
}