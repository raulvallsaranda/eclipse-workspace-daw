package tema01.tipus.boolea;

public class ProvaOperacions {

	public static void main(String[] args) {
		
		System.out.println("Proves operacions boolean:");
		System.out.println("--------------------------");

		System.out.println("!true: "+!true);
		System.out.println("true && true: "+(true && true));
		System.out.println(true && false);
		System.out.println(true || false || true || false);
		System.out.println(false || false);
		System.out.println(false == false);
		System.out.println(false != true);
	}

}
