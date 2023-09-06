import java.util.Scanner;

public class Parte1_4_15 {
    public static void main(String[] args) {
        double pesoA, pesoB, pesoC, pesoD;

        Scanner pA = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        pesoA = pA.nextDouble();
        Scanner pB = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera B: ");
        pesoB = pB.nextDouble();
        Scanner pC = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera C: ");
        pesoC = pC.nextDouble();
        Scanner pD = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera D: ");
        pesoD = pD.nextDouble();

        if (pesoA==pesoB && pesoA==pesoC) {
            if (pesoD>pesoA) {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y");
            }
            else {
                System.out.println("LA ESFERA D ES LA DIFERENTE Y");
            }
        }
        else {
            if (pesoA==pesoB && pesoA==pesoD) {
                System.out.println("LA ESFERA C ES LA DIFERENTE ");
                if (pesoC>pesoA) {
                    System.out.println("Y ES DE MAYOR PESO");
                }
                else {
                    System.out.println("Y ES DE MENOR PESO");
                }
            }
            else {
                if (pesoA==pesoC && pesoA==pesoD) {
                    System.out.println("LA ESFERA B ES LA DIFERENTE ");
                    if (pesoB>pesoD) {
                        System.out.println("Y ES DE MAYOR PESO");
                    }
                    else {
                        System.out.println("Y ES DE MENOR PESO");
                    }
                }
                else {
                    System.out.println("LA ESFERA A ES LA DIFERENTE ");
                    if (pesoA>pesoB) {
                        System.out.println("Y ES DE MAYOR PESO");
                    }
                    else {
                        System.out.println("Y ES DE MENOR PESO");
                    }
                }
            }
        }

    }
}