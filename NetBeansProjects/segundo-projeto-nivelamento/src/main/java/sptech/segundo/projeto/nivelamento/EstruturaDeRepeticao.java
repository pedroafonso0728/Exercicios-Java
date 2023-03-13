/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("de 0 a 10");
        
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
        
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        
        System.out.println("While - de 0 a 10");
        
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }
        
        System.out.println("While - adivinhe o número");
        
        System.out.println("Digite um número: ");
        Integer numDigitado = leitor.nextInt();
        
        while(numDigitado != 42){
            System.out.println("Adivinhe o número: ");
            numDigitado = leitor.nextInt();
        }
        
        System.out.println("Acertou");
        
        //Do while (um outro tipo de estrutura de repetição)
        System.out.println("Do while - adivinhe o número: ");
        
        System.out.println("Digite um número: ");
        Integer numDigitado2 = leitor.nextInt();
        
        do{
           System.out.println("Digite um número: ");
           numDigitado2 = leitor.nextInt();
        }while(numDigitado2 != 42);
    } 
}
