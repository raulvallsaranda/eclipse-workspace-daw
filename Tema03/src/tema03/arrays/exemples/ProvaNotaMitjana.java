package tema03.arrays.exemples;

public class ProvaNotaMitjana {

	public static void main(String[] args) {
		//array de notes
		float[] arrayNotes= {4.9f, 5.5f, 9f, 10f, 6.7f, 8.2f, 7.5f, 5f, 8.3f, 5.1f, 9f, 7f};
		float sumaNotes = 0.0f;
		float mitjana = 0.0f;
		//obtenim la suma de les notes (for)
		/*for(int i=0;i<arrayNotes.length;i++) {
			sumaNotes = sumaNotes + arrayNotes[i];
		}*/
		
		for(float nota : arrayNotes) {
			sumaNotes = sumaNotes +nota;
		}
		
		//calculem la mitjana
		mitjana = sumaNotes / arrayNotes.length;
		
		
		//mostrem l'array de les notes
		System.out.print("Notes: [");
		for (int i=0; i<arrayNotes.length; i++) {
			if(i==arrayNotes.length-1) {
				System.out.print(arrayNotes[i]);
			} else {
				System.out.print(arrayNotes[i]+", ");
			}
		}
		System.out.println("]");
		
		
		//mostrem la mitjana
		System.out.println("Mitjana: "+mitjana);

	}

}
