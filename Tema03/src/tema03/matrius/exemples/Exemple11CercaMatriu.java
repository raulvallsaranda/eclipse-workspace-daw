package tema03.matrius.exemples;

public class Exemple11CercaMatriu {
	
	private static final float NOTA = 0.0f;

	public static void main(String[] args) {
		
		//variables
		boolean trobat = false;
		int comptador = 0;
		//int i = 0;
		//int j = 0;
		
		//matriu
		float[][] matriuNotes = {
				{ 4.5f, 6f , 5f , 8f },
				{ 10f , 8f , 7.5f, 9.5f},
				{ 3f , 2.5f, 0f, 6f },
				{ 6f , 8.5f, 6f , 4f },
				{ 9f , 7.5f, 7f , 8f }
				};
		
		
		//buscar nota en matriu
		/*for (int i = 0; i < matriuNotes.length; i++) { // recórrer files
			for (int j = 0; j < matriuNotes[i].length; j++) { // recórrer columnes
				if(matriuNotes[i][j]==NOTA) {
					trobat = true;
					break;
				}
				comptador++;
				
			}
			if(trobat==true) {
				break;
			}
		}*/
		
		/*while(i<matriuNotes.length && !trobat) {
			j=0;
			while(j<matriuNotes[i].length && !trobat) {
				comptador++;
				if(matriuNotes[i][j]==NOTA) {
					trobat=true;
				}
				j++;
			}
			i++;
		}*/
		
		for (int i = 0; i < matriuNotes.length && !trobat; i++) { // recórrer files
			for (int j = 0; j < matriuNotes[i].length && !trobat; j++) { // recórrer columnes
				if(matriuNotes[i][j]==NOTA) {
					trobat = true;
				}
				comptador++;
				
			}
		}
		
		
		//indicar si està o no està
		if (trobat) {
			System.out.println("S'ha trobat "+NOTA+" en la matriu");
		} else {
			System.out.println("No s'ha trobat "+NOTA+" en la matriu");
		}
		System.out.println("Quantitat de comparacions: "+comptador);
		
	}

}
