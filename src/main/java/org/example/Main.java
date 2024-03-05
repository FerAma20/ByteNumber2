package org.example;

public class Main {
    public static void main(String[] args) {
       if(esPalindromo("omlmo")){
           System.out.println("La palabra ingresada es un palindromo");
       }else {
           System.out.println("La palabra ingresada no es un palindromo");
       }
    }

    public static boolean esPalindromo(String palabra) {
        int izquierda = 0;
        int derecha = palabra.length() - 1;

        while (izquierda < derecha) {

            if (palabra.charAt(izquierda) != palabra.charAt(derecha)) {
                return false;
            }
            izquierda++;
            derecha--;
        }
        return true;
    }
}