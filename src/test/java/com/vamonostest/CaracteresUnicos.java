package com.vamonostest;

import com.vamonostest.libs.Input;

public class CaracteresUnicos {
    public static void main(String[] args) {
        String cadena = pedirleFraseAlUsuario().toUpperCase();
        for(int i = 0; i < cadena.length(); i++) {
            char actual = cadena.charAt(i);
            if(esUnico(cadena, actual))
                System.out.println("El caracter " + cadena.charAt(i) + " es unico.");
            else {
                System.out.println("El caracter " + cadena.charAt(i) + " es repetido.");
            }
        }
        System.out.println();
    }

    private static boolean esUnico(String cadena, char actual) {
        if (cadena != null) {
            int numCoincidencias = 0;
            for(int i = 0; i < cadena.length(); i++) {
                char este = cadena.charAt(i);
                if(actual == este) {
                    numCoincidencias++;
                }
            }
            if(numCoincidencias == 1)
                return true;
            else
                return false;

        } else {
            return false;
        }

    }

    private static String pedirleFraseAlUsuario() {
        System.out.println("Ingresa una frase: ");
       return Input.get_string();
    }
}
// probar caracters diferetes de streing numeros, simbolos, mayusculas , minuculas, cadena vacia.
//probar simbolos, caracterres especiales, comas , puntos, mayusculas y minusculas,