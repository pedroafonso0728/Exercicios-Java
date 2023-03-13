/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author mayar
 */
public class DescontoProgressivo {

    void exibirLinha() {

        System.out.println("--------------------------------");
    }

    Double calcularDesconto(Double valorUnitario, Integer qtdProduto) {

        Double valorFinal;
        if (qtdProduto == 1) {
            valorFinal = valorUnitario * 0.1;
        } else if (qtdProduto == 2) {
            valorFinal = valorUnitario * 0.2 * qtdProduto;
        } else {
            valorFinal = valorUnitario * 0.3 * qtdProduto;
        }
        return valorFinal;
    }

    void exibirNotaFiscal(Double valorUnitario, Integer qtdProduto, Double valorFinal) {

        System.out.println(String.format(""
                + "Valor do produto: R$%.2f"
                + "\nQuantidade: %d", valorUnitario, qtdProduto));
        System.out.println(String.format("Valor com desconto: R$%.2f", valorFinal));
    }
}
