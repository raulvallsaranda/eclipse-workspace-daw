package tema03.cadenes.exemples;

public class ExemplesFuncions {

	public static void main(String[] args) {
		
		String vocals = "AEIOU";
		
		String cadena = "HOLA";
		
		for(int i = 0;i<cadena.length();i++) {
			if(vocals.contains(""+cadena.charAt(i))) {
				System.out.println(cadena.charAt(i)+" vocal");
			} else {
				System.out.println(cadena.charAt(i)+" no vocal");
			}
		}
		

	}

}
