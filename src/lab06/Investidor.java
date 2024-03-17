package lab06;

class Investidor implements Observer {
    private String nome;
    private double precoMinimo;
    private double precoMaximo;

    public Investidor(String nome, double precoMinimo, double precoMaximo) {
        this.nome = nome;
        this.precoMinimo = precoMinimo;
        this.precoMaximo = precoMaximo;
    }

    public void atualizar(Acao acao) {
        double preco = acao.getPreco();
        if (preco >= precoMaximo) {
            System.out.println(nome + ": Preço máximo atingido para a ação " + acao.getNome() + ". Vendendo ações...");
            // Lógica para vender ações
        } else if (preco <= precoMinimo) {
            System.out.println(nome + ": Preço mínimo atingido para a ação " + acao.getNome() + ". Comprando ações...");
            // Lógica para comprar ações
        }
    }
}
   