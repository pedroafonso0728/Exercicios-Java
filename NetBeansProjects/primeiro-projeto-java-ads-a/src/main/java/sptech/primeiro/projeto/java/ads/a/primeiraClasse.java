/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.java.ads.a;

/**
 *
 * @author mayar
 */
//aaaaa
//Classe são os arquivos que guardam o nosso código em Java
//Métodos em Java são equivalentes a funções em JS
//Argumentos em Java são equivalentes a parametros em JS
public class primeiraClasse {

    //Atalho: main + tab ou psvm + tab
    public static void main(String[] args) {
        //Console.log em Java
        //Atalho: sout + tab
        System.out.println("Olá Mundo");

        //Boolean bloqueado = false;
        //\t = tab
        //\n = br
        String nome = "Pedro";
        Integer idade = 22;
        Double altura = 1.76;
        Integer peso = 64;
        System.out.println("\tMeu número é: "
                + "" + nome + ", tenho "
                + idade + " e \ntenho " + altura
                + " de altura" + " e meu peso é " + peso + "kg");
        
        //Tipo primitivo vs Tipo wrapper
        
        int inteiroTipoPrimitivo;
        Integer inteiroTipoWrapper;
        
        
        //Tipos Wrapper são classes, logo possuem Métodos
        //Que vão ajudar :)
        //Tipos primitivos não :(
        //inteiroTipoPrimitivo.
        //inteiroTipoWrapper.
        
        //Outra diferença entre os dois:
        //Primitivos sempre possuem valor, mesmo que não inicializando
        //Wrapper não, não inicializou é NULL
        
        boolean boleanoPrimitivo; //Começa com false
        Boolean boleanoWrapper; //Começa com NULL
    }
}
