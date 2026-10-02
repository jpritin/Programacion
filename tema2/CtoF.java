import java.util.Scanner;

public class CtoF {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double farenheit = 0.0;
    double celsius = 0.0;

    // Mostramos en pantalla
    System.out.println("Este programa convierte grados Celsius a Farenheit");
    System.out.println("==================================================");
    System.out.print("Introduzca una temperatura en grados Celsius: ");

    // Leemos desde teclado
    celsius = sc.nextDouble();

    // Calculamos
    farenheit = 9.0 / 5 * celsius + 32;

    // Mostramos el resultado en pantalla
    System.out.println(celsius + " grados Celsius, son " + farenheit + " grados farenheit");  
  }
}