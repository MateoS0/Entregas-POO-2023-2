package CRUD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */
public class Contacto {
    
    String Documento;
    String Nombre;
    String Apellido;
    
    Contacto (String doc, String nombre, String apellido) {
        this.Documento = doc;
        this.Nombre = nombre;
        this.Apellido = apellido;
    }
    
    String resumen() {
        return "Cédula: " + Documento + "\nNombre: " + Nombre + "\nApellido: " + Apellido + "\n ";
    }
    
}