package exercicis.tema03.cadenessenzills01;

public class Exercici07 {

	public static void main(String[] args) {
		int comptador = 0;
		int pos = 0;
		/*String cadena = "no hi havia a Gandia dos passants com nosaltres";
		String caracter ="n";*/
		/*String cadena = "Mallorca en l'horabaixa estival";
		String caracter ="l";*/
		String cadena = "1201.2110+56810-2941*02541";
		String caracter ="1";
		System.out.println("Cadena: "+cadena);
		System.out.println("Car�cter: "+caracter);
		
		//primer comptem quantes coincid�ncies hi ha amb el car�cter.
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==caracter.charAt(0)) {
				comptador++;
			}
		}
		//creem l'array
		String[] cadenes = new String[comptador];
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==caracter.charAt(0)) {
				if(i==cadena.length()-1) {
					cadenes[pos]=""+cadena.charAt(i);
					pos++;
				}else {
					cadenes[pos]=cadena.substring(i,i+2);
					pos++;
				}
				
			}
		}		
		//mostrem l'array
		for(int i=0;i<cadenes.length;i++) {
			System.out.println("Cadenes["+i+"]: "+cadenes[i]);
		}

	}

}
