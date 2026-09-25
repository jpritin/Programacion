import java.util.Scanner;

public class CalculaMinutos {
  public static void main(String[] args) {
    int segundos;
    int minutos;    
    int segundosRestantes;

    Scanner sc = new Scanner(System.in);

    // Mostramos en pantalla
    System.out.println("Este programa calcula el número de minutos y segundos dada una cantidad de segundos");
    System.out.println("===================================================================================");
    System.out.print("Introduzca una cantidad de segundos: ");

    // Leemos desde teclado
    segundos = sc.nextInt();

    // Calculamos
    minutos = segundos / 60; // Calcula en número de minutos
    segundosRestantes = segundos % 60; // Calcula el número de segundos restantes

    // Mostramos el resultado en pantalla
    System.out.println(segundos + " segundos es igual a  " + minutos + 
      " minutos y " + segundosRestantes + " segundos");  
  }
}