/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inmuebles;

/**
 *
 * @author USUARIO
 */
public class Inmueble {
    
    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta;

    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }
    
    double calcularPrecioVenta(double valorArea) {
        precioVenta = area * valorArea;
        return precioVenta;
    }
    
    void Imprimir() {
        System.out.println("Identificador inmobiliario = " +
        identificadorInmobiliario);
        System.out.println("Área = " + area);
        System.out.println("Dirección = " + direccion);
        System.out.println("Precio de venta = $" + precioVenta);
    }
    
}