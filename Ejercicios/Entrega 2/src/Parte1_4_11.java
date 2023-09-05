import java.util.Scanner;

public class Parte1_4_11 {
    public static void main(String[] args) {
        int n1, n2, n3, may;

        Scanner num1 = new Scanner(System.in);
        System.out.println("Ingrese el número 1: ");
        n1 = num1.nextInt();
        Scanner num2 = new Scanner(System.in);
        System.out.println("Ingrese el número 2: ");
        n2 = num2.nextInt();
        Scanner num3 = new Scanner(System.in);
        System.out.println("Ingrese el número 3: ");
        n3 = num3.nextInt();

        may=0;
        if (n1>n2 && n1>n3) {
            may = n1;
        }
        else if (n2>n1 && n2>n3) {
            may = n2;
        }
        else if (n3>n1 && n3>n2) {
            may = n3;
        }

        System.out.println("EL MAYOR VALOR ENTRE "+n1+", "+n2+", Y "+n3+", ES: "+may);
    }
}