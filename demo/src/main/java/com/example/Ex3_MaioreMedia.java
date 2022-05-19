package com.example;

import java.util.Scanner;

public class Ex3_MaioreMedia {

    public static void main(String[] args) {
        
    Scanner entrada = new Scanner(System.in);

    int numero;
    int count=0;
    int maior=0;
    int soma=0;

    do {

        System.out.println("Insira um numero: ");
        numero = entrada.nextInt();

        if (numero > maior ) maior = numero; 
        /* se o primeiro numero inserido for maior do q zero, ele passa a ser o valor da 
        variavel maior e assim sussetivamente, a variavel maior vai tendo o seu valor mudado */
        System.out.println("O maior numero é: " +maior);

        count = count + 1; 
        /*count esta se referindo a contabilização 
        da vez que o programa está rodando, assim toda vez ele soma mais 1
         Ex: 0, 1 , 2 , 3= o programa roudou 4 vezes  */

         soma = soma + numero;
         /* A soma se inicia com o valor zero e  cada numero inserido é atibuido a essa variavel, 
         fazendo assim a soma de todos os numeros */
         
    } while(count < 5);

    System.out.println("A soma dos numeros deu: " + soma + " A média dos numeros é: " 
         + soma/ 5);
}
}