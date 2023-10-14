/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class ApartamentoFamiliar extends Apartamento {
    
    protected static double valorArea = 2000000;
    protected int valorAdministracion;
    
    public ApartamentoFamiliar(int identificadorInmobiliario, int area, String direccion, int numHabitaciones, int numBaños, int valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numHabitaciones, numBaños);
        this.valorAdministracion = valorAdministracion;
    }
    
    void Imprimir() {
        super.Imprimir();
        System.out.println("Valor de la administración = $" + valorAdministracion);
        System.out.println();
    }
    
}