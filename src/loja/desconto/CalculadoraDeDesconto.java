package loja.desconto;

import loja.imposto.Imposto;
import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
       Desconto desconto =
               new DescontoParaOrcamentoComMaisDeCincoItens(
                    new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                            new SemDesconto()));
       return desconto.calcular(orcamento);
    }
}

