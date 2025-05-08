import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInput input = new UserInput();
        CurrencyConverter converter = new CurrencyConverter();
        List<String> historial = new ArrayList<>();

        int opcion;
        do {
            System.out.println("\n==== Conversor de Monedas ====");
            System.out.println("1. Realizar conversión");
            System.out.println("2. Ver historial");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> {
                    try {
                        String moneda1 = input.leerCodigoMoneda("1");
                        String moneda2 = input.leerCodigoMoneda("2");
                        double cantidad = input.leerCantidad();

                        double resultado = converter.convertir(moneda1, moneda2, cantidad);
                        LocalDateTime ahora = LocalDateTime.now();
                        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                        String timestamp = ahora.format(formato);

                        String registro = String.format("[%s] %.2f %s = %.2f %s", timestamp, cantidad, moneda1, resultado, moneda2);

                        System.out.println("Resultado: " + registro);
                        historial.add(registro);
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                case 2 -> {
                    System.out.println("\n-- Historial de conversiones --");
                    if (historial.isEmpty()) {
                        System.out.println("No hay conversiones realizadas.");
                    } else {
                        historial.forEach(System.out::println);
                    }
                }
                case 3 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 3);
    }
}
