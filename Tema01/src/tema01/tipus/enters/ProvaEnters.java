package tema01.tipus.enters;

public class ProvaEnters {

	public static void main(String[] args) {
		
		
		//declaració de variables
		byte edat = -128; //8 bits
		edat = (byte) (edat + 100); //casting
		
		short poblacio = (short) 40000;
		
		int cens = 24_567_857;
		
		long particules = 2300000000000000000L;
		
		System.out.println("edat: "+edat+" anys");
		
		System.out.println("poblacio: "+poblacio+" habitants");

		System.out.println("cens: "+cens+" persones");
		
		


	}

}
