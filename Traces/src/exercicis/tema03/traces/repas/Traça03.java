package exercicis.tema03.traces.repas;

/* cadenes */
public class Traça03 {

	public static void main(String[] args) {
		Traça03 programa = new Traça03();
		programa.inici();
	}

	public void inici() {
		traça1();
		traça2();
		traça3();
		traça4();
		traça5();
	}

	public void traça1() {
		System.out.println("Traça 01:");
		System.out.println("*********");
		String cadena = "arrabassar";
		int c = 0, r = 0, p = 0;
		for (int i = 0; i < cadena.length(); i++)
			if (cadena.charAt(i) == 'a' || cadena.charAt(i) == 'r') c++;		
		int[] a = new int[c];
		for (int i = 0; i < cadena.length(); i++)
			switch (cadena.charAt(i)) {
			case 'a' -> {a[p] = 1;p++;}
			case 'r' -> {a[p] = 2;p++;}
			default -> {System.out.print((char) (cadena.charAt(i)-32));}
			//default -> {System.out.print((""+cadena.charAt(i)).toUpperCase());}
			}
		for (int i = 0; i < a.length; i++)
			if(i%2==0) r*=a[i];
			else r+=a[i];
		System.out.println(r);

	}
	public void traça2() {
		System.out.println("Traça 02:");
		System.out.println("*********");
		String[] cads = {"on","the","chaise","longue"};
		int r = 0;
		String s ="";
		for(String cad : cads) 
			if(!cad.contains("o"))
				for(int i=cad.length()-1;i>=0;i--) {
					s+=cad.charAt(i);
					if("aeiou".contains(""+cad.charAt(i))) r+=1;
					else r+=2;
				}
		System.out.println(s+r);
	}
	public void traça3() {
		System.out.println("Traça 03:");
		System.out.println("*********");
		String titol = "el poder dEl volEr";
		String[] parts = titol.split(" ");
		String r = "";
		for(int i=0;i<parts.length;i++) {
			r+=parts[i].lastIndexOf("e");			
			if((i!=parts.length-1)){				
				if(parts[i].charAt(parts[i].length()-2) ==
				   parts[i+1].charAt(parts[i+1].length()-2)) {
					r+="X";
				}
			}
		}
		System.out.println(r);
	}
	
	public void traça4() {
		System.out.println("Traça 04:");
		System.out.println("*********");
		String s = "Illes Caiman";
		System.out.println(s.repeat(s.lastIndexOf("l")).
						   replaceAll("l","").
						   substring(s.indexOf("C"),s.length()+1));
	}
	public void traça5() {
		System.out.println("Traça 05:");
		System.out.println("*********");
		int n=6;
		String f = "";
		for (int i=0;i<n;i++) {
			f+="-".repeat(n-i-1);
			for(int j=0;j<i+1;j++)
				if(j==0 || j==i) f+="*";
				else f+="-";
			f+="\n";
		}
		System.out.println(f);
	}
	

}
