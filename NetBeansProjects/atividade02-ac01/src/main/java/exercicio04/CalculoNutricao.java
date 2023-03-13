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
public class CalculoNutricao {

    Double calculaIMC(Double peso, Double altura) {

        Double resultado = peso / (altura * altura);

        System.out.println(String.format("Ocalculo do seu IMC é: %.2f", resultado));
        return resultado;
    }
}
