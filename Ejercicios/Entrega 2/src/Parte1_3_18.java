import java.util.Scanner;

public class Parte1_3_18 {
    public static void main(String[] args) {
        double codigo, hTrabajo, pHora, porReten, sBruto, sNeto, rFuente;
        String nombre;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre del empleado: ");
        nombre = entrada.next();
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese el código: ");
        codigo = c.nextDouble();
        Scanner ht = new Scanner(System.in);
        System.out.println("Ingrese las horas trabajadas: ");
        hTrabajo = ht.nextDouble();
        Scanner ph = new Scanner(System.in);
        System.out.println("Ingrese el valor por hora: ");
        pHora = ph.nextDouble();
        Scanner pr = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje de retención: ");
        porReten = pr.nextDouble();

        sBruto = hTrabajo*pHora;
        rFuente = sBruto*porReten;
        sNeto = sBruto-rFuente;

        System.out.println("Código: "+codigo+"\nNombre: "+nombre+"\nSalario bruto: $"+sBruto+"\nSalario neto: $"+sNeto);
    }
}