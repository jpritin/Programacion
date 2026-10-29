import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        final int MAX_PRIMOS = 50;        
        int num, cont;
        boolean esPrimo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Lista de los " + MAX_PRIMOS + " primeros números primos");
        num = 2;
        cont = 0;
        while ( cont < MAX_PRIMOS ) {
            // averiguamos si num es primo
            esPrimo = true;
            if ( num <= 1 )
                esPrimo = false;
            else {
                for( int i = 2; i < num; i++)
                    if( num % i == 0 )
                        esPrimo = false;
            }
            if ( esPrimo ) {
                cont++;
                if (cont == MAX_PRIMOS)
                    System.out.print(num);
                else
                    System.out.print(num + ", ");
            }
            num++;
        }
        sc.close();
    }
}