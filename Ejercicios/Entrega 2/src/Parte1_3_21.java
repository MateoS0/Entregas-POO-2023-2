import java.util.Scanner;

public class Parte1_3_21 {
    public static void main(String[] args) {
        double ladoA, ladoB, ladoC, perimetro, semiperimetro, area;

        Scanner la = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado A: ");
        ladoA = la.nextDouble();
        Scanner lb = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado B: ");
        ladoB = lb.nextDouble();
        Scanner lc = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado C: ");
        ladoC = lc.nextDouble();

        perimetro = ladoA+ladoB+ladoC;
        semiperimetro = perimetro/2;
        area = Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));

        System.out.println("Perímetro: "+perimetro+"\nSemiperímetro: "+semiperimetro+"\nÁrea: "+area);
    }
}