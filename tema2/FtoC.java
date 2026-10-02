import java.util.Scanner;

public class FtoC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double farenheit = 0.0;
    double celsius = 0.0;

    // Mostramos en pantalla
    System.out.println("Este programa convierte grados Farenheit a Celsius");
    System.out.println("==================================================");
    System.out.print("Introduzca una temperatura en grados Farenheit: ");

    // Leemos desde teclado
    farenheit = sc.nextDouble();

    // Calculamos
    celsius = (5.0 / 9) * (farenheit - 32);

    // Mostramos el resultado en pantalla
    System.out.println(farenheit + " grados Farenheit, son " + celsius + " grados celsius");  
  }
}