import java.util.Scanner;
public class E17 {
    public static void main(String[] args) {
        double radio, area, longitud;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo: ");
        radio = entrada.nextDouble();
        area = Math.PI * (Math.pow(radio, 2));
        longitud = 2 * Math.PI * radio;
        System.out.println("Radio: "+radio+"\nÁrea: "+area+"\nLongitud: "+longitud);
    }
}
