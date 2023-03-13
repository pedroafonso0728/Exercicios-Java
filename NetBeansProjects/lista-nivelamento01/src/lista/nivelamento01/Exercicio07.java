/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.nivelamento01;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o limite de peso de um elevador: ");
        Double limitePeso = leitor.nextDouble();
        
        System.out.println("Qual o limite de pessoas em um elevador : ");
        Integer limitePessoas = leitor.nextInt();

        System.out.println("Qual o o peso da 1ª pessoa que entrou no elevador: ");
        Double pessoa1 = leitor.nextDouble();
        
        System.out.println("Qual o o peso da 2ª pessoa que entrou no elevador: ");
        Double pessoa2 = leitor.nextDouble();
        
        System.out.println("Qual o o peso da 3ª pessoa que entrou no elevador: ");
        Double pessoa3 = leitor.nextDouble();
        
        Double total = (pessoa1 + pessoa2 + pessoa3);
       
        System.out.println("Entraram 3 pessoas no elevador, no qual cabem " + limitePessoas + 
                                 " pessoas. O peso total no elevador é de " + total + 
                                         ", sendo que ele suporta " + limitePeso + ".");

    }
}
