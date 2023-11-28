package CRUD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

import java.io.*;
import java.util.*;

public class Menu {
    
    static int rOpcion() {
        boolean opc = true;
        int opcion = 0;
        
        while (opc) {
            try {
                Scanner M = new Scanner(System.in);
                opcion = M.nextInt();
                opc = false;
            } catch (InputMismatchException e) {
                System.out.println("Dijite una opción válida");
            }
        }
        return opcion;
    }
        
    static String Nuevo() {
        System.out.println("Dijite el nombre del archivo que desea crear: ");
        Scanner N = new Scanner(System.in);
        String Fichero = N.nextLine().toUpperCase() + ".txt";
            
        try {
            if (new File(Fichero).isFile()) {
                System.out.println("El archivo " + Fichero + " ya existe. \n ¿Desea reescribirlo? \n 1: Sí \n Otro: No");
                
                if ((rOpcion() != 1)) {
                    System.out.println("No se reescribió " + Fichero);
                    System.exit(0);
                }
            }
            
            new FileWriter(Fichero);
            
        } catch (IOException e) {
            System.out.println("No se pudo crear " + Fichero);
            System.exit(0);
        }
        System.out.println("El archivo " + Fichero + " fue creado correctamente.");
        return Fichero;
    }
    
    static String Subir() {
        while (true) {
            System.out.println("Dijite el nombre del archivo que desea cargar: ");
            Scanner arc = new Scanner(System.in);
            String Fichero = arc.nextLine().toUpperCase() + ".txt";
            
            try {
                new FileReader(Fichero);
                System.out.println("El archivo " + Fichero + " fue cargado correctamente");
                return Fichero;
            } catch (FileNotFoundException e) {
                System.out.println("No se encontró el archivo " + Fichero);
                System.out.println("¿Desea intentar con otro archivo? \n 1: Sí \n Otro: No");
                
                if (rOpcion() != 1) {
                    System.out.println("Finalizado");
                    System.exit(0);
                }
            }
        }
    }
    
}