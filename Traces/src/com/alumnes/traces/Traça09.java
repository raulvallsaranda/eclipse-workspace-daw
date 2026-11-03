package com.alumnes.traces;

//Manel, Enrique i  Vicent B.M.
import java.util.Scanner;

public class Traça09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Traça09 programa = new Traça09();
		programa.inicio();
	}

	public void inicio() {
		String cad = "sargantana";
		String cadena = xcjwdeinl(fxyemv(cad));
		char[] si = { 'a', 'b', 't', 'r', 'o' };
		String cadd = "" + si[2] + si[3] + si[4] + si[2] + si[0];
		String metodo = cadd + cadena;
		metodePrimer(metodo);
		metodeBorrar(cad);
		System.out.println("\n\t||||");
		System.out.println("\t||||");
	}

	public void metodeBorrar(String cad) {
		System.out
				.print(cad.substring(cad.indexOf('s'), (cad.indexOf('s')) + 1) + cad.substring((cad.indexOf('s')) + 1));
		for (int p = cad.length() - 1; p >= 0; p--) {
			System.out.print(cad.charAt(p));
		}
	}

	public void metodePrimer(String cad) {
		for (int i = 0; i < cad.length(); i++) {
			System.out.print(" ");
			esclavo(cad, i);
		}
	}

	public void esclavo(String cad, int i) {
		int j = 0;
		for (j = cad.length() - 1; j > i; j--)
			System.out.print(" ");
		System.out.println(cad.charAt(i) + borra(j, cad.charAt(i)) + cad.charAt(i));
	}

	public String borra(int x, char c) {
		if (x % 3 == 0)
			return ("" + c).repeat(x * 2);
		else
			return " ".repeat(x * 2);
	}

	public String xcjwdeinl(String fxyemv) {
		String integer = "AdeuMon";
		char[] si = { 'a', 'b', 't', 'r', 'o' };
		integer = "" + si[2] + si[3] + si[4] + si[2] + si[0];
		for (int po = 0; po < 9; po++) {
			integer = "" + si[3] + si[4] + si[2] + si[0];
		}
		return integer;
	}

	public String fxyemv(String cad) {
		int h = 0;
		while (h < 1) {
			if (0 == 0) {
				if (0 == h) {
					if (h == 0 && (h + 1 * 3) % 3 == h) {
						for (; h < 10; h++) {
							h++;
						}
						h = 1;
						if (h == 12) {
						} else if (h == 9 || h == 2342) {
						} else {
							int j = 99;
							while (j > 0) {
								j--;
							}
							h = 1;
						}
					}
				}
			}
		}
		System.out.println("\t" + " " + "\u2605".repeat(h + 1));
		System.out.println("\t" + "" + "\u2605".repeat((h + 1 * 2) + 1));
		System.out.println("\t" + " " + "\u2605".repeat(((h + 1 * 2) + 2) / 2));
		return cad;
	}
}