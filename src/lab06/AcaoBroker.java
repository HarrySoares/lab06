package lab06;
import java.util.ArrayList;
import java.util.List;

class AcaoBroker {
    private List<Acao> acoes;

    public AcaoBroker() {
        this.acoes = new ArrayList<>();
    }

    public void adicionarAcao(Acao acao) {
        acoes.add(acao);
    }

    public void removerAcao(Acao acao) {
        acoes.remove(acao);
    }

    public void comprarAcao(Investidor investidor, Acao acao) {
        double preco = acao.getPreco();
        System.out.println("Compra de ação: " + investidor.getNome() + " comprou ação " + acao.getNome() + " por " + preco);
    }

    public void venderAcao(Investidor investidor, Acao acao) {
        double preco = acao.getPreco();
        System.out.println("Venda de ação: " + investidor.getNome() + " vendeu ação " + acao.getNome() + " por " + preco);
    }
}