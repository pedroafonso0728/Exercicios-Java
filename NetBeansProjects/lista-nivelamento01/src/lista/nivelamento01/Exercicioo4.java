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
public class Exercicioo4 {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
         
         System.out.println("Qual o valor unitário de um produto: ");
         Double valorUnitario = leitor.nextDouble();
         
         System.out.println("Qual a quantidade vendida: ");
         Double qtdVenda = leitor.nextDouble();
         
         System.out.println("Qual o valor pago pelo cliente: ");
         Double valorPago = leitor.nextDouble();
         
         Double totalPago = (valorUnitario * qtdVenda);
         Double troco = (valorPago - totalPago);
         
         System.out.println("Seu troco será de R$" + troco + 
                                    ", onde " + troco + " é o valor a ser devolvido ao cliente");
    }
}
