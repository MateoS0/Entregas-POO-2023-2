import java.util.Scanner;

public class Parte1_4_23 {
    public static void main(String[] args) {
        double aA, bB, cC, disc, x1, x2;

        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        aA = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Ingrese el valor de B: ");
        bB = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese el valor de C: ");
        cC = c.nextDouble();

        disc = Math.pow(bB,2)-4*aA*cC;

        if (disc > 0) {
            x1 = (-bB+Math.sqrt(disc))/(2*aA);
            x2 = (-bB-Math.sqrt(disc))/(2*aA);
            System.out.println("X1: "+x1+"\nX2: "+x2);
        }
        else if (disc == 0) {
            x1 = -bB/(2*aA);
            System.out.println("X: "+x1);
        }
        else {
            System.out.println("No hay soluciones reales.");
        }
    }
}