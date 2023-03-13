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
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Qual o seu nome: ");
        String nomeUsuario = leitor.nextLine();
        
        System.out.println("Qual foi a sua primeira nota: ");
        Double nota1 = leitor.nextDouble();
        
        System.out.println("Qual foi a sua segunda nota: ");
        Double nota2 = leitor.nextDouble();
        
        Double media = ((nota1 + nota2) / 2);
        
        System.out.println("Olá, " + nomeUsuario + ". Sua média foi de " + media);
        
    }
}
