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
public class Potencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        Integer numInteiro = leitor.nextInt();

        System.out.println("Digite um nuúmero expoente: ");
        Integer numExpoente = leitor.nextInt();

        Integer resultado = 1;

        for (int i = 1; i <= numExpoente; i++) {
            resultado*=numInteiro;
        }
        System.out.println(String.format("O resultado de %d elevado a %d = %d",
                numInteiro, numExpoente, resultado));
    }
}
