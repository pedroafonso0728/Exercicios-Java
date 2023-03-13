/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio05;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class TesteValidacaoNumerica {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        ValidacaoNumerica metodo = new ValidacaoNumerica();

        Integer numero = 0;
        Integer count = 0;

        do {
            System.out.print("Digite um número positivo (ou negativo para sair): ");
            numero = leitor.nextInt();
            if (numero >= 0) {
                metodo.verificarPrimo(numero, count);
            }
        } while (numero > 0);
        System.out.println("Programa encerrado.");
    }
}
