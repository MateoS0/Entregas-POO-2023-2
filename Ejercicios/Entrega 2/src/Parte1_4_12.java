import java.util.Scanner;

public class Parte1_4_12 {
    public static void main(String[] args) {
        String nombre;
        double nht, vhn, het, hee8, salario;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.next();
        Scanner ht = new Scanner(System.in);
        System.out.println("Ingrese el número de horas trabajadas: ");
        nht = ht.nextDouble();
        Scanner ph = new Scanner(System.in);
        System.out.println("Ingrese el valor por hora: ");
        vhn = ph.nextDouble();

        if (nht > 40) {
            het = nht-40;
            if (het > 8) {
                hee8 = het-8;
                salario = 40*vhn+16*vhn+hee8*3*vhn;
            }
            else {
                salario = 40*vhn*het*2*vhn;
            }
        }
        else {
            salario = nht*vhn;
        }

        System.out.println("EL TRABAJADOR "+nombre+" DEVENGO: $"+salario);
    }
}