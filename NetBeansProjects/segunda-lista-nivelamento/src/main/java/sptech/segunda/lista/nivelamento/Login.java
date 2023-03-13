/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Login {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual o seu nome: ");
        String login = leitor.nextLine();

        System.out.println("Qual a sua senha: ");
        String senha = leitor.nextLine();

        while (!login.equals("admin") || !senha.equals("#SPtech2022")) {
            System.out.println("Qual o seu nome: ");
            login = leitor.next();

            System.out.println("Qual a sua senha: ");
            senha = leitor.next();
            
            System.out.println("Login e/ou senha inválidos");
        }
        
            System.out.println("Login realizado com sucesso");
    }
}
