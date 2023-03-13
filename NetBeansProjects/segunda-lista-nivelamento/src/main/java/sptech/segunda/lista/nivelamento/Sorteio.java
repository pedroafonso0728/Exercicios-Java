/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.nivelamento;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mayar
 */
public class Sorteio {
            
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 100: ");
        Integer numero = leitor.nextInt();
        Integer numerosPares = 0;
        Integer numerosImpares = 0;
        Integer posicao = 0;
        
        
        Integer numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
        
        Boolean numeroSorteado = true;
        
        
        int i = 0;
        while(numero != numeroInteiroAleatorio){
            numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(1,101);
            System.out.println(numeroInteiroAleatorio);
            i++;
            
            if(numero == numeroInteiroAleatorio){
                if(numeroSorteado){
                    posicao = i;
                     numeroSorteado = false;

                }
            }
            
            if(numeroInteiroAleatorio % 2 == 0){
                numerosPares++;
          }
            
            if(numeroInteiroAleatorio % 2 == 0){
                numerosImpares++;
            }
        }
        
        System.out.println(String.format("Posição do número sortiado: %d "
                + "\nNúmeros pares: %d "
                + "\nNúmmeros ímpares: %d", posicao, numerosPares, numerosImpares));
    }
}
