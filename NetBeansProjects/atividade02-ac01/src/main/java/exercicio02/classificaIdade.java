/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;

/**
 *
 * @author mayar
 */
public class classificaIdade {

    void faixaEtaria(Integer idade) {

         if (idade > -1  && idade < 3) {
            System.out.println("Bebê");
        }
        else if (idade > 2 && idade < 12) {
            System.out.println("Criança");
        }
        else  if (idade > 11 && idade < 20) {
            System.out.println("Adolecente");
        }
        else  if (idade > 19 && idade < 31) {
            System.out.println("Jovem");
        }
        else if (idade > 30 && idade < 61) {
            System.out.println("Adulto");
        } else {
            System.out.println("Idoso");
        }
    }
}
