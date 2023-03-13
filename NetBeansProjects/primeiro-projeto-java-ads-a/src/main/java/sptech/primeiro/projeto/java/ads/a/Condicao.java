/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.primeiro.projeto.java.ads.a;

/**
 *
 * @author mayar
 */
public class Condicao {
    public static void main(String[] args) {
        Integer numero01 = 10;
        Integer numero02 = 42;
        
        if(numero01 > numero02){
            System.out.println("É maior!");
        } else if(numero01 < numero02){
            System.out.println("É menor!");
        } else if(numero01 == numero02){
            System.out.println("É igual!");
        }
        
        // Cuidado ao nomear!
        Boolean bloqueado = false;
        
        if(bloqueado){
            System.out.println("Ta bloqueado");
        } else {
            System.out.println("Ta desbloqueado");
        }
        
        // Diferentedo JS
        // == Pode dar errado
        // equals
        
        String nome01 = "Pedro";
        String nome02 = "Paulo";
        
        // SENsitive case
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("Nome igual!");
        } else {
            System.out.println("Nome diferente!");
        }
        
        // INSENsitive case
        if(nome01.equalsIgnoreCase(nome02)){
            System.out.println("Nome igual!");
        } else {
            System.out.println("Nome diferente!");
        }
    }
}
