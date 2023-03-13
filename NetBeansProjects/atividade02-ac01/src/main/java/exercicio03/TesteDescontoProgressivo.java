/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class TesteDescontoProgressivo {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        DescontoProgressivo metodo = new DescontoProgressivo();

        System.out.println("Bem-vindo ao sistema de desconto progressivo!\n");

        System.out.println("Qual o valor unitário do produto:");
        Double valorUnitario = leitor.nextDouble();

        System.out.println("Qual a quatidade do produto:");
        Integer qtdProduto = leitor.nextInt();

        Double calculoFinal = metodo.calcularDesconto(valorUnitario, qtdProduto);
        metodo.exibirLinha();
        metodo.exibirNotaFiscal(valorUnitario, qtdProduto, calculoFinal);
        metodo.exibirLinha();
    }
}
