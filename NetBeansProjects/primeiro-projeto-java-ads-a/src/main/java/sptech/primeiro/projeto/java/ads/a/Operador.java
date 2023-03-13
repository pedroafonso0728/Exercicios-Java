/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.java.ads.a;

/**
 *
 * @author mayar
 */
public class Operador {
    public static void main(String[] args) {
        
        // Soma: +
        // Subitração: -
        // Multiplicação: *
        // Divisão: /
        // Resto: %
        // Potência: 
        // += 
        // --
        // ++
        
        
        // Diferente do JS
        // Não temos
        // Potência:Math  
        
        Integer numero01 = 5;
        Integer numero02 = 2;
        
        // 01) Soma 
        Integer soma = numero01 + numero02;
        System.out.println("Soma com variável: " + soma); //Concatenação
        System.out.println("Soma no print: " + (numero01 + numero02));
        
        // 02) Subtração
        System.out.println("Subitração: " + (numero01 - numero02));
        
         // 03) Multiplicação
        System.out.println("Multiplicação: " + (numero01 * numero02));
        
         // 04) Subtração
        System.out.println("Divisão: " + (numero01 / numero02));
        
         // 05) Subtração
        System.out.println("Resto: " + (numero01 % numero02));
        
        // 06) Potência:
        Double potencia = Math.pow(5.0, 2.0);
        System.out.println("Potência: " + potencia);
        
        // Uma classe também pode ter vareáveis que nos ajudam
        System.out.println("Valor  de Pi: " + Math.PI);
        System.out.println("Qual o vale max. de um Integer: " + Integer.MAX_VALUE);
    }
}
