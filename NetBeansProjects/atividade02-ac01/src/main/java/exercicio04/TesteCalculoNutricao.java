/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio04;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class TesteCalculoNutricao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        CalculoNutricao metodo = new CalculoNutricao();

        do {

            System.out.println("Digite o seu peso: ");
            Double peso = leitor.nextDouble();

            System.out.println("Digite sua altura: ");
            Double altura = leitor.nextDouble();

            metodo.calculaIMC(peso, altura);

        } while (true);
    }
}
