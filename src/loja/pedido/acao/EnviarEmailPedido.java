package loja.pedido.acao;

import loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando emails com dados do pedido");
    }
}
