package com.alumnes.traces;
//Raúl, Jose Vila, Armán, Adrián
public class Traça03 {
	
	public static void main(String[] args) {
		Traça03 programa = new Traça03();
		
		programa.inicio();//Iniciamos la función
    }
	
	public void inicio() {
		crearTraza();
	}
	
	public void crearTraza() {
		//Declaramos las variables
		String[][] arrayCorazon = new String[5][5];
        int numero1 = 5;
        String rojo = "\033[31m";
        String resetear = "\u001B[0m";
        
        //Recorre el array y dibuja el corazon
        for (int i = 0; i < numero1; i++) {
            for (int j = 0; j < numero1; j++) {
                if ((i == 0 && (j == 1 || j == 3)) || 
                	(i == 1 && (j == 0 || j == 2 || j == 4)) ||
                	(i == 2 && (j == 0 || j == 4)) ||
                    (i == 3 && (j == 1 || j == 3)) ||
                    (i == 4 && j == 2)) {
                	
                    arrayCorazon[i][j] = rojo + "V";
                } else if ((i == 1 && (j == 1 || j == 3)) ||
                           (i == 3 && (j == 1 || j == 3))) {
                	
                    arrayCorazon[i][j] = resetear + "-";
                } else {
                    arrayCorazon[i][j] = resetear + "-";
                }

                System.out.print(arrayCorazon[i][j] + " ");
            }
            System.out.println();
        }
	}
}
