package tema01.tipus.boolea;

public class ProvaBoolean {
	public static void main(String[] args) {

		// declaracions de variables;

		boolean p = true;
		boolean q = false;

		// AND OR NOT XOR

		boolean operacioAnd = p && q;
		boolean operacioOr = p || q;

		System.out.println("p : " + p);
		System.out.println("q : " + q);

		System.out.println("Operació AND: " + operacioAnd);
		System.out.println("Operació OR: " + operacioOr);
		System.out.println("Operació XOR: "+ (p ^ q));
		System.out.println("Operació !p: "+ (!p));
		
		boolean operacioComplexa = ((operacioAnd && operacioOr) || (!p && !q));

		System.out.println("Operació Complexa: "+ operacioComplexa);

	}

}
