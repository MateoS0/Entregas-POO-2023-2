import java.util.Scanner;
public class E4 {
    public static void main(String[] args) {
        int eJuan, eAlberto, eAna, eMama;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad de Juan: ");
        eJuan = entrada.nextInt();
        eAlberto = 2*eJuan/3;
        eAna = 4*eJuan/3;
        eMama = eJuan+eAna+eAlberto;
        System.out.println("Las edades son:\nMamá: "+eMama+"\nJuan: "+eJuan+"\nAlberto: "+eAlberto+"\nAna: "+eAna);
    }
}