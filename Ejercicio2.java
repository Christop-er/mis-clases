import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contraseña;

        do {
            System.out.print("Ingrese contraseña: ");
            contraseña = sc.nextLine();

            if (!contraseña.equals("Java2026")) {
                System.out.println("Contraseña incorrecta");
            }

        } while (!contraseña.equals("Java2026"));

        System.out.println("Acceso permitido");
    }
}