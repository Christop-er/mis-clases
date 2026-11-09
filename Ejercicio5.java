import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 5000;
        double monto;
        int opcion;

        do {
            System.out.println("\n--- CAJERO AUTOMATICO ---");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Depositar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Saldo: S/ " + saldo);
                    break;

                case 2:
                    System.out.print("Monto a retirar: ");
                    monto = sc.nextDouble();

                    if (monto > 0 && monto <= saldo) {
                        saldo = saldo - monto;
                        System.out.println("Retiro exitoso");
                    } else {
                        System.out.println("Monto no valido");
                    }
                    break;

                case 3:
                    System.out.print("Monto a depositar: ");
                    monto = sc.nextDouble();

                    if (monto > 0) {
                        saldo = saldo + monto;
                        System.out.println("Deposito exitoso");
                    } else {
                        System.out.println("Monto no valido");
                    }
                    break;

                case 4:
                    System.out.println("Gracias por usar el cajero");
                    break;

                default:
                    System.out.println("Opcion incorrecta");
            }

        } while (opcion != 4);
    }
}