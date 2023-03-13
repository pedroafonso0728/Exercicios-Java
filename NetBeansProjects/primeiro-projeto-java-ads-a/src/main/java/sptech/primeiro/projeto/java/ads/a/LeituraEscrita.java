/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.java.ads.a;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class LeituraEscrita {
    public static void main(String[] args) {
        // Para ler valores do teclado 
        // Usamos a classe Scanner
        // Ler valores escritos no console
        
        //leitor não é uma simples variável 
        //E sim um OBJETO
        //Criar objeto = instãnciar
        //IN vai ler o teclado, Scanner
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nomeDigitado = leitor.nextLine();
        
        System.out.println("Palavra digitada " + nomeDigitado);
        
        System.out.println("Digite sua idade: ");
        Integer idadeDigitada = leitor.nextInt();
        
        System.out.println("Digite sua altura: ");
        Double alturaDigitada = leitor.nextDouble();
        
        System.out.println("Nome: " + nomeDigitado + "\nIdade: " + idadeDigitada + "\nAltura: " + alturaDigitada);
        
    }
}
