package com.alumnes.traces;
//Pau
public class Traça07 {

	public static void main(String[] args) {

		String red = "\033[31m";
		String green = "\033[32m";
		String yellow = "\033[33m";
		String reset = "\u001B[0m";
		int o = 0;
        
		for (int i = 0; i < 10; o+=2, i++)
            switch (i % 3) {
                case 0: {
                    if (o % 2 == 0) {
                        o -= i + 1;
                    } else {
                        o += i;
                    }
                    break;
                }
                case 1: {
                    if (o % 2 == 0) {
                        o -= i;
                    } else {
                        o += i;
                    }
                    break;
                }
                default: {
                    if (o % 2 == 0) {
                        o -= i;
                    } else {
                        o += i + 1;
                    }
                    break;
                }
            }
        
        o+=6;
        
        System.out.println(yellow + " ".repeat(o) + "*" + reset);
        
        for (int j = o-1, k = 0; j > 1; j--, k++) {
			System.out.println(green + " ".repeat(j) + "*" + " ".repeat(k*2+1) + "*");
		}
		
        for (int l = 0; l < o-1; l++) {
        	if (l == 0) {
        		System.out.print(" " + "*".repeat(l+2));
        	} else if (l == (o/3)*2) {
        		System.out.print("*".repeat(o/2) + reset);
        	} else {
				System.out.print("*".repeat(2));
			}
		}
        
		for (int m = 0; m < Math.pow(o, 0); m++) {
			System.out.println(red + "\n" + " ".repeat(o) + "|" + reset);
		}
		
	}
}