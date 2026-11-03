package com.alumnes.traces;
//grabriela izabela
public class Traça02 {
    public static void main(String[] args) {
        String cad1 = "cadena";
        String cad2 = "hola";
        String cad3 = transform1(cad1);
        System.out.println(cad3);
    }

    public static String transform1(String cad2) {
        for (int i = cad2.length(); i > Math.pow(2, cad2.length() % 2); i--);
            System.out.println(cad2.substring(2).repeat(cad2.substring(2).length()));
        return transform2(cad2);
    }

    public static String transform2(String cad2) {
        for (int i = cad2.length() - 1; i >= 1; i--) {
            if (i % 2 == 0)
                cad2.replace(cad2.charAt(i), ' ');
            if (i == 1)
                cad2 += cad2.charAt(i + 4);
            if (i == 0)
                cad2 += cad2.charAt(i + 2);
        }
        return cad2;
    }
}
