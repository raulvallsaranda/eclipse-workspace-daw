package tema03.cadenes.exemples;

public class ProvaString {

	public static void main(String[] args) {
		String s1 = "Java"; // es crea en el pool, un objecte nou. Dins del heap.
		String s2 = "Java"; // no crea un objecte nou, ja està en el pool
		String s3 = new String("Java"); // es crea fora del pool, en el heap
		String s4 = new String("Java"); // es crea fora del pool, en el heap
		String s5 = new String("Java").intern(); // força la creació en el pool
		System.out.println("Comparació s1 i s2: " + (s1 == s2)); // true
		System.out.println("Comparació s1 i s3: " + (s1 == s3)); // false
		System.out.println("Comparació s1 i s4: " + (s1 == s4)); // false
		System.out.println("Comparació s1 i s5: " + (s1 == s5)); // true
		s2 = s1; // l’apuntador de s2 apunta al mateix lloc que el de s1
		System.out.println("s1: " + s1 + " , s2: " + s2); // són la mateixa cadena
		s1 = "Cadena"; // canviem el valor de s1, es crea un nou apuntador
		System.out.println("s1: " + s1 + " , s2: " + s2); // canvia s1, però s2 es manté igual
		System.out.println("Comparació s1 i s2: " + (s1 == s2)); // true

	}

}
