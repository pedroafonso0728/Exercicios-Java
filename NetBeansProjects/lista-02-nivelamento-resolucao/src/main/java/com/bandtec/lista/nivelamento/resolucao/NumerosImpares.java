package com.bandtec.lista.nivelamento.resolucao;

public class NumerosImpares {

    public static void main(String[] args) {

        for (Integer i = 0; i < 90; i++) {

            if (!(i % 2 == 0)) {
                System.out.println(String.format("-> %d", i));
            }
        }

        //outra solução (GAMBIARRA)
//        for (Integer i = 1; i < 10; i += 2) {
//            System.out.println(String.format("-> %d", i));
//        }
    }
}
