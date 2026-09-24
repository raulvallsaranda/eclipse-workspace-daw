package tema01.tipus.expressions;

public class ProvaConstants {

	// fora del main es pot indicar visibilitat (private/public/protected)
	private static final int ALUMNAT = 24;

	public static void main(String[] args) {
		final String INSTITUT = "IES Simarro"; // sense modificadors visibilitat
		System.out.println("Alumnat: " + ALUMNAT + ", Institut: " + INSTITUT);
	}

}
