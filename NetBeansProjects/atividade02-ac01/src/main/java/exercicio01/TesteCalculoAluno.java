/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class TesteCalculoAluno {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        CalculoAluno metodo = new CalculoAluno();

        System.out.println("Digite sua primeira nota:");
        Double nota1 = leitor.nextDouble();

        System.out.println("Digite sua segunda nota:");
        Double nota2 = leitor.nextDouble();

        Double media = metodo.calcularMedia(nota1, nota2);

        System.out.println(String.format("Sua média é: %.2f", media));
    }
}
