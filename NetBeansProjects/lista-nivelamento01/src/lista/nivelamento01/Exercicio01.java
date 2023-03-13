/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista.nivelamento01;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Exercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu login: ");
                String qualSeuLogin = leitor.nextLine();
                
        System.out.println("Qual sua senha: ");
                Integer senhaDigitada = leitor.nextInt();
        
        System.out.println("Quantos erros antes do bloqueio da senha: ");
                Integer qtdDeErrosSenha = leitor.nextInt();
        
        System.out.println("Seu login é " + qualSeuLogin + 
                                 ", sua senha é " + senhaDigitada + ", Você tem " 
                                        + qtdDeErrosSenha +" tentativas antes de ser bloqueado");
    } 
}
