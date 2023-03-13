/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class SwitchCase {
    public static void main(String[] args) {
        //Cenario: digite um numero 
        //e faça um print de qual dia 
        //da semana esse numero representa 
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite um número");
        Integer numDigitado = leitor.nextInt();
        
        
       switch(numDigitado) {
           case 1:
               System.out.println("Segundou");
               break;
           case 2:
               System.out.println("Terçou");
                break;
           case 3:
               System.out.println("Quartou");
                break;
           case 4:
               System.out.println("Quintou");
                break;
           case 5:
               System.out.println("Sextou");
                break;
                default:
                System.out.println("Número inválido");
       }
       
       String planoEscolhido = "Prata";
       
       switch(planoEscolhido){
           case "BRONZE":
            break;
            case "PRATA":
            break;
            case "OURO":
            break;
       }
    }
}
