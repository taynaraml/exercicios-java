package com.example;

/*
Exercicio que receba nome e idade e que dinalize quando o valor de idade for igual a 0
*/ 


import java.util.Scanner;

public class Ex1_NomeIdade {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

            String nome;
            int idade;

            while (true){
            System.out.println("Nome: ");
            nome = entrada.next();

            if (nome.equals("0")) break;
            
            System.out.println("Idade: ");
            idade = entrada.nextInt();
    

            System.out.println("Seu nome é: " +nome+ " e sua idade é: " + idade);
        }

    }
}