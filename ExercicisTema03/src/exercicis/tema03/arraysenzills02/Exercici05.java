package exercicis.tema03.arraysenzills02;

public class Exercici05 {

	public static final int LONGITUD_ARRAY = 50;
	public static final int LONGITUD_FILA = 5;

	public static void main(String[] args) {
		// declarem l'array
		long[] fibonacci = new long[LONGITUD_ARRAY];

		// inicialitzem els 2 primers valors
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		// generem la resta de valors de l'array:
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		// el mostrem per pantalla
		// mostrem array de 40 en 40
		for (int i = 0; i < fibonacci.length; i++) {
			if ((i + 1) % LONGITUD_FILA == 0) {
				System.out.println(fibonacci[i]);
			} else {
				System.out.print(fibonacci[i]+" ");
			}
		}
	}

}
