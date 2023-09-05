import java.util.Scanner;

public class Parte1_3_19 {
    public static void main(String[] args) {
        double lado, area, perimetro, altura;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado del triángulo: ");
        lado = entrada.nextDouble();

        perimetro = 3*lado;
        altura = (Math.sqrt(3)/2)*lado;
        area = (Math.sqrt(3)/4)*Math.pow(lado,2);

        System.out.println("Perímetro: "+perimetro+"\nAltura: "+altura+"\nÁrea: "+area);
    }
}