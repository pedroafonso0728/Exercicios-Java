/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.metodos;

/**
 *
 * @author mayar
 */
public class Utilitaria {
    //Método:
    //Retorno:esse não tem, é void
    //Nome: exibirLinha (camelCase, igual variável)
    //Argumento:dentro dos (), esse não tem 
    //Corpo: dentro das {}

    //Método sem valor - Sempre sendo um verbo, uma ação
    void exibirLinha() {
        //código do método
        System.out.println("*-------*--------*");
    }

    void exibirNome(String nome) {
        System.out.println("Nome é: " + nome);
    }

    //Podemos chamar método dentro de método
    void exibirNomeFormatado(String nome) {
        exibirLinha();
        exibirNome(nome);
        exibirLinha();
    }
}
