/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.metodos;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Calculadora {

    Double somar(Double numero01, Double numero02) {
        //Double soma = numero01 + numero02;
        return numero01 + numero02;
    }

    //Fça os métodos para: 
    //divisão, subtração e multiplicação
    //com retorno e 2 argumentos Double
    Double somarDivisao(Double numeroDigitado1, Double numeroDigitado2) {

        Double calculoDiv = numeroDigitado1 / numeroDigitado2;
        return calculoDiv;
    }

    Double somarSubtracao(Double numeroDigitado1, Double numeroDigitado2) {

        Double calculoSub = numeroDigitado1 - numeroDigitado2;
        return calculoSub;
    }

    Double somarMultiplicacao(Double numeroDigitado1, Double numeroDigitado2) {

        Double calculoMult = numeroDigitado1 * numeroDigitado2;
        return calculoMult;
    }
}
