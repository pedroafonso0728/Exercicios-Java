/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.metodos;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Teste {

    public static void main(String[] args) {

        //String nome01 = "Pedro";
        //String nome02 = "Xampson";
        //Utilitaria util = new Utilitaria();
        Scanner leitor = new Scanner(System.in);

        //Calculadora calc = new Calculadora();
        Calculadora metodos = new Calculadora();
    
         System.out.println("Digite um número: ");
         Double numeroDigitado1 = leitor.nextDouble();
            
         System.out.println("Digite outro número: ");
         Double numeroDigitado2 = leitor.nextDouble();
         
        Double divisao = metodos.somarDivisao(numeroDigitado1, numeroDigitado2);
        Double subtracao = metodos.somarSubtracao(numeroDigitado1, numeroDigitado2);
        Double multiplicacao = metodos.somarMultiplicacao(numeroDigitado1, numeroDigitado2);

        //Para ter acesso aos métodos,
        //precisamos criar um objeto da classe 
        //onde esse método foi criado
        // Instânciar para transformar em objeto
        //Objeto
        //Chamar método = invocar
        //util.exibirNomeFormatado(nome01);
        //util.exibirNomeFormatado(nome02);

        //Usando a calculadora
        //Lembrar de guardar o retorno em uma
        //variável para usar
        //Double soma = calc.somar(10.0, 30.0);
        //System.out.println("Soma retornada: " + soma);

        
        
    
        
        System.out.println("Divisão retornada: " + divisao);
        Double somaDivisao = metodos.somarDivisao(numeroDigitado1, numeroDigitado2);

       
        System.out.println("Subtração retornada: " + subtracao);
        Double somaSubtracao = metodos.somarSubtracao(numeroDigitado1, numeroDigitado2);

       
        System.out.println("Multiplicação retornada: " + multiplicacao);
        Double somaMultiplicacao = metodos.somarMultiplicacao(numeroDigitado1, numeroDigitado2);
    }
}
