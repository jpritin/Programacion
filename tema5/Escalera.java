public class Escalera {

	public static void main(String[] args) {
		final int MAX = 6;
		// Mostramos la primera escalera
		System.out.println("Primera escalera numérica");
		for (int i = 1; i <= MAX; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + "  ");
			System.out.println();
		}
        System.out.println();
		// Mostramos la segunda escalera
		System.out.println("Segunda escalera numérica");
		for (int i = 1; i <= MAX; i++) {
			// Pintamos en pantalla los espacios dentro de cada fila
			for (int j = MAX * 3 - i * 3; j > 0; j--)
				System.out.print(" ");
			// mostramos los números dentro de cada fila
			for (int k = i; k >= 1; k--)   
				System.out.print(k + "  ");
			System.out.println();
		}                
             		
	}
}