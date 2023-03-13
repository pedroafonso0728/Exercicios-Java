/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class TesteIdade {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        classificaIdade metodo = new classificaIdade();

        System.out.println("Digite sua idade: ");
        Integer idade = leitor.nextInt();

        metodo.faixaEtaria(idade);
    }
}