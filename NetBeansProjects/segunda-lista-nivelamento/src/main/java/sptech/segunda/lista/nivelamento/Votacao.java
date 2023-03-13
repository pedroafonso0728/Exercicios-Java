/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.segunda.lista.nivelamento;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class Votacao {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Cardápio:\nSabor: Mussarela = 5 "
                + "\nSabor: Clabresa = 25 "
                + "\nSabor: Quatro queijos = 50 \nVote colocando o valor da pizza: ");
        Integer sabor = leitor.nextInt();

        Integer pizzaMussarela = 0;
        Integer pizzaCalabrsa = 0;
        Integer pizzaQuatroQueijos = 0;

        String pizzaFavotitaM = "Mussarela";
        String pizzaFavotitaC = "Calabresa";
        String pizzaFavotita4 = "Quatro queijos";

        for (int i = 1; i <= 10; i++) {
            switch (sabor) {
                case 5:
                    pizzaMussarela++;
                    break;
                case 25:
                    pizzaCalabrsa++;
                    break;
                case 50:
                    pizzaQuatroQueijos++;
                    break;
                default:
                    if (sabor != 5 || sabor != 25 || sabor != 50) {
                        System.out.println("Número inválido, tente novamente!");
                        i--;
                    }
            }

            sabor = leitor.nextInt();
        }

        System.out.println(String.format("Total de votos de mussarela: %d "
                + "\nTotal de votos de calabresa: %d "
                + "\nTotal de votos de quatro queijos: %d",
                pizzaMussarela, pizzaCalabrsa, pizzaQuatroQueijos));

        if (pizzaMussarela > pizzaCalabrsa && pizzaMussarela > pizzaQuatroQueijos) {
            System.out.println(String.format("Sua pizza favotita é de: %s", pizzaFavotitaM));
        } 
        else if (pizzaCalabrsa > pizzaMussarela && pizzaCalabrsa > pizzaQuatroQueijos) {
            System.out.println(String.format("Sua pizza favotita é de: %s", pizzaFavotitaC));
        } 
        else {
            System.out.println(String.format("Sua pizza favotita é de: %s", pizzaFavotita4));
        }
    }
}
