package tema03.arrays.exemples;

import java.util.Scanner;

public class CanviMidaArray {
	public static final int MAX_VALORS = 5;

	public static void main(String[] args) {
		// D'entrada, la mida serà 5.
		// S'escull un valor molt baix perquè de seguida es force el canvi de mida.
		float[] arrayNotes = new float[MAX_VALORS];
		// Cal un comptador de posicions en què hi ha valors vàlids.
		int elements = 0;
		//per llegir les notes que s'introdueixen
		float nota;
		//semàfor per comprovar quan l'usuari vol acabar
		boolean marcaFi = false;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Vés escrivint notes (valors reals entre 0 i 10).");
		System.out.println("En pots escriure diversos en una sola línia, separats per espais.");
		// Caldrà alguna manera de saber que s'ha acabat d'escriure.
		System.out.println("(Per acabar, escriu un -1)");
		// Anar llegint fins a trobar la marca de fi. Però el màxim és la mida de l'array.
		// Si s'entren més valors, canviem la mida de l'array i continuem llegint.
		// Estructura de repetició amb semàfor.
		
		while (!marcaFi) {
			// Hi ha un real?
			if (entrada.hasNextFloat()) {
				// Cal veure si és un valor vàlid o final de seqüència.
				nota = entrada.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					// Tot correcte. Però hi ha lloc a l'array?
					if (elements == arrayNotes.length) {
						// Cal canviar la mida de l'array. Es fa 5 posicions més llarg.
						// Per veure quan succeeix, avisem per pantalla.
						System.out.println("Capacitat superada. Afegim " + MAX_VALORS + " posicions...");
						float[] arrayNou = new float[arrayNotes.length + MAX_VALORS];
						for (int i = 0; i < arrayNotes.length; i++) {
							arrayNou[i] = arrayNotes[i];
						}
						arrayNotes = arrayNou;
					}
					// Afegim el nou valor. Segur que hi ha lloc.
					arrayNotes[elements] = nota;
					System.out.println("arrayNotes["+elements+"] = "+nota);
					elements++;
				} else if (nota == -1) {
					// Marca de final, eixim del bucle.
					//break; //podríem fer-ho així.
					marcaFi = true;
				} else {
					System.out.println("El valor introduït no és una nota vàlida.");
				}
				// Si no és ni una cosa ni l'altra, ho ignorem.
			} else {
				// Si no era un real, l'ignorem.
				System.out.println("El valor introduït no és numèric.");
				entrada.next();
			}
		}
		// Ignorem els valors sobrants de la darrera línia.
		entrada.nextLine();
		System.out.println("Longitud de l'array: "+arrayNotes.length);
		System.out.println("Hi ha emmagatzemats " + elements + " elements: ");
		for (int i = 0; i < elements; i++) {
			System.out.print(arrayNotes[i]+" ");
		}
		//Tanquem Scanner
		entrada.close();
	}
}