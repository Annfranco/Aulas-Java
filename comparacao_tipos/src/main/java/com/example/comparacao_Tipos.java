package com.example;

/**
 * Hello world!
 *
 */
public class comparacao_Tipos 
{
    public static void main( String[] args ){
        // Declarando variaveis
        String nomeUsuario = "Marta";
        int senha = 123;

        // Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);

        // Exibindo resultado
        System.out.println("O nome do usuário está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
