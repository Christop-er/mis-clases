import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota, suma = 0, promedio;
        int cantidad = 0;
        String continuar;

        do {
            System.out.print("Nota: ");
            nota = sc.nextDouble();

            if (nota >= 0 && nota <= 20) {
                suma = suma + nota;
                cantidad++;
            } else {
                System.out.println("Nota no valida");
            }

            System.out.print("¿Continuar? (S/N): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("S"));

        if (cantidad > 0) {
            promedio = suma / cantidad;

            System.out.println("Cantidad de notas: " + cantidad);
            System.out.println("Suma total: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}