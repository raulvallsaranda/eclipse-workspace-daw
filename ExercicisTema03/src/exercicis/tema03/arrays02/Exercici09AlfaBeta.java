package exercicis.tema03.arrays02;

public class Exercici09AlfaBeta {

	private static final String[] LLETRES = { "ALFA", "BETA", "GAMMA", "DELTA" };

	public static void main(String[] args) {

		// matriu 2 x 2
		String[][] matriu = new String[2][2];
		int comptadorArray = 0;
		String[] aux = new String[LLETRES.length];
		String lletraAux = "";
		// copiem el contingut
		for (int i = 0; i < aux.length; i++) {
			aux[i] = LLETRES[i];
		}
		
		//mostrem aux
		/*System.out.println();
		System.out.print("aux inicial: ");
		for(int i=0;i<aux.length;i++) {
			System.out.print(aux[i]+" ");
		}
		System.out.println();*/
		

		System.out.print("LLETRES inicial: ");
		for(int i=0;i<LLETRES.length;i++) {
			System.out.print(LLETRES[i]+" ");
		}
		System.out.println("");
		System.out.println();

		for (int compta = 1; compta <= aux.length; compta++) {
			System.out.println("Matriu " + compta + ":");
			// en cada iteració es genera una matriu
			comptadorArray=0;
			for (int i = 0; i < aux.length / 2; i++) {
				for (int j = 0; j < aux.length / 2; j++) {
					matriu[i][j] = aux[comptadorArray];
					comptadorArray++;
				}
			}
			// i la mostra
			for (int i = 0; i < matriu.length; i++) {
				for (int j = 0; j < matriu[i].length; j++) {
					System.out.print(matriu[i][j] + " ");
				}
				System.out.println();
			}

			// rotació de lletres
			
			for (int i = 0; i < aux.length; i++) {
				aux[i]=LLETRES[(LLETRES.length-compta+i)%LLETRES.length];
			}
			
			
			
			//mostrem aux

			/*System.out.print("Nou aux: ");
			for(int i=0;i<aux.length;i++) {
				System.out.print(aux[i]+" ");
			}
			System.out.println();*/
			System.out.println();
		}

	}

}
