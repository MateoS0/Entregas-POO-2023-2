import java.util.Scanner;

public class Parte1_4_7 {
    public static void main(String[] args) {
        double aA, bB;
        String respuesta;

        Scanner a = new Scanner(System.in);
        System.out.println("Ingrese el valor de A: ");
        aA = a.nextDouble();
        Scanner b = new Scanner(System.in);
        System.out.println("Ingrese el valor de B: ");
        bB = b.nextDouble();

        if (aA > bB) {
            respuesta = "A ES MAYOR QUE B";
        }
        else if (aA == bB) {
            respuesta = "A ES IGUAL A B";
        }
        else {
            respuesta = "A ES MENOR QUE B";
        }

        System.out.println(respuesta);
    }
}