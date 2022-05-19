package com.example;

import java.util.Scanner;

public class Ex2_Nota {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int nota;

            System.out.println("Insira uma nota de 0 a 10: ");
            nota = entrada.nextInt();
              
            while (nota <0 | nota >10) {

                System.out.println("Nota invalida. Digite novamente");
                nota = entrada.nextInt();
                
            }
           
        }
        

    }
