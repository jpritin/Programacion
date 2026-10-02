import java.util.Scanner;

public class Expresiones
 {
  public static void main(String[] args) {
    int a, b, c;

    Scanner sc = new Scanner(System.in);

    // Mostramos en pantalla
    System.out.println("Este comprueba el resultado de varias expresiones aritméticas");
    System.out.println("=============================================================");

    /*
    a) 3 * A + B – 6 / A (A=2, B=5)
    b) B * A – B * B / 4 * C (A=4, B=5, C=1)
    c) (A * B) / 9 (A=4, B=5)
    d) (((B + C) / 2 * A + 10) * 3 * B) – 6 (A=4, B=5, C=1)
    e) 3 > A && !C / 2 == 0. 5 (A=4, C=1)
    f) (A+ B) / 2 >= 3 || C != 20 (A=4, B=2, C= 20)
    g) 5 + 25 % 2
    h) (5+25) % 2
    i) 5+25 / 10
    j) -2*2
    k) (-2)*2
    l) - (2*2)
    m) - Math.pow(2, 2)
    n) Math.pow(-2,2)
    ñ) - (Math.pow(2,2))
    */


    // a) 3 * A + B – 6 / A (A=2, B=5)
    // Damos valor a las variables
    a = 2;
    b = 5;
    // Mostramos el resultado en pantalla
    System.out.print("3 * a + b - 6 / a = ");      
    System.out.println(3 * a + b - 6 / a);  

    // b) B * A – B * B / 4 * C (A=4, B=5, C=1)
    // Damos valor a las variables
    a = 4;
    b = 5;
    c = 1;
    // Mostramos el resultado en pantalla
    System.out.print("b * a - b * b / 4 * c = ");      
    System.out.println(b * a - b * b / 4 * c);  

    // c) (A * B) / 9 (A=4, B=5)
    // Damos valor a las variables
    a = 4;
    b = 5;
    // Mostramos el resultado en pantalla
    System.out.print("(a * b) / 9 = ");      
    System.out.println((a * b) / 9);  

    // d) (((B + C) / 2 * A + 10) * 3 * B) – 6 (A=4, B=5, C=1)
    // Damos valor a las variables
    a = 4;
    b = 5;
    c = 1;
    // Mostramos el resultado en pantalla
    System.out.print("(((B + C) / 2 * A + 10) * 3 * B) = ");      
    System.out.println(((b + c) / 2 * a + 10) * 3 * b);


    // e) 3 > A && !C / 2 == 0. 5 (A=4, C=1)
    // Damos valor a las variables
    a = 4;
    c = 1;
    // Mostramos el resultado en pantalla
    System.out.print("3 > a && !c / 2 == 0.5 = ");      
    //System.out.println(3 > a && !c / 2 == 0.5);
    System.out.println("");

    // f) (A+ B) / 2 >= 3 || C != 20 (A=4, B=2, C= 20)
    // Damos valor a las variables
    a = 4;
    c = 1;
    // Mostramos el resultado en pantalla
    System.out.println("(a + b) / 2 || c != 20) = ");      
    //System.out.println((a + b) / 2 || c != 20);  
    
    // g) 5 + 25 % 2
    // Damos valor a las variables
    a = 4;
    c = 1;
    // Mostramos el resultado en pantalla
    System.out.print("5 + 25 % 2 = ");      
    System.out.println(5 + 25 % 2);
  }
}