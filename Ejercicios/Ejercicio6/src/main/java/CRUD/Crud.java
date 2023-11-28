package CRUD;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USUARIO
 */

import CRUD.Contacto;
import CRUD.Menu;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Crud {
    
    String clasificar;

    Crud(String archivo) throws IOException {
     this.clasificar = archivo;   
    }
    
    String Doc() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite su número de identidad: ");
        return input.nextLine().strip();
    }
    
    String Repertorio(String doc) throws IOException {
        String linea;
        BufferedReader br = new BufferedReader(new FileReader(clasificar));
        while((linea = br.readLine()) != null) {
            if (linea.contains("Cédula: " + doc)) {
                return linea;
            }
        }
        return null;
    }
    
    void Existe(String repertorio) {
        System.out.println("Pulsa cualquier tecla para continuar.");
        new Scanner(System.in).nextLine();
    }
    
    void Existe2(String repertorio, String doc) {
        if (repertorio == null) {
            System.out.println("No se encontró el contacto con el número de documento: " + doc);
            System.out.println("Pulsa cualquier tecla para continuar.");
            new Scanner(System.in).nextLine();
        } else {
            Existe(repertorio);
        }
    }
    
    void Consultar() throws IOException {
        String doc = Doc();
        String repertorio = Repertorio(doc);
        if (repertorio == null) {
            System.out.println("No se encontró el contacto con el número de documento: " + doc);
            System.out.println("Pulsa cualquier tecla para continuar.");
            new Scanner(System.in).nextLine();
        } else {
            System.out.println("El usuario consultado con el documento " + doc + " sí se encuentra en el archivo");
        }
    }
    
    void Agregar() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(clasificar, true));
        Scanner input = new Scanner(System.in);
        System.out.println("El número de documento de este contacto no podrá editarse después.");
        String doc = Doc();
        String repertorio = Repertorio(doc);
        
        if (repertorio == null) {
            System.out.println("Dijite su nombre:");
            String nombre = input.nextLine().strip();
            System.out.println("Dijite su apellido:");
            String apellido = input.nextLine().strip();
            bw.write(new Contacto(doc, nombre, apellido).resumen());
            bw.newLine();
            System.out.println("Se añadió el contacto.");
        } else {
            System.out.println("Ya existe un contacto con el número de documento " + doc + " ya existe.");
            Existe(repertorio);
            return;
        }
        
        System.out.println("Pulsa cualquier tecla para continuar.");
        input.nextLine();
        bw.close();
    }
    
    void Borrar() throws IOException {
        Scanner scan = new Scanner(System.in);
        String doc = Doc();
        String repertorio = Repertorio(doc);
        
        if (repertorio == null) {
            Existe2(null, doc);
            return;
        } else {
            Existe(repertorio);
        }
        
        System.out.println("¿Va eliminar un contacto? \n 1: Sí \n Otro: No");
        
        if (Menu.rOpcion() != 1) {
            return;
        } 
        Editar(repertorio, "");
        System.out.println("Se eliminó.");
        System.out.println("Pulsa cualquier tecla para continuar.");
        scan.nextLine();
    }
    
    void Actualizar() throws IOException {
        String doc = Doc();
        String repertorio = Repertorio(doc);
        
        if (repertorio == null) {
            Existe2(null, doc);
            return;
        } else {
            Existe(repertorio);
        }
        
        System.out.println("¿Quiere actualizar el contacto? \n 1: Sí \n Otro: No");
        
        if (Menu.rOpcion() != 1) {
            return;
        }
        Scanner input = new Scanner(System.in);
        System.out.println("Dijite su nombre: ");
        String nombre = input.nextLine().strip();
        System.out.println("Dijite su apellido: ");
        String apellido = input.nextLine().strip();
        String cambiar = new Contacto(doc, nombre, apellido).resumen();
        Editar(repertorio, cambiar);
        System.out.println("Contacto actualizado");
        System.out.println("Pulsa cualquier tecla para continuar.");
    }
    
    private void Editar(String registro, String cambio) throws IOException {
        BufferedReader br = new BufferedReader( new FileReader(clasificar));
        StringBuilder antes = new StringBuilder();
        String linea = br.readLine();
        
        while (linea != null) {
            antes.append(linea).append(System.lineSeparator());
            linea = br.readLine();
        }
        
        String content = antes.toString();
        String ahora = content.replaceAll(registro, cambio);
        
        try (FileWriter writer = new FileWriter(clasificar)) {
            writer.write(ahora);
        }
    }
    
    private void Mostrar() throws IOException {
        String contenido = new String(Files.readAllBytes(Path.of(clasificar)));
        String line = contenido.strip();
        Scanner scan = new Scanner(System.in);
        System.out.println(line.replaceAll("(?m)^[ \t]*\r?\n", "\n"));
        System.out.println("\nPulsa cualquier tecla para continuar.");
        scan.nextLine();
    }
    
    void menu() throws IOException {
        while (true) {
            System.out.println("Escoja alguna de las opciones para usar " + clasificar + ": \n 1: Agregar contacto \n 2: Borrar contacto \n 3: Actualizar contacto \n 4: Consultar contacto \n 5: Mostrar contactos \n Otro: Salir");
            switch (Menu.rOpcion()) {
                case 1:
                    Agregar();
                    break;
                case 2:
                    Borrar();
                    break;
                case 3:
                    Actualizar();
                    break;
                case 4:
                    Consultar();
                    break;
                case 5:
                    Mostrar();
                    break;
                default:
                    System.out.println("Finalizado");
                    System.exit(0);
                    break;
            }
        }
    }
    
}