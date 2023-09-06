import java.util.Scanner;

public class Parte1_4_22 {
    public static void main(String[] args) {
        String nombre;
        double sBasico, hTrabajo, sMensual;

        Scanner nom = new Scanner(System.in);
        System.out.println("Ingresa el nombre: ");
        nombre = nom.next();
        Scanner sb = new Scanner(System.in);
        System.out.println("Ingrese el salario básico: ");
        sBasico = sb.nextDouble();
        Scanner ht = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        hTrabajo = ht.nextDouble();

        sMensual = sBasico*hTrabajo;

        if (sMensual>450000) {
            System.out.println("Nombre: "+nombre+"\nSalario mensual: "+sMensual);
        }
        else {
            System.out.println("Nombre: "+nombre);
        }
    }
}