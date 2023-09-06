import java.util.Scanner;

public class Parte1_4_14 {
    public static void main(String[] args) {
        double vD1, vD2, vD3, salar, totVen, porVen, salar1, salar2, salar3;

        Scanner v1 = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1: ");
        vD1 = v1.nextDouble();
        Scanner v2 = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 2: ");
        vD2 = v2.nextDouble();
        Scanner v3 = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 3: ");
        vD3 = v3.nextDouble();
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el salario: ");
        salar = s.nextDouble();

        totVen = vD1+vD2+vD3;
        porVen = 0.33*totVen;

        if (vD1 > porVen) {
            salar1 = salar+0.2*salar;
        }
        else {
            salar1 = salar;
        }
        if (vD2 > porVen) {
            salar2 = salar+0.2*salar;
        }
        else {
            salar2 = salar;
        }
        if (vD3 > porVen) {
            salar3 = salar+0.2*salar;
        }
        else {
            salar3 = salar;
        }

        System.out.println("SALARIO VENDEDORES DEPTO. 1 "+salar1+"\nSALARIO VENDEDORES DEPTO. 2 "+salar2+"\nSALARIO VENDEDORES DEPTO. 3 "+salar3);
    }
}