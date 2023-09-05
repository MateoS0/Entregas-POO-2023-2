import java.util.Scanner;

public class Parte1_4_10 {
    public static void main(String[] args) {
        String nombre;
        int nInscripcion, estrato;
        double patrimonio, pMatricula;

        Scanner ni = new Scanner(System.in);
        System.out.println("Ingrese el número de inscripción: ");
        nInscripcion = ni.nextInt();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        Scanner p = new Scanner(System.in);
        System.out.println("Ingrese el patrimonio: ");
        patrimonio = p.nextDouble();
        Scanner es = new Scanner(System.in);
        System.out.println("Ingrese el estrato social: ");
        estrato = es.nextInt();

        pMatricula = 50000;
        if (patrimonio>2000000 && estrato>3) {
            pMatricula += 0.03*patrimonio;
        }

        System.out.println("EL ESTUDIANTE CON NÚMERO DE INSCRIPCIÓN "+nInscripcion+" Y NOMBRE "+nombre+" DEBE PAGAR: $"+pMatricula);
    }
}