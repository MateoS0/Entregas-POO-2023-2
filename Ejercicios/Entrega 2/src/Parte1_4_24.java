import java.util.Scanner;

public class Parte1_4_24 {
    public static void main(String[] args) {
        double aA, bB, cC;

        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el valor de la esfera A: ");
        aA = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Ingrese el valor de la esfera B: ");
        bB = b.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese el valor de la esfera C: ");
        cC = c.nextDouble();

        if (aA>bB && aA>cC) {
            System.out.println("La esfera de mayor peso es la A");
        }
        else if (aA<bB && bB>cC) {
            System.out.println("La esfera de mayor peso es la B");
        }
        else {
            System.out.println("La esfera de mayor peso es la C");
        }
    }
}