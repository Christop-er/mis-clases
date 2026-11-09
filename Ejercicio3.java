import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero, i = 1;

        System.out.print("Numero: ");
        numero = sc.nextInt();

        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;

        } while (i <= 12);
    }
}
