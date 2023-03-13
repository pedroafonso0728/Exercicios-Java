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
public class Loteria {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número de 0 a 10: ");
        Integer numDigitado = leitor.nextInt();
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(1,11);
        System.out.println(numeroAleatorio);
        
       int contador = 0;
       while(numDigitado != numeroAleatorio ){
           System.out.println(numeroAleatorio);
           numeroAleatorio = ThreadLocalRandom.current().nextInt(1,11);
           contador++;
        }
       
       if(contador <= 3){
           System.out.println("Você é MUITO sortudo");  
       } else if (contador <= 10){
           System.out.println("Você é sortudo");
       } else {
           System.out.println("É melhor você parar de apostar e ir trabalhar");
       }
    }
}
