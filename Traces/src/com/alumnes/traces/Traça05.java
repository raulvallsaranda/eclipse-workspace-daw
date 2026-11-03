package com.alumnes.traces;

//Pablo i Pepe
public class Traça05 {

	private String cad = "FSR7REHEP7WEVKERXERIWBBB";

	public static void main(String[] args) {
		Traça05 programa = new Traça05();
		programa.inici();
	}

	public void inici() {
		int n1 = 6;
		String[][] mat = new String[metodePrimer(n1)][cad.length() / 2];
		metodeSegon(mat);
		metodeTercer(mat);
	}

	public int metodePrimer(int n1) {
		int n2 = n1;
		for (int i = 0; i < cad.substring(3, 8).length(); i++) {
			if (i % n1 / 2 != 1) {
				n2 += n1;
			} else {
				n1 = n2 / 4 - (i - 1) + n1 - 1;
			}
		}
		return n1;
	}

	public void metodeSegon(String[][] mat) {
		int n3 = 0;
		int asteriscos = 0;
		int espacios = 0;
		int conjuntoEspacios = 0;
		boolean operacionRealizada = false;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {

				n3 = 0;

				if ((i == 0 || i == 2) ^ (j != 5 || j != 6)) {
					n3 = 0;
				} else {
					if ((i == 0 && j == 5) || (i == 2 && j == 6)) {
						n3 = 1;
					} else if ((i == 2 && j == 5) || (i == 0 && j == 6)) {
						n3 = 2;
					} else {
						n3 = 0;
					}
				}

				if (i == 1) {

					if (conjuntoEspacios == 1 && espacios == 3 && operacionRealizada == false) {
						n3 = 3;
						espacios = 0;
						operacionRealizada = true;
					} else if (conjuntoEspacios == 2 && espacios == 4) {
						n3 = 4;
						espacios = 0;
					} else {
						n3 = 0;
						espacios++;
					}

					if (espacios == 3 && conjuntoEspacios == 0) {
						conjuntoEspacios++;

					} else if (espacios == 4 && conjuntoEspacios != 0) {
						conjuntoEspacios++;
					}

				}

				if (i == 3 || i == 4 || i == 5) {
					if (asteriscos < 2) {
						if (j < 5 && j > 6) {
							n3 = 0;
						} else if (j >= 5 && j <= 6) {
							n3 = 5;
							asteriscos++;
						}
					} else if (asteriscos >= 2 && asteriscos < 6 && i != 3) {
						if (j < 4 && j > 7) {
							n3 = 0;
						} else if (j >= 4 && j <= 7) {
							n3 = 5;
							asteriscos++;
						}
					} else if (asteriscos >= 6 && i != 4) {
						if (j < 3 && j > 8) {
							n3 = 0;
						} else if (j >= 3 && j <= 8) {
							n3 = 5;
							asteriscos++;
						}
					}
				}

				if (i == 6) {
					if (j == i - 1 + n3 || j == (cad.length() + 1) / 4) {
						n3 = 6;
					} else {
						n3 = 0;
					}
				}

				if (i == 7 || i == 8) {
					if (j <= 3) {
						if (j % 2 == 0) {
							n3 = Integer.parseInt("" + cad.charAt(3));
						} else {
							n3 = cad.substring(2, 9).length();
						}

					} else if (j >= 7) {
						n3 = 7;

					} else {
						switch (i) {
						case 7:
							n3 = i;
							break;
						case 8:
							n3 = i;
						default:
							n3 += 7 - i;
						}
					}
				}

				switch (n3) {
				case 0:
					mat[i][j] = " ";
					break;

				case 1:
					mat[i][j] = "/";
					break;

				case 2:
					mat[i][j] = "\\";
					break;

				case 3:
					mat[i][j] = "<";
					break;

				case 4:
					mat[i][j] = ">";
					break;

				case 5:
					mat[i][j] = "*";
					break;

				case 6:
					mat[i][j] = "|";
					break;

				case 7:
					mat[i][j] = "-";
					break;

				}

			}
		}

	}

	public void metodeTercer(String[][] mat) {

		char[][] fraseFinal = new char[cad.replace("B", "!").split("7").length][];
		String[] aux = cad.replace("B", "!").split("7");
		int charASCII = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < aux.length; i++) {
			fraseFinal[i] = aux[i].toCharArray();
		}

		for (int i = 0; i < fraseFinal.length; i++) {
			for (int j = 0; j < fraseFinal[i].length; j++) {
				if (fraseFinal[i][j] != '!') {
					charASCII = fraseFinal[i][j];
					charASCII = charASCII - 4;
					char caracter = (char) charASCII;
					fraseFinal[i][j] = caracter;
				} else {

				}

			}
		}
		for (int i = 0; i < fraseFinal.length; i++) {
			System.out.print(fraseFinal[i]);
			System.out.print(" ");
		}
	}
}