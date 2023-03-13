/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.calculadora;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Calculadora {
   
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Integer operacao;

        Integer numeroInteiro;
       
        Double numIntPotencia = 0.0;

        Integer calculoRestoDivisao = 0;

        do {
            System.out.println("Digite o número correspondente a operação desejada:\n"
                    + "1 - Soma\n"
                    + "2 - Multiplicação\n"
                    + "3 - Divisão\n"
                    + "4 - Subtração\n"
                    + "5 - Potência\n"
                    + "6 - Resto de divisão\n"
                    + "0 – Sair");
            operacao = leitor.nextInt();

            if (operacao < 0 || operacao > 6) {
                System.out.println("Opção inválida, tente novamente\n");
            }

            switch (operacao) {
                case 1:
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = leitor.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(String.format("%d + %d = %d", numeroInteiro, i, numeroInteiro + i));
                    }
                    break;
                case 2:
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = leitor.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(String.format("%d * %d = %d",
                                numeroInteiro, i, numeroInteiro * i));
                    }
                    break;
                case 3:
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = leitor.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(String.format("%d / %d = %d",
                                numeroInteiro, i, numeroInteiro / i));
                    }
                    break;
                case 4:
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = leitor.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(String.format("%d - %d = %d",
                                numeroInteiro, i, numeroInteiro - i));
                    }
                    break;
                case 5:
                    Double calculoPotencia = 1.0;
                    System.out.println("Digite um número inteiro: ");
                    numIntPotencia = leitor.nextDouble();
                    for (double i = 1; i <= 10; i++) {
                        calculoPotencia *= numIntPotencia;
                        System.out.println(String.format("%.1f ^ %.1f = %.1f",
                                numIntPotencia, i, calculoPotencia));
                    }
                    break;
                case 6:
                    System.out.println("Digite um número inteiro: ");
                    numeroInteiro = leitor.nextInt();
                    for (int i = 1; i <= 10; i++) {
                        calculoRestoDivisao = (numeroInteiro % i);
                        System.out.println(String.format("%d resto de divisão "
                        + "de %d = %d",numeroInteiro, i, calculoRestoDivisao));
                    }
                    break;
                default:
                    if (operacao == 0) {
                        System.out.println("Até logo!");
                    }
            }
        } while (operacao != 0);
    }
}

