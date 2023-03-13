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
public class TesteClasseSocial {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ClasseSocial metodos = new ClasseSocial();
        System.out.println("Digite sua renda: ");
        Double renda = leitor.nextDouble();

        Double qtdSalario = metodos.calculoSalarioMinimo(renda);
        String classeSocial = metodos.classePessoa(qtdSalario);

        String frase = String.format("Você recebe aproximadamente %.2f "
                + "salários-mínimos.\n"
                + "Você pertence a classe social: %s.", qtdSalario, classeSocial);
         System.out.println(frase);
    }
}
