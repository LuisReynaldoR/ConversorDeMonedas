import java.util.Scanner;

public class UserInput {
    private final Scanner scanner = new Scanner(System.in);

    public String leerCodigoMoneda(String numero) {
        System.out.print("Ingresa código de moneda " + numero + ": ");
        return scanner.nextLine().trim().toUpperCase();
    }

    public double leerCantidad() {
        System.out.print("Ingresa la cantidad: ");
        double cantidad = scanner.nextDouble();
        scanner.nextLine(); // <--- esta línea limpia el salto de línea pendiente
        return cantidad;
    }
}
