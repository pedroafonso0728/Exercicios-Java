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
public class Exercicio05 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        Double primeiroNumero = leitor.nextDouble();
        
        System.out.println("Digite um segundo número: ");
        Double segundoNumero = leitor.nextDouble();
        
        Double soma = (primeiroNumero + segundoNumero);
        Double subtracao = (primeiroNumero - segundoNumero);
        Double multiplicacao = (primeiroNumero * segundoNumero);
        Double divisao = (primeiroNumero / segundoNumero);
        
        System.out.println("Resultado da soma: " + soma + 
                                 "\nResultado da subtração: " + subtracao + "\nResultado da multiplicação: " 
                                         + multiplicacao + "\nResultado da divisão: " + divisao); 
    }
}
