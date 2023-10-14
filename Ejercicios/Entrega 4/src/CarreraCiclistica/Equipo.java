/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CarreraCiclistica;

/**
 *
 * @author USUARIO
 */
import java.util.*;
public class Equipo {  
    
    private String nombre;
    private static double totalTiempo;
    private String pais;
    Vector listaCiclistas;
    
    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        totalTiempo = 0;
        listaCiclistas = new Vector();
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    
    void añadirCiclista(Ciclista ciclista) {
        listaCiclistas.add(ciclista);
    }
    
    void listarEquipo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }
    }
    
    void buscarCiclista() {
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            if (c.getNombre().equals(nombreCiclista)) {
                System.out.println(c.getNombre());
            }
        }
    }
    
    void calcularTotalTiempo() {
        for (int i = 0; i < listaCiclistas.size(); i++) {
            Ciclista c = (Ciclista) listaCiclistas.elementAt(i);
            totalTiempo += c.getTiempoAcumulado();
        }
    }
    
    void imprimir() {
        System.out.println("Nombre del equipo = " + nombre);
        System.out.println("País = " + pais);
        System.out.println("Total tiempo del equipo = " + totalTiempo);
    }
    
}