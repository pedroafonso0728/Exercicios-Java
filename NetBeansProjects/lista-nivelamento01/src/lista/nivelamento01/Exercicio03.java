/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lista.nivelamento01;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Exercicio03 {
    public static void main(String[] args) {
        
         Scanner leitor = new Scanner(System.in);
        
         System.out.println("Quanto tempo, em minutos que você passou se aquecendo: ");
         Double tempoEmMinutosAquecendo = leitor.nextDouble();
         
         System.out.println("Quanto tempo em minutos você fez exercícios aeróbicos: ");
         Double tempoEmMinutosAerobicos = leitor.nextDouble();
         
         System.out.println("Quanto tempo em minutos você fez exercícios de musculação: ");
         Double tempoEmMinutosMusculacao = leitor.nextDouble();
         
         Double totalMinutos = (tempoEmMinutosAquecendo + tempoEmMinutosAerobicos + tempoEmMinutosMusculacao);
         Double caloriasAquecimento = (tempoEmMinutosAquecendo * 12);
         Double aquecimentoAerobicos = (tempoEmMinutosAerobicos * 20);
         Double aquecimentoMusculacao = (tempoEmMinutosMusculacao * 25);
         Double totalCaloriasPerdidas = (caloriasAquecimento + aquecimentoAerobicos + aquecimentoMusculacao);
         
         System.out.println("Olá, Pedro. Você fez um total de " + totalMinutos + 
                                   " minutos de exercícios e perdeu cerca de " 
                                        + totalCaloriasPerdidas + " calorias");
    }   
}
