package com.example;

/**
 * Hello world!
 *
 */
public class metodos_string 
{
    public static void main( String[] args ){
        
        String nome = "Marta";
        String sobrenome = "Silveira";

        // Exibindo a quantidade de caracteres
        System.out.println("Tamanho do nome: " + nome.length());
        System.out.println("Tamanho do sobrenome: " + sobrenome.length());

        // Concatenando nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);

        // Exibindo nome completo usando métodos strings - Maiúsculas
        System.out.println("Concatenação Maiúsculas: " + nomeCompleto.toUpperCase());
    
        // Exibindo nome completo usando métodos strings - Minúsculas
        System.out.println("Concatenação Minúscula: " + nomeCompleto.toLowerCase());
    }
}
