/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.provalinguagemdeprogramacao;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class PedroAfonso {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Integer opcao;
        Double valorDeposito = 0.0;
        Double valorRetirado = 0.0;
        Double saldoMesAMes= 0.0;
        Double valorMenosARetirado= 0.0;
        

        do {
            System.out.println("Olá, o que deseja fazer ?\n"
                    + "\n 1 - Depositar"
                    + "\n 2 - Sacar"
                    + "\n 3 - Simular rendimentos"
                    + "\n 0 - Sair");
            opcao = leitor.nextInt();

            if (opcao < 0 || opcao > 3) {
                System.out.println("Opção inválida, tente novamente\n");
            }

            switch (opcao) {
                case 1:
                    System.out.println("Qual o valor a ser depositado: ");
                    valorDeposito = leitor.nextDouble();
                    if (valorDeposito > 0) {
                        System.out.println(String.format("Saldo atual: %.2f", valorDeposito));
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 2:
                    System.out.println("Qual o valor a ser retirado: ");
                    valorRetirado = leitor.nextDouble();
                    valorMenosARetirado = (valorDeposito - valorRetirado);
                    if (valorRetirado > 0) {
                        System.out.println(String.format("Saldo atual: %.2f", valorMenosARetirado));
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 3:
                    System.out.println(String.format("Slado atual: %.2f", valorDeposito));
                    saldoMesAMes = valorMenosARetirado * 0.1;
                    for (int i = 0; i <= 12; i++) {
                        System.out.println(String.format("Mês %d | Saldo atual: R$%.2f "
                                + "\nMês %d | Saldo: R$%.2f ", i, valorMenosARetirado, saldoMesAMes));
                    }
                    break;
                default:
                    if (opcao == 0) {
                        System.out.println("Até logo!");
                    }
            }

        } while (1>0);
    }
}
