
package com.bandtec.lista.nivelamento.resolucao;

import java.util.Scanner;

public class Potencia {
    
     public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor base:");
        Integer base = leitor.nextInt();
        Integer total = base;

        System.out.println("Digite o expoente:");
        Integer expoente = leitor.nextInt();

        for (Integer i = 1; i < expoente; i++) {
            total *= base;
        }

        System.out.println(total);
        
        //Bônus:
        //Pra tirar a dúvida, o método abaixo cálcula a potência automaticamente.
        System.out.println(Math.pow(base, expoente));
    }
}
