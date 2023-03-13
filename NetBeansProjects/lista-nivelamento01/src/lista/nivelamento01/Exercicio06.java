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
public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu salário bruto: ");
        Double salarioBruto =  leitor.nextDouble();
        
        System.out.println("Quanto custa a condução diária só de ida da sua casa para o trabalho: ");
        Double conducaoDiaria =  leitor.nextDouble();
        
        Double descontoInss = (salarioBruto * 0.1);
        
        Double descontoIr = (salarioBruto * 0.2);
         
        Double descontoVt = (conducaoDiaria * 2 * 22);
         
        Double total = (descontoInss + descontoIr + descontoVt);
        
        Double liquido = (salarioBruto - total);
        
        System.out.println("Seu salário bruto é R$" + salarioBruto + ", tem um total de R$" 
                                 + total + " em descontos e receberá um líquido de R$" + liquido);
    }
}
