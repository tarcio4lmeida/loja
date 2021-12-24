package loja.orcamento;

import loja.orcamento.situacao.EmAnalise;
import loja.orcamento.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private int qtdItens;
    private BigDecimal valor;
    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

}
