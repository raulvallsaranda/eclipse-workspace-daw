package com.alumnes.traces;
//Rebeca i Josep

public class Traça01 {
    public static void main(String[] args) {
        int tamaño = 7;
        imprimir(tamaño);
    }

    static void imprimir(int tamaño) {
        if (tamaño % 2 == 0) {
            System.out.println("El tamaño debe ser impar para que la cruz sea simétrica.");
            return;
        }

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == tamaño / 2 || j == tamaño / 2) {
                    System.out.print("|");
                } else if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


