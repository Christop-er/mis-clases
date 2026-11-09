import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre, continuar;
        double precio, total = 0;
        int cantidad, totalProductos = 0;

        do {
            System.out.print("Nombre del producto: ");
            nombre = sc.next();

            System.out.print("Precio: ");
            precio = sc.nextDouble();

            System.out.print("Cantidad: ");
            cantidad = sc.nextInt();

            if (precio > 0 && cantidad > 0) {
                total = total + (precio * cantidad);
                totalProductos = totalProductos + cantidad;
            }

            System.out.print("¿Desea continuar? (S/N): ");
            continuar = sc.next();

        } while (continuar.equalsIgnoreCase("S"));

        System.out.println("\n--- RESUMEN DE VENTAS ---");
        System.out.println("Monto total vendido: S/ " + total);
        System.out.println("Cantidad de productos: " + totalProductos);

        if (totalProductos > 0) {
            System.out.println("Promedio por producto: S/ "
                    + (total / totalProductos));
        }
    }
}