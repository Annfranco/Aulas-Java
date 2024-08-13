package com.example;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(58484, "Paulo", 5000, Setor.FINANCEIRO, Sexo.MASCULINO, 35);

        System.out.println("Dados do Funcionário: ");
        System.out.println("ID: " + funcionario.getId());
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor());
        System.out.println("Sexo: " + funcionario.getSexo());
        System.out.println("Idade: " + funcionario.getIdade());
    }
}