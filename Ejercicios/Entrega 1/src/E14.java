import java.util.Scanner;
public class E14 {
    public static void main(String[] args) {
        double num, cuadrado, cubo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        num = entrada.nextDouble();
        cuadrado = Math.pow(num, 2);
        cubo = Math.pow(num, 3);
        System.out.println("Número: "+num+"\nCuadrado del número: "+cuadrado+"\nCubo del número: "+cubo);
    }
}
