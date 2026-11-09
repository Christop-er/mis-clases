import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;

        do {
            System.out.print("Ingrese numero: ");
            numero = sc.nextInt();

            if (numero > 0) {
                suma = suma + numero;
            }

        } while (numero >= 0);

        System.out.println("Suma total: " + suma);
    }
}