package tema01.tipus.expressions;

public class Expressions {

	public static void main(String[] args) {
		int a=3;
		int b=8;
		int c=4;
		int d=2;
		
		//part a
		System.out.println("Resultats Part A Activitat Expressions:");
		System.out.println("---------------------------------------");
		System.out.println("Valors de les variables:");
		System.out.println("int a = 3, b=8, c=4, d=2;\n");
		try {
			int expressio01a = (2 - a * b + c) * 2 - a;
			System.out.println("1. (2 - a * b + c) * 2 - a => " + expressio01a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 1: "+e);
		}
		try {
			int expressio02a = ((2 - a) * b + c ) / 2 - (d * c - a);
			System.out.println("2. ((2 - a) * b + c ) / 2 - (d * c - a) => " + expressio02a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 1: "+e);
		}	
		
		try {
			int expressio03a = (a + b) / (b - 2* c) + 3 * (d + 7);
			System.out.println("3. (a + b) / (b - 2* c) + 3 * (d + 7) => " + expressio03a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 3: "+e);
		}
		try {
			int expressio04a = a * b - c * (a - d);
			System.out.println("4. a * b - c * (a - d) => " + expressio04a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 4: "+e);
		}
		try {
			int expressio05a = ((a / 3 - b) +7 ) * 2;
			System.out.println("5. ((a / 3 - b) +7 ) * 2 => " + expressio05a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 5: "+e);
		}
		try {
			int expressio06a = (a * (b - c * ( d - a * (2 - b))));
			System.out.println("6. (a * (b - c * ( d - a * (2 - b)))) => " + expressio06a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 6: "+e);
		}
		try {
			int expressio07a = a / (33 - b) + 8 / (c - d);
			System.out.println("7. a / (33 - b) + 8 / (c - d) => " + expressio07a);
		} catch (Exception e) {
			System.out.println("Error : Expressió 7: "+e);
		}
		try {
			int expressio08a = d * 23 - 1 + b * (d - 1 + a);
			System.out.println("8. d * 23 - 1 + b * (d - 1 + a) => " + expressio08a);

		} catch (Exception e) {
			System.out.println("Error : Expressió 8: "+e);
		}
		try {
			int expressio09a = d * d-3 * a *( c + 1) / (b - a);
			System.out.println("9. d * d-3 * a *( c + 1) / (b - a) => " + expressio09a);

		} catch (Exception e) {
			System.out.println("Error : Expressió 9: "+e);
		}
		try {
			int expressio10a = d + d * c - (b / a);
			System.out.println("10. d + d * c - (b / a) => " + expressio10a);

		} catch (Exception e) {
			System.out.println("Error : Expressió 10: "+e);
		}
		try {
			int expressio11a = (b / (4 * a) - c )/ a - 1;
			System.out.println("11. (b / (4 * a) - c )/ a - 1 => " + expressio11a);

		} catch (Exception e) {
			System.out.println("Error : Expressió 11: "+e);
		}
		try {
			int expressio12a = c * c * c - b * b + a / d + 1;
			System.out.println("12. c * c * c - b * b + a / d + 1 => " + expressio12a);

		} catch (Exception e) {
			System.out.println("Error : Expressió 12: "+e);
		}
		
		
		//part b
		boolean p=true;
		boolean q=false;
		//reassignem valors a a i b
		a = 5;
		b = 1;
		System.out.println("\nResultats Part B Activitat Expressions:");
		System.out.println("---------------------------------------");
		System.out.println("Valors de les variables:");
		System.out.println("boolean p = true, q=false;");
		System.out.println("int a = 5, b=1;\n");
		try {
			boolean expressio01b =  !p && !q && (5 * b == a);
			System.out.println("1. (2 - a * b + c) * 2 - a => " + expressio01b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 1: "+e);
		}
		
		try {
			boolean expressio02b =  !(8 > b) || (p && (q == (2 != 3)));
			System.out.println("2. !(8 > b) || (p && (q == (2 != 3))) => " + expressio02b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 2: "+e);
		}
		try {
			boolean expressio03b =  (5 * b == 3 * a) != (!p || q);
			System.out.println("3. (5 * b == 3 * a) != (!p || q) => " + expressio03b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 3: "+e);
		}
		try {
			boolean expressio04b =  (p && !p) || (q && !q);
			System.out.println("4. (p && !p) || (q && !q) => " + expressio04b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 4: "+e);
		}
		try {
			boolean expressio05b =  (p || !p || q || !q) && true && (b <=a);
			System.out.println("5. (p || !p || q || !q) && true && (b <=a) => " + expressio05b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 5: "+e);
		}
		try {
			boolean expressio06b =  (3 * b <= a - 2) && (p != (a > b));
			System.out.println("6. (3 * b <= a - 2) && (p != (a > b)) => " + expressio06b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 6: "+e);
		}
		try {
			boolean expressio07b =  (true && ( p || (!q && (b <=1))));
			System.out.println("7. (true && ( p || (!q && (b <=1)))) => " + expressio07b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 7: "+e);
		}
		try {
			boolean expressio08b =  ('a'<'b') || ((a > b) && (2 * a == 10 * b) && q);
			System.out.println("8. ('a'<'b') || ((a > b) && (2 * a == 10 * b) && q) => " + expressio08b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 8: "+e);
		}
		
		try {
			boolean expressio09b =  (true || !q) && (p != q) && ( (25 + b) < 3);
			System.out.println("9. (true || !q) && (p != q) && ( (25 + b) < 3) => " + expressio09b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 9: "+e);
		}
		try {
			boolean expressio10b =  ('q' > 'q') || (q == q) || (a == b);
			System.out.println("10. ('q' > 'q') || (q == q) || (a == b) => " + expressio10b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 10: "+e);
		}
		try {
			boolean expressio11b =  (!q == (a == b / 5)) || q;
			System.out.println("11. (!q == (a == b / 5)) || q => " + expressio11b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 11: "+e);
		}
		try {
			boolean expressio12b =  q || !p || (false == (3 != a)) || (a < 4 * b);
			System.out.println("12. q || !p || (false == (3 != a)) || (a < 4 * b) => " + expressio12b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 12: "+e);
		}
		try {
			boolean expressio13b =  ('q' + 'p' - 'a' - 'b' + 3 ) * a < a * a;
			System.out.println("13. ('q' + 'p' - 'a' - 'b' + 3 ) * a < a * a => " + expressio13b);
		} catch (Exception e) {
			System.out.println("Error : Expressió 13: "+e);
		}
		
	}

}
