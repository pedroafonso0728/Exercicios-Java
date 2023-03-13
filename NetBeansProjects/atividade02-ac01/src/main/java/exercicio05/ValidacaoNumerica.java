/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio05;

/**
 *
 * @author mayar
 */
public class ValidacaoNumerica {
    
     void verificarPrimo(Integer numero, Integer count) {
        
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println(String.format(" é um número primo.", numero));
        } else {
            System.out.println(String.format(" não é um número primo.", numero));
        }
    }
}
