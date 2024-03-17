package lab06;

public class Lab06 {
 public static void main(String[] args) {
        Acao acao = new Acao("AAPL", 150.0);
        Investidor investidor1 = new Investidor("João", 140.0, 160.0);
        Investidor investidor2 = new Investidor("Maria", 145.0, 155.0);

        acao.adicionarInvestidor(investidor1);
        acao.adicionarInvestidor(investidor2);

        
        acao.setPreco(255.0);
        acao.setPreco(140.0);
    }
}