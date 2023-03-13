/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author mayar
 */
public class NumeroAleatorio {
    public static void main(String[] args) {
        
        //No java temos a classe Math.random
        //Mas precisamos criar objeto, tipo Scanner
        
        //Inteiro aleatorio:
        Integer numeroInteiroAleatorio = ThreadLocalRandom.current().nextInt(1,100);
        
        System.out.println("Aleatorio inteiro:" + numeroInteiroAleatorio);
        
        Double numeroQuebradoAleatorio = ThreadLocalRandom.current().nextDouble(1.3,30.7);
        
        System.out.println(String.format("Double aleatorio: %.3f", numeroQuebradoAleatorio));
    }
}
