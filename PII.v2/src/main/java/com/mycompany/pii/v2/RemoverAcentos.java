/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pii.v2;
import java.text.Normalizer;

public class RemoverAcentos {
    public static String removerAcentos(String texto) {
        // Normalizar a string usando Normalizer
        String normalizado = Normalizer.normalize(texto, Normalizer.Form.NFD);

        // Remover os caracteres que não são letras
        String semAcentos = normalizado.replaceAll("\\p{M}", "");

        return semAcentos;
    }
}
