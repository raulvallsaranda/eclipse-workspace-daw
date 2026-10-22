package tema03.arrays.exemples;

import java.util.Random;

public class ProvaComptaNotes {
	
	private static final int QUANTITAT_NOTES = 50;

	public static void main(String[] args) {
		//declaracions
		//float[] arrayNotes= {4.9f, 5.5f, 9f, 10f, 6.7f, 8.2f, 7.5f, 5f, 8.3f, 5.1f, 9f, 7f};
		
		float[] arrayNotes = new float[QUANTITAT_NOTES];
		Random aleatori = new Random();
		for(int i = 0;i<arrayNotes.length;i++) {
			arrayNotes[i] = aleatori.nextFloat(0,10);
		}
		//1 posició per a cada rang de notes:
		int[] quantitatsNotes = new int[5];
		
		//operar (comptar notes per rangs)
		for(int i=0;i<arrayNotes.length;i++) {
			
			if(arrayNotes[i]<5) {
				quantitatsNotes[0]++; //suspés
			}else if(arrayNotes[i]<6) {
				quantitatsNotes[1]++; // aprovat
			}else if(arrayNotes[i]<7) {
				quantitatsNotes[2]++; // bé
			}else if(arrayNotes[i]<9) {
				quantitatsNotes[3]++; // notable
			}else {
				quantitatsNotes[4]++; //excel·lent
			}			
		}
		
		
		//mostrar resultat
		System.out.println("Histograma de notes");
		System.out.println("-------------------");

		for(int i=0;i<quantitatsNotes.length;i++) {
			
			switch(i) {
			case 0:
				System.out.print("Suspesos    :");				
				break;
			case 1:
				System.out.print("Aprovats    :");				
				break;
			case 2:
				System.out.print("Bé          :");				
				break;
			case 3:
				System.out.print("Notables    :");				
				break;
			case 4:
				System.out.print("Excel·lents :");				
				break;
			}
			
			for(int j=0;j<quantitatsNotes[i];j++) {
				System.out.print('*');
			}
			
			System.out.println();
			
		}

	}

}
