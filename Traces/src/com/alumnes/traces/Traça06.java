package com.alumnes.traces;
// Vicent B.A. i Guillem
public class Traça06 {

    public static void main(String[] args) {
        int filas = 5;    
        int columnas = 10;
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i==0||i==filas-1) {
				System.out.print("O ");
				}else {
					if (j==0||j==columnas-1) {
						System.out.print("O ");
					}else {
						System.out.print("X ");
					}
				}
            }
            System.out.println();
        }
    }
}

