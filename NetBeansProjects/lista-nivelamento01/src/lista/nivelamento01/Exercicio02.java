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
public class Exercicio02 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Quantos filhos de 0 a 3 anos você possui: ");
        Integer qtdFilhos0a3 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 4 a 16 anos você possui: ");
        Integer qtdFilhos4a16 = leitor.nextInt();
        
        System.out.println("Quantos filhos de 17 a 18 anos você possui: ");
        Integer qtdFilhos17a18 = leitor.nextInt();
            
        
        Integer totalDeFilhos = (qtdFilhos0a3 + qtdFilhos4a16 + qtdFilhos17a18);
        Double bolsa = (qtdFilhos0a3 * 25.12);
        Double bolsa2 = (qtdFilhos4a16 * 15.88);
        Double bolsa3 = (qtdFilhos17a18 * 12.44);
        Double totalBolsa = (bolsa + bolsa2 + bolsa3);
        
        System.out.println("Você tem um total de " + totalDeFilhos + 
                                      " de filhos e vai receber R$" + totalBolsa + " de bolsa\"");
    }  
}
