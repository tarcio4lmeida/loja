package loja;

import loja.imposto.CalculadoraDeImpostos;
import loja.imposto.ICMS;
import loja.imposto.ISS;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento  = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ISS()));
        System.out.println(calculadoraDeImpostos.calcular(orcamento, new ICMS()));
    }
}
