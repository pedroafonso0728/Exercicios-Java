/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segundo.projeto.nivelamento;

/**
 *
 * @author mayar
 */
public class OperadorTernario {
    public static void main(String[] args) {
        Boolean bloqueado = true;
        
        String frase;
       // if(bloqueado){
         //   frase = "Usuário bloqueado";
        //} else {
          //  frase = "Usuário desbloqueado";
        //}
        
        frase = bloqueado ? "Usuário bloqueado" : "Usuário desbloqueado";
        
        System.out.println(frase);
        
        //Cenário: se o funcionário ganhasse mais de 1000.0
        //O bonus é de 0.15, se ganha menos de 1000.0
        //O bonus é de 0.15
        
        Double bonus;
        Double salario = 1078.50;
        
        bonus = salario > 1000.0 ? 0.15: 0.10;
        System.out.println("Bonus" + bonus);
        
    }
}
