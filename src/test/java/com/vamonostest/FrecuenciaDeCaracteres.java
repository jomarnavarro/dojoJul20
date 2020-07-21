package com.vamonostest;

import java.util.HashMap;
import java.util.Map;

public class FrecuenciaDeCaracteres {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<String,Integer>();
        String cadena = "una mosca pegada en la pared, en la pared, con su mujer";
        for(int i = 0; i < cadena.length(); i++) {
           String caracterActual = cadena.charAt(i) + "";
           if(freq.containsKey(caracterActual)) {
               int frecuenciaActual = freq.get(caracterActual);
               freq.put(caracterActual, frecuenciaActual + 1);
           } else {
               freq.put(caracterActual, 1);
           }
        }
        String unico = "";
        String repetido = "";
        for(String key: freq.keySet()) {
            if(freq.get(key) == 1) {
                unico = unico + key;
            } else  {
                repetido += key;
            }

            System.out.println("La letra " + key + " esta repetida " + freq.get(key) + " vez(es)");
        }
        System.out.println("Letras unicas: " + unico);
        System.out.println("Letras repetidas: " + repetido);
    }
}
