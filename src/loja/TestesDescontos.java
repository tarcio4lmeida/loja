package loja;

import loja.desconto.CalculadoraDeDesconto;
import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro  = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo  = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.println(calculadoraDeDesconto.calcular(primeiro));
        System.out.println(calculadoraDeDesconto.calcular(segundo));
    }
}
