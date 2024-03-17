package lab06;
import java.util.ArrayList;
import java.util.List;

class Acao {
    private String nome;
    private double preco;
    private List<Investidor> investidores;

    public Acao(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.investidores = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
        notificarInvestidores();
    }

    public void adicionarInvestidor(Investidor investidor) {
        investidores.add(investidor);
    }

    public void removerInvestidor(Investidor investidor) {
        investidores.remove(investidor);
    }

    private void notificarInvestidores() {
        for (Investidor investidor : investidores) {
            investidor.atualizar(this);
        }
    }
}

