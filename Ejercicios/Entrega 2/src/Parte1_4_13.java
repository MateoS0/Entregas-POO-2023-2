import java.util.Scanner;

public class Parte1_4_13 {
    public static void main(String[] args) {
        double valComp, valPag, pDes;
        String color;

        Scanner vc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        valComp = vc.nextDouble();
        Scanner c = new Scanner(System.in);
        System.out.println("Ingrese el color: ");
        color = c.next();

        if (color.equals("BLANCO")) {
            pDes = 0;
        }
        else {
            if (color.equals("VERDE")) {
                pDes = 10;
            }
            else {
                if (color.equals("AMARILLO")) {
                    pDes = 25;
                }
                else {
                    if (color.equals("AZUL")) {
                        pDes = 50;
                    }
                    else {
                        pDes = 100;
                    }
                }
            }
        }

        valPag = valComp-pDes*valComp/100;
        System.out.println("EL CLIENTE DEBE PAGAR: $"+valPag);
    }
}