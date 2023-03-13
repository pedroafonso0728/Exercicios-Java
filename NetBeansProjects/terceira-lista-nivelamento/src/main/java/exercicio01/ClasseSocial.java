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
public class ClasseSocial {
     
     Double calculoSalarioMinimo(Double salario){  
         
       Double calculoSalarioMinimo =  salario / 1045;
               
         return calculoSalarioMinimo;
     }  
     
   String classePessoa (Double salario){
       Double qtdSalario = calculoSalarioMinimo(salario);
       
        if(salario > 20){
           return "A";
       }if(salario > 10 && salario < 20){
           return "B";
       }if(salario >= 4 && salario < 10){
           return "C";
       }if(salario >= 2 && salario <=4){
           return "D";
       } else {
           return "E";
       }
   }
}
