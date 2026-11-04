package exercicis.tema03.traces;

public class Traces05 {

	public static void main(String[] args) {
		/********** Traça 1 ************/
		System.out.println("Traça 01:");
		System.out.println("---------");
		String ca = "Xàbia", cb = "Potries", cc = "";
		for (int i = 0; i < ca.length(); i++) {
			switch (i % 2) {
			case 0:
				cc += "" + ca.charAt(i);
				break;
			case 1:
				cc += "" + cb.charAt(i);
				break;
			}
		}
		for (int i = 0; i < cc.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(cc.charAt(cc.length() - i - 1));
			} else {
				System.out.println("\t" + cc.charAt(i));
			}
		}

		System.out.println("");
		/************* Traça 2 **************/
		System.out.println("Traça 02:");
		System.out.println("---------");
		String cad = "Sargantana";
		int k = 1;
		while (!cad.isEmpty()) {
			System.out.print(cad.lastIndexOf('a'));
			System.out.println("*".repeat(cad.length()/2));
			cad = cad.substring(k++);
		}

		System.out.println();
		/************* Traça 3 **************/
		System.out.println("Traça 03:");
		System.out.println("---------");
		String VOC = "aeiou", frase = "Ahir no estaves tu";
		int compta = 0;
		for(int i = 0;i<frase.length();i++) {
			if(VOC.contains(String.valueOf(frase.charAt(i)))) {
				System.out.print("-".repeat(compta++));
				if(i%2==0) System.out.println((""+frase.charAt(i)).toUpperCase());
				else System.out.println(frase.charAt(i));
			}
		}
		

		System.out.println();
		/************* Traça 4 **************/
		System.out.println("Traça 04:");
		System.out.println("---------");
		String frase2 = "Un punt de llum un pou de pors";
		String sort="";
		String[] array = frase2.split(" ");
		for(String s: array) { 
			if(s.length()>2) sort+=s.substring(s.length()-1,s.length());
			else sort+="*";
		}
		System.out.println(sort);

		System.out.println();
		/************* Traça 5 **************/
		System.out.println("Traça 05:");
		System.out.println("---------");
		String cd = "CórrerPelsCamps";
		int n =5;
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i%2==1) {
					if(j%2==0) 	System.out.print('^');
					else System.out.print(cd.charAt(cd.length()-1));
				}else {
					if(j%2==0) {
						System.out.print((""+cd.charAt(j+i)).toUpperCase());
					} else {
						if(j<=n/2) System.out.print('>');
						else System.out.print('<');
					}
				}
			}
			System.out.println();
		}
		

	}

}
