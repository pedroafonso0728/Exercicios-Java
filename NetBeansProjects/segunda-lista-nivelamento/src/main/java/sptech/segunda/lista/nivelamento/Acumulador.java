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
public class Acumulador {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        Integer numDigitado = leitor.nextInt();

        int soma = 0;
        while (numDigitado != 0) {
            System.out.println("Digite um número: ");
            soma += numDigitado;
            numDigitado = leitor.nextInt();
        };

        System.out.println("A soma dos números é " + soma);
    }
}
