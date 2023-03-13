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
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o seu nome: ");
        String nomeUsuario = leitor.nextLine();
        
        System.out.println("Olá, " + nomeUsuario + ". Qual o ano de seu nascimento?");
        Integer anoNasc = leitor.nextInt();
        
        Integer idade = (2030 - anoNasc);
        
        System.out.println("Em 2030 você terá " + idade + " anos");
    }
}
