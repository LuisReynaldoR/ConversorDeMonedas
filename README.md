# 💱 Conversor de Monedas en Java

Este es un programa de consola en Java que permite convertir cantidades entre diferentes monedas utilizando la API de ExchangeRate. Ofrece un menú interactivo y guarda un historial de conversiones con marca de tiempo durante la sesión.

## 🚀 Características

- Conversión de monedas en tiempo real usando la API de ExchangeRate.
- Menú interactivo para el usuario.
- Historial de conversiones dentro de la sesión.
- Registros con fecha y hora exacta.
- Separación de responsabilidades en diferentes clases.
  
## 📁 Estructura del proyecto

ConversorMonedas/
│
├── src/
│ ├── Principal.java # Clase principal con el menú interactivo
│ ├── UserInput.java # Lectura segura de entrada del usuario
│ ├── CurrencyConverter.java # Lógica para consultar la API y procesar resultados
│ └── Conversion.java # Modelo de datos para deserializar respuesta JSON
├── README.md # Este archivo


## 🛠 Requisitos

- Java 11 o superior
- Conexión a internet (para acceder a la API)
- Dependencia de Gson para parsear JSON

Puedes agregar Gson manualmente o usar un sistema de construcción como Maven/Gradle. Para compilar manualmente:

```bash
javac -cp ".;gson-2.8.9.jar" src/*.java
Y ejecutar:

java -cp ".;gson-2.8.9.jar;src" Principal

🔧 Cómo usar
Ejecuta el programa.

Selecciona la opción 1 para realizar una conversión.

Ingresa el código de la moneda de origen (por ejemplo, USD).

Ingresa el código de la moneda destino (por ejemplo, EUR).

Ingresa la cantidad a convertir.

El resultado se mostrará y se almacenará en el historial.

Puedes consultar el historial con la opción 2.

Usa la opción 3 para salir del programa.

🧠 Ejemplo de salida

==== Conversor de Monedas ====
1. Realizar conversión
2. Ver historial
3. Salir
Elige una opción: 1
Ingresa código de moneda 1: USD
Ingresa código de moneda 2: MXN
Ingresa la cantidad: 100

Resultado: [2025-05-07 14:23:12] 100.00 USD = 1710.45 MXN

🌐 API utilizada
Se usa la API de ExchangeRate:
https://www.exchangerate-api.com/

Asegúrate de reemplazar tu propia API Key en CurrencyConverter.java:

private static final String API_KEY = "TU_API_KEY_AQUI";

📈 Mejoras futuras (sugerencias)
Validar códigos de moneda (solo letras y longitud = 3).

Guardar el historial en un archivo .txt.

Leer historial desde archivo en el inicio del programa.

Interfaz gráfica (GUI) con JavaFX o Swing.

Internacionalización de idiomas.

📄 Licencia
Este proyecto es de uso libre para fines educativos.
