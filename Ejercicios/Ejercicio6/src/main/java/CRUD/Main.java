package CRUD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author USUARIO
 */

import CRUD.Crud;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Escoja una de las siguientes opciones: \n 1: Crear un archivo \n 2: Cargar un archivo \n Otro: Salir");
        int opcion = Menu.rOpcion();
        switch (opcion) {
            case 1:
                String archivo = Menu.Nuevo();
                new Crud(archivo).menu();
                break;
            case 2:
                String Carchivo = Menu.Subir();
                new Crud(Carchivo).menu();
                break;
            default:
                System.out.println("Finalizado");
        }
    }
    
}