/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sptech.projeto.individual.sprint.um.pedro.afonso;

import java.util.Scanner;

/**
 *
 * @author mayar
 */
public class ProjetoIndividual {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Utilitaria metodos = new Utilitaria();

        Double calculo;
        Integer opcao;
        Integer opcao2;
        Integer opcao3;
        Integer opcao4;
        Integer opcao4Resposta;
        Integer pontuacao = 0;

        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        do {
            metodos.exibirLinha();
            System.out.println(String.format("Bora entender um pouco sobre "
                    + "preservação de espécies, %s! "
                    + "escolha uma opção: \n"
                    + "\n 1 - Quais são os números de extinção?"
                    + "\n 2 - Por que preservar ?"
                    + "\n 3 - Como preservar ?"
                    + "\n 4 - Teste seu conecimento: "
                    + "\n 5 - Ver minha pontuação do teste:"
                    + "\n 0 - Sair", nome));
            metodos.exibirLinha();
            opcao = leitor.nextInt();

            if (opcao < 0 || opcao > 5) {
                System.out.println(String.format("Opção inválida, %s! "
                        + "Tente novamente!", nome));
            }

            switch (opcao) {
                case 1:
                    System.out.println("Atualmente á cerca de 2.000.000 milhões "
                            + "de espécies catalogadas no mundo e uma pesquisa "
                            + "afirma que 0,1% "
                            + "dessas espécies são extintas por ano!\n");

                    System.out.println("Com isso, qual seria a quantidade de "
                            + "espécies extintas por ano?");
                    Double chuteExtincao = leitor.nextDouble();

                    calculo = 0.1 * 2000000 / 100;

                    metodos.exibirLinha();
                    System.out.println(String.format("Independente do "
                            + "resultado que você colocou, %s, "
                            + "O importante é você entender o impacto do "
                            + "resultado real! "
                            + "\nO resultado seria %.2f mil espécies extintas "
                            + "por ano, "
                            + "\naqui podemos ver um perigo enorme quando não "
                            + "damos atenção ou "
                            + "cuidamos da fauna mundial! "
                            + "\nAgora vamos entender um "
                            + "pouco mais sobre essa fauna "
                            + "e sua importância:", nome, calculo));
                    metodos.exibirLinha();
                    break;
                case 2:
                    metodos.exibirLinha();
                    System.out.println("\n Vou te mostrar o impacto de três espécies de "
                            + "animais caso fossem extintas, escolha uma opção:"
                            + "\n 1 - Abelha"
                            + "\n 2 - Leão"
                            + "\n 3 - Arara-Azul");
                    opcao2 = leitor.nextInt();
                    metodos.exibirLinha();

                    for (int i = 0; i < 10; i++) {
                        if (opcao2 < 1 || opcao2 > 3) {
                            System.out.println("Opção inválida, %S! "
                                    + "Tente novamente!");
                            opcao2 = leitor.nextInt();
                        }
                    }
                    metodos.etruturasDeDecisoesCase2(opcao2);
                    break;
                case 3:
                    metodos.exibirLinha();
                    System.out.println(String.format("\n %s, Aqui vou te "
                            + "mostrar maneiras simples de "
                            + "como você pode ajudar na preservação, "
                            + "escolha uma opção: \n"
                            + "\n 1 - Sendo voluntário"
                            + "\n 2 - Jogando o lixo no lixo"
                            + "\n 3 - Doando"
                            + "\n 4 - Divulgando", nome));
                    opcao3 = leitor.nextInt();
                    metodos.exibirLinha();

                    for (int i = 0; i < 10; i++) {
                        if (opcao3 < 1 || opcao3 > 4) {
                            System.out.println(String.format("Opção inválida, %S! "
                                    + "Tente novamente!", nome));
                            opcao3 = leitor.nextInt();
                        }
                    }
                    metodos.etruturasDeDecisoesCase3(opcao3);
                    break;

                case 4:
                    metodos.exibirLinha();
                    System.out.println(String.format("Vamos testar seus "
                            + "conhecimentos, %s! Escolha o número da questão "
                            + "que deseja responder e "
                            + "\nvamos ver quantos pontos você vai conseguir "
                            + "no final(10 pontos cada acerto):"
                            + "\n 1 - Questão 1 --> O que faz parte de como "
                            + "preservar: "
                            + "\n 2 - Questão 2 --> Qual trecho está relacionado "
                            + "a extinção das abelhas: "
                            + "\n 3 - Questão 3 --> Qual trecho faz parte de "
                            + "jogar lixo no lixo: ", nome));
                    opcao4 = leitor.nextInt();
                    metodos.exibirLinha();

                    for (int i = 0; i < 10; i++) {
                        if (opcao4 < 1 || opcao4 > 3) {
                            System.out.println(String.format("Opção inválida, %S! "
                                    + "Tente novamente!", nome));
                            opcao4 = leitor.nextInt();
                        }
                    }

                    if (opcao4 == 1) {
                        System.out.println(""
                                + "\n 1 - Sendo voluntário, Jogando lixo no chão,"
                                + " Doando e Divulgando."
                                + "\n 2 - Jogando lixo no lixo, Doando, Prendendo"
                                + " e Sendo voluntário."
                                + "\n 3 - Doando, Divulgando, sendo voluntário e"
                                + " Jogando lixo no lixo.");
                        opcao4Resposta = leitor.nextInt();
                        for (int i = 0; i < 10; i++) {
                            if (opcao4 < 1 || opcao4 > 3) {
                                System.out.println(String.format("Opção inválida, %S! "
                                        + "Tente novamente!", nome));
                                opcao4 = leitor.nextInt();
                            }

                            if (opcao4Resposta == 1 || opcao4Resposta == 2) {
                                System.out.println(String.format("Ops %s :( Talvez você acerte "
                                        + "na proxima!", nome));

                            } else {
                                System.out.println(String.format("Muito bem, %s! Você tem 10 pontos!", nome));
                                pontuacao += 10;
                            }
                            break;
                        }
                    }
                    if (opcao4 == 2) {
                        System.out.println(""
                                + "\n 1 - Os insetos, coelhos e veados, também "
                                + "passariam fome e, por consequência, seriam extintos."
                                + "\n 2 - Os insetos, coelhos e veados, também "
                                + "passariam sede e, por consequência, seriam extintos."
                                + "\n 3 - Os insetos, coelhos e veados, ficariam "
                                + "com cansaço e, por consequência, seriam extintos.");
                        opcao4Resposta = leitor.nextInt();
                        for (int i = 0; i < 10; i++) {
                            if (opcao4 < 1 || opcao4 > 3) {
                                System.out.println(String.format("Opção inválida, %S! "
                                        + "Tente novamente!", nome));
                                opcao4 = leitor.nextInt();
                            }
                        }

                        if (opcao4Resposta == 2 || opcao4Resposta == 3) {
                            System.out.println(String.format("Ops %s :( Talvez você acerte "
                                    + "na proxima!", nome));

                        } else {
                            System.out.println(String.format("Muito bem, %s! Você tem 10 pontos! ", nome));
                            pontuacao += 10;
                        }
                        break;
                    }
                    if (opcao4 == 3) {
                        System.out.println(""
                                + "\n 1 - Além disso, o lixo "
                                + "polui os recursos naturais de todos. Faça "
                                + "a sua parte colocando o lixo no devido lugar."
                                + "\n 2 - Além disso, o lixo "
                                + "polui os recursos naturais de todos. Faça "
                                + "a sua parte colocando o lixo no chão."
                                + "\n 3 - Além disso, o lixo "
                                + "não polui os recursos naturais de todos. Faça "
                                + "a sua parte colocando o lixo no devido lugar.");
                        opcao4Resposta = leitor.nextInt();
                        for (int i = 0; i < 10; i++) {
                            if (opcao4 < 1 || opcao4 > 3) {
                                System.out.println(String.format("Opção inválida, %S! "
                                        + "Tente novamente!", nome));
                                opcao4 = leitor.nextInt();
                            }
                        }

                        if (opcao4Resposta == 2 || opcao4Resposta == 3) {
                            System.out.println(String.format("Ops %s :( Talvez você acerte "
                                    + "na proxima!", nome));

                        } else {
                            System.out.println(String.format("Muito bem, %s! Você tem 10 pontos! ", nome));
                            pontuacao += 10;
                        }
                    }
                    break;

                case 5:
                    System.out.println(String.format("Bora ver sua pontuação, %s! "
                            + "\n Sua pontuacão atual é: %d", nome, pontuacao));
                default:
                    if (opcao == 0) {
                        System.out.println(String.format("Até logo, %s! não se esqueca dos "
                                + "animais :)", nome));
                    }
            }
        } while (opcao != 0);
    }
}
