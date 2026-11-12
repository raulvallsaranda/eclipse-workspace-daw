package tema03.cadenes.exemples;

public class ExemplesFuncions {

	public static void main(String[] args) {
		
		String cadena = "Sargantana";
		
		/*if(cadena.endsWith("ana")) {
			System.out.println("comença per ana");
		} else {
			System.out.println("no comença per ana");
		}*/
		
		//System.out.println(cadena.replace("an","--"));
		//System.out.println(cadena.replaceFirst("in","--"));
		//System.out.println(cadena.replaceAll("Sar","e"));
		System.out.println(cadena.replace(".", "e"));
		/*String vocals = "AEIOU";
		
		String cadena = "HOLA";
		
		for(int i = 0;i<cadena.length();i++) {
			if(vocals.contains(""+cadena.charAt(i))) {
				System.out.println(cadena.charAt(i)+" vocal");
			} else {
				System.out.println(cadena.charAt(i)+" no vocal");
			}
		}*/
		
		
		

	}

}
