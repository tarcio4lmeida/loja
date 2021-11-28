package loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private int qtdItens;

    private BigDecimal valor;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
