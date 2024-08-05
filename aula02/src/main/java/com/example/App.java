package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Scanner notas = new Scanner(System.in);

        String resultado;
        double media, primeiraNota, segundaNota;

        System.out.println("Primeira Nota: ");
        primeiraNota = notas.nextDouble();
        
        System.out.println("Segunda Nota: ");
        segundaNota = notas.nextDouble();

        media = (primeiraNota + segundaNota) / 2;

        if (media >= 7) {
            resultado = "Aprovado!";
        } else if (media >= 5) {
            resultado = "Verificação Suplementar";
        } else {
            resultado = "Reprovado.";
        }

        System.out.println("Média: " + media);
        System.out.println("Resultado: " + resultado);
    }
}
